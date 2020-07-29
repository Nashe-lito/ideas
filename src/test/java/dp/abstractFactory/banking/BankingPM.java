package dp.abstractFactory.banking;

import dp.abstractFactory.PM;

public class BankingPM implements PM {
  @Override
  public void manageProject() {
    System.out.println("Banking PM manages banking project");
  }
}
