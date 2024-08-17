package base;

import java.io.FileInputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;

import org.openqa.selenium.support.ui.WebDriverWait;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class TestBase {

	public static AndroidDriver driver;
	public static Properties config;
	public static WebDriverWait wait;

	public TestBase() throws IOException {

		config = new Properties();
		FileInputStream fis = new FileInputStream("./src/main/java/configuration/config.properties");
		config.load(fis);
	}

	public static void initialization() throws MalformedURLException{

		UiAutomator2Options options = new UiAutomator2Options()
				.setUdid("dcc35416")
				.withBrowserName(config.getProperty("browser"));

		driver = new AndroidDriver(new URL("http://127.0.0.1:4723"), options);

		driver.get(config.getProperty("url"));

	}
}