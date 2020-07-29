package dp.decorator;

public class JavaTeamLead extends DeveloperDecorator {
  public JavaTeamLead(Developer developer){
    super(developer);
  }

  public String sendWeekReport() {
    return "Wend week report documentation. ";
  }

  @Override
  public String makeJob() {
    return super.makeJob() + sendWeekReport();
  }
}
