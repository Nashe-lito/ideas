package dp.abstractFactory;

import dp.abstractFactory.website.WebsiteProjectTeamFactory;

public class WebSite {
  public static void main(String[] args) {

    ProjectTeamFactory projectTeamFactory = new WebsiteProjectTeamFactory();
    Developer teamLead = projectTeamFactory.getFirstDeveloper();
    Developer developer = projectTeamFactory.getSecondDeveloper();
    QA qa = projectTeamFactory.getQA();
    PM pm = projectTeamFactory.getPM();

    System.out.println("Creating website project");

    teamLead.writeCode();
    developer.writeCode();
    qa.testCode();
    pm.manageProject();
  }
}
