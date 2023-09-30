public class App {
    public static void main(String[] args) throws Exception {
        /* пишем логи */
        ProgramLogger.getProgramLogger().addLogInfo("Какие-то данные...");
        ProgramLogger.getProgramLogger().addLogInfo("Ещё какие-то данные...");
        ProgramLogger.getProgramLogger().addLogInfo("Снова инфа...");

        /* Отображаем логи */
        ProgramLogger.getProgramLogger().showLogFile();
    }
}
