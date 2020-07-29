package dp.singleton;

public class ProgramLogger {
private static ProgramLogger programLogger; // создали экземпляр
private static String logFile = "This is logFile"; // создали строку (запись файла)
public static synchronized ProgramLogger getInstance(){
  if (programLogger == null){
    programLogger = new ProgramLogger();
  } return programLogger;
}

private ProgramLogger() { // создали приватный пустой конструктор

}
public void addLogInfo(String logInfo) {
  logFile += logInfo;
}

public void showLogInfo() {
  System.out.println(logFile);
}
}
