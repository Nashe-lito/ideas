package dp.abstractFactory.website;

import dp.abstractFactory.Developer;
import dp.abstractFactory.PM;
import dp.abstractFactory.ProjectTeamFactory;
import dp.abstractFactory.QA;

public class WebsiteProjectTeamFactory implements ProjectTeamFactory {

  @Override
  public Developer getFirstDeveloper() {
    return new PhpDeveloper();
  }

  @Override
  public Developer getSecondDeveloper() {
    return new PhpDeveloper();
  }

  @Override
  public QA getQA() {
    return new WebsiteQA();
  }

  @Override
  public PM getPM() {
    return new WebsitePM();
  }
}
