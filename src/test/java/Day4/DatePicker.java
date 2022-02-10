package Day4;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePicker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.path2usa.com/travel-companions");
		
		//to focus on Date field
		driver.findElement(By.xpath("//input[@id='travel_date']")).sendKeys("02/20/2022");
		// to fetch particular date from datepicker
		WebElement activeday=driver.findElement(By.className("active day"));
		List<WebElement> dates=driver.findElements(By.className("day"));
		dates.add(activeday);
		int count=dates.size();
		System.out.println("Total day:"+count);
		
		//24 jan
		
		for(int i=0;i<count;i++)
		{
			String text=dates.get(i).getText();
			if(text.equalsIgnoreCase("20"))
			{
				dates.get(i).click();
				break;
			}
			
		}
		

	}

	

}
