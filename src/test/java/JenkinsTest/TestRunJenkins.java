package JenkinsTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestRunJenkins {

	//public static void main(String[] args) {
		@Test
		public static void test() {
		WebDriverManager.chromedriver().setup();
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.navigate().to("https://www.google.co.in");
		d.findElement(By.xpath("//input[@name='q']")).sendKeys("worldtour");
		//d.findElement(By.xpath("(//input[@value='Google Search'])[2]")).click();

	}

}
