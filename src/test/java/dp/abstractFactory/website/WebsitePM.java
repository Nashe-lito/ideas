package dp.abstractFactory.website;

import dp.abstractFactory.PM;

public class WebsitePM implements PM {

  @Override
  public void manageProject() {
    System.out.println("WebsitePM manages Website project");
  }
}
