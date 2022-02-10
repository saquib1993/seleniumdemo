package day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.rediff.com/");
		String title=driver.getTitle();
		System.out.println(title);
		String expectedTitle ="Google";
        if(title.equals(expectedTitle))
        {
        	System.out.println("landed on correct page");
        }
        else {
        	System.out.println("wrong page");
        }
	}

}
