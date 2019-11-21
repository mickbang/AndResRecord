

/**
 * 懒加载fragment
 */
abstract class BaseLazyFragment : Fragment() {
    
    lateinit var mContext: Context
    private var mRootView: View? = null
    private var isVisibleToUser: Boolean = false
    private var isFirstGetData: Boolean = true
    private var isInit: Boolean = false


    override fun onAttach(context: Context?) {
        super.onAttach(context)
        if (context != null) {
            mContext = context
        }
    }

    override fun setUserVisibleHint(isVisibleToUser: Boolean) {
        super.setUserVisibleHint(isVisibleToUser)
        this.isVisibleToUser = isVisibleToUser
        lazyInitData()
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        if (mRootView == null) {
            mRootView = inflater.inflate(getLayoutResId(), container, false)
        }
        return mRootView
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        if (mRootView != null) {
            init(mRootView)
            setOnClick()
            isInit = true
            lazyInitData()
        }
    }

    private fun lazyInitData() {
        if (isInit && mRootView != null) {
            if ((isRealTimeRefreshSwitch() || isFirstGetData) && isVisibleToUser) {
                isFirstGetData = false
                loadData()
            }
        }
    }

    /**
     * 是否每次刷新
     *  @return true 每次刷新
     *          false
     */
    open fun isRealTimeRefreshSwitch(): Boolean {
        return false
    }

    open fun setOnClick() {

    }

    abstract fun getLayoutResId(): Int
    abstract fun init(rootView: View?)
    abstract fun loadData()

}
