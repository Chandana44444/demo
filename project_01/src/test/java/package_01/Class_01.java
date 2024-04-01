package package_01;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Class_01 {
@Test
public void login() {
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://in.via.com/");
}
}
