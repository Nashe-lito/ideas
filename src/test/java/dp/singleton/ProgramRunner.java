package dp.singleton;

public class ProgramRunner {
  public static void main(String[] args) {
    ProgramLogger.getInstance().addLogInfo("1");
    ProgramLogger.getInstance().addLogInfo("2");

    ProgramLogger.getInstance().showLogInfo();
  }
}
