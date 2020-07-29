package dp.abstractFactory.banking;

import dp.abstractFactory.Developer;

public class JavaDeveloper implements Developer {
  @Override
  public void writeCode(){
    System.out.println("Java dev writes java code");
  }
}
