package day1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindCountOfLink {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.rediff.com/");
		List<WebElement> allLinks = driver.findElements(By.tagName("a"));


		for(WebElement link:allLinks){
		System.out.println(link.getText() + " - " + link.getAttribute("href"));
		}
	}

}
