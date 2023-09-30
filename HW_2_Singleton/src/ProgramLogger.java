public class ProgramLogger {
    private static ProgramLogger programLogger;
    private static String logFile = "This is log file. \n\n";

    /* Многопоточность (synchronized) */

    public static synchronized ProgramLogger getProgramLogger() {
        if (programLogger == null) {
            programLogger = new ProgramLogger();
        }

        return programLogger;
    }
    /*
     * Информация, которая будет в log file
     */

    private ProgramLogger() {
    }
    /* Отображеие */

    public void addLogInfo(String logInfo) {
        logFile += logInfo + "\n";
    }

    public void showLogFile() {
        System.out.println(logFile);
    }
}
