public class VersionUtil {
    public static int[] getCanonicalVersion(String version) {
        String[] v = version.split("\\.");
        //版本从1.0开始
        int[] canonicalVersion = new int[]{1, 0, 0, 0};
        for (int i = 0; i < v.length; i++) {
            if (i<canonicalVersion.length) {
                canonicalVersion[i] = Integer.parseInt(v[i]);
            }else {
                break;
            }
        }
        return canonicalVersion;
    }

    /**
     *
     * @param version1 服务器版本
     * @param version2 目前版本
     * @return  version1>version2 1
     *          version1<version2 -1
     *          version1==version2 0
     */
    public static int compare(String version1, String version2) {
        int[] canonicalVersion1 = getCanonicalVersion(version1);
        int[] canonicalVersion2 = getCanonicalVersion(version2);
        if (canonicalVersion1[0] < canonicalVersion2[0]) {
            return -1;
        } else if (canonicalVersion1[0] > canonicalVersion2[0]) {
            return 1;
        } else if (canonicalVersion1[1] < canonicalVersion2[1]) {
            return -1;
        } else if (canonicalVersion1[1] > canonicalVersion2[1]) {
            return 1;
        } else if (canonicalVersion1[2] < canonicalVersion2[2]) {
            return -1;
        } else if (canonicalVersion1[2] > canonicalVersion2[2]) {
            return 1;
        } else if (canonicalVersion1[3] < canonicalVersion2[3]) {
            return -1;
        } else {
            return canonicalVersion1[3] > canonicalVersion2[3] ? 1 : 0;
        }
    }
}
