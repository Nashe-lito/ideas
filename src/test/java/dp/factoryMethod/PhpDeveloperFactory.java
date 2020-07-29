package dp.factoryMethod;

public class PhpDeveloperFactory implements DeveloperFactory {
  @Override
  public Developer createDeveloper() {
    return new PhpDeveloper();
  }
}
