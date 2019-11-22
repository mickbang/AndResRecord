# AndResRecord
平常android开发过程中经常使用的库,持续更新中
## 一.常用的三方库
1. 沉浸式状态栏库:[immersionbar](https://github.com/gyf-dev/ImmersionBar)
2. 日历控件:[calendarview](https://github.com/huanghaibin-dev/CalendarView)
3. 强大的图表库:[MPAndroidChart](https://github.com/PhilJay/MPAndroidChart)
4. 集合了各种utils的库:[AndroidUtilCode](https://github.com/Blankj/AndroidUtilCode)
5. 水流特效:[waveView](https://github.com/gelitenight/WaveView)  
&nbsp;
![waveView](https://github.com/mickbang/WaveView/raw/master/screenshot.gif)
&nbsp;
6. Android上拉加载下拉刷新:[SmartRefreshLayout](https://github.com/scwang90/SmartRefreshLayout)
7. Android RecyclerView适配器:[BRVA](https://github.com/CymChad/BaseRecyclerViewAdapterHelper)
8. 视频播放器:[ijkplayer](https://github.com/bilibili/ijkplayer) [ExoPlayer](https://github.com/google/ExoPlayer) [GSYVideoPlayer](https://github.com/CarGuo/GSYVideoPlayer) [JiaoZiVideoPlayer](https://github.com/lipangit/JiaoZiVideoPlayer)
9. material风格的dialog:[material-dialogs](https://github.com/afollestad/material-dialogs)
10. Android可伸缩布局:[flexbox-layout](https://github.com/google/flexbox-layout)  
&nbsp;
![flexbox-layout](https://github.com/google/flexbox-layout/raw/master/assets/flexbox-layoutmanager.gif)
&nbsp;
11. 圆形图片控件:[CircleImageView](https://github.com/hdodenhof/CircleImageView)
12. 滴滴研发助手:[DoraemonKit](https://github.com/didi/DoraemonKit)
13. 路由框架:[ARouter](https://github.com/alibaba/ARouter)
14. 图片压缩:[Luban](https://github.com/Curzibn/Luban)
15. 动画框架:[AndroidViewAnimations](https://github.com/daimajia/AndroidViewAnimations)
16. 图片视频选择库:[知乎Matisse](https://github.com/zhihu/Matisse) [PictureSelector](https://github.com/LuckSiege/PictureSelector)
17. 权限管理: [PermissionsDispatcher](https://github.com/permissions-dispatcher/PermissionsDispatcher) [RxPermissions](https://github.com/tbruyelle/RxPermissions)
18. 文件下载器: [FileDownloader](https://github.com/lingochamp/FileDownloader)
19. mvp快速搭建: [MVPArms](https://github.com/JessYanCoding/MVPArms)
20. 加载中的loading效果: [AVLoadingIndicatorView](https://github.com/81813780/AVLoadingIndicatorView)
21. 屏幕适配: [今日头条终极方案AndroidAutoSize](https://github.com/JessYanCoding/AndroidAutoSize)
22. 修改glide加载图片的效果(圆形/圆角):[glide-transformations](https://github.com/wasabeef/glide-transformations)
23. 好用的tabBar: [SmartTabLayout](https://github.com/ogaclejapan/SmartTabLayout)
## 二.常用的代码片段
1. 点击两次退户app  
```
    private static final int TIME_EXIT=2000;
    private long mBackPressed;

    @Override
    public void onBackPressed(){
        if(mBackPressed+TIME_EXIT>System.currentTimeMillis()){
            super.onBackPressed();
            return;
        }else{
            Toast.makeText(this,"再点击一次返回退出程序",Toast.LENGTH_SHORT).show();
            mBackPressed=System.currentTimeMillis();

        }
    }
```
