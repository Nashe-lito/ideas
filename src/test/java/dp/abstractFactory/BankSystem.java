package dp.abstractFactory;

import dp.abstractFactory.banking.BankingProjectTeamFactory;

public class BankSystem {
  public static void main(String[] args) {
    ProjectTeamFactory projectTeamFactory = new BankingProjectTeamFactory();
    Developer teamLead = projectTeamFactory.getFirstDeveloper();
    Developer developer = projectTeamFactory.getSecondDeveloper();
    QA qa = projectTeamFactory.getQA();
    PM pm = projectTeamFactory.getPM();

    System.out.println("Creating banking project");

    teamLead.writeCode();
    developer.writeCode();
    qa.testCode();
    pm.manageProject();
  }
}
