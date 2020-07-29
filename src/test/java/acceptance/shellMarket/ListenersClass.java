
package acceptance.shellMarket;

import io.qameta.allure.Attachment;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.io.File;
import java.io.IOException;

public class ListenersClass extends WebDriverSetting implements ITestListener {
    @Override
    public void onStart(ITestContext arg) {
        System.out.println("Start" + arg.getName());
    }

    public void onFinish(ITestContext arg) {
        System.out.println("Finish " + arg.getName());
    }

    @Override
    public void onTestStart(ITestResult arg0) {
        System.out.println("Test Start " + arg0.getName());
    }

    @Override
    public void onTestSkipped(ITestResult arg0) {
        System.out.println("Test Skipped " + arg0.getName());
    }

    @Override
    public void onTestSuccess(ITestResult arg0) {
        System.out.println("Test Success " + arg0.getName());
    }

    @Override
    public void onTestFailure(ITestResult arg0) {
        System.out.println("Test Failure " + arg0.getName());
    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {

    }

    @Override
    public void onTestFailedWithTimeout(ITestResult arg0) {

    }



/*  @Attachment(value = "Page screenshot", type = "image/png")
    public byte[] saveScreenshot(byte[] screenShot) {
      return screenShot;
    }*/

}
