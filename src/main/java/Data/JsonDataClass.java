package Data;

public class JsonDataClass {

    private  static String initFile = "init.json";
    private  static String finishAuthorizeFile = "finishAuthorize.json";
    private  static String getStateFile = "getState.json";

    public static String getInitFile() {
        return initFile;
    }

    public static String getFinishAuthorizeFile() {
        return finishAuthorizeFile;
    }

    public static String getGetStateFile() {
        return getStateFile;
    }

    public static void setInitFile(String initFile) {
        JsonDataClass.initFile = initFile;
    }

    public static void setFinishAuthorizeFile(String finishAuthorizeFile) {
        JsonDataClass.finishAuthorizeFile = finishAuthorizeFile;
    }

    public static void setGetStateFile(String getStateFile) {
        JsonDataClass.getStateFile = getStateFile;
    }
}
