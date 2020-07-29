package dp.builder;

public class VisitCardWebsiteBuilder extends WebsiteBuilder {
  @Override
  void buildName(){
    website.setName("Visit Card");
  }

  @Override
  void buildCms(){
    website.setCms(Cms.WORDPRESS);
  }
}
