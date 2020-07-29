package dp.builder;

import static dp.builder.Cms.ALIFRESCO;

public class EnterpriseWebsiteBuilder extends WebsiteBuilder{
  @Override
  void buildName(){
    website.setName("Enterprise Website");
  }

  @Override
  void buildCms(){
    website.setCms(Cms.ALIFRESCO);
  }
}
