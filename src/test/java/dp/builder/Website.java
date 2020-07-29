package dp.builder;

public class Website {
  private String name;
  private Cms cms;
  public void setName(String name) {
    this.name = name;
  }

  public void setCms(Cms cms) {
    this.cms = cms;
  }

  @Override
  public String toString() {
    return "Website{" +
            "name='" + name + '\'' +
            ", cms=" + cms +
            '}';
  }
}
