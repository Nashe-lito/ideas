package dp.abstractFactory.banking;

import dp.abstractFactory.Developer;
import dp.abstractFactory.PM;
import dp.abstractFactory.ProjectTeamFactory;
import dp.abstractFactory.QA;

public class BankingProjectTeamFactory implements ProjectTeamFactory {
  @Override
  public Developer getFirstDeveloper() {
    return new JavaDeveloper();
  }

  @Override
  public Developer getSecondDeveloper() {
    return new JavaDeveloper();
  }

  @Override
  public QA getQA() {
    return new BankingQA();
  }

  @Override
  public PM getPM() {
    return new BankingPM();
  }
}
