package dp.builder;

public abstract class WebsiteBuilder {
  Website website;

  void createWebsite(){
    website = new Website();
  }

  abstract void buildName();
  abstract void buildCms();

  Website getWebsite(){
    return website;
  }

}
