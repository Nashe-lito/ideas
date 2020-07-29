package dp.abstractFactory;

public interface ProjectTeamFactory {
  Developer getFirstDeveloper();
  Developer getSecondDeveloper();
  QA getQA();
  PM getPM();
}
