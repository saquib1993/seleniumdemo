package day1;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FetchingPageSourceInToFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/search?q=yahoo&rlz=1C1GCEB_enIN977IN977&oq=yahoo&aqs=chrome..69i57j46i131i199i433i465i512j0i131i433i512l3j0i433i512j0i131i433i512j0i433i512.2615j0j7&sourceid=chrome&ie=UTF-8");
		String source=driver.getPageSource();

		File file=new File(".//Files//mypagesource.txt");
		FileWriter fw=new FileWriter(file);
		fw.write(source);
		fw.flush();
		fw.close();

	}

}
