package SEED_SDET_COURSE_AUTOMATION_TESTING_PROJECT_TRICENTIS_VEHICLE_INSURANCE_PROJECT.SEED_SDET_COURSE_AUTOMATION_TESTING_PROJECT_TRICENTIS_VEHICLE_INSURANCE_PROJECT;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Truck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.get("https://www.sparkstone.co.nz/sampleapp/101/index.php");

		driver.manage().window().maximize();

		driver.findElement(By.xpath("//div[@class='main-navigation']//a[@id='nav_truck']")).click();
		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[1]/div[1]/select/option[2]"))
				.click();
		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[1]/div[2]/input"))
				.sendKeys("300");
		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[1]/div[3]/input"))
				.sendKeys("07/18/2024");
		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[1]/div[4]/select/option[2]"))
				.click();

		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[1]/div[5]/select/option[2]"))
				.click();

		driver.findElement(By
				.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/section[1]/div[6]/input[1]"))
				.sendKeys("200");

		driver.findElement(By
				.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/section[1]/div[7]/input[1]"))
				.sendKeys("2000");

		driver.findElement(By
				.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/section[1]/div[8]/input[1]"))
				.sendKeys("5000");

		driver.findElement(By
				.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/section[1]/div[9]/input[1]"))
				.sendKeys("MH12AB1234");

		driver.findElement(By.xpath(
				"/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/section[1]/div[10]/input[1]"))
				.sendKeys("101");

		driver.findElement(By.xpath(
				"/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/section[1]/div[11]/button[1]"))
				.click();

		driver.findElement(By
				.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/section[2]/div[1]/input[1]"))
				.sendKeys("Vishwanath");
		driver.findElement(By
				.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/section[2]/div[2]/input[1]"))
				.sendKeys("Taware");
		driver.findElement(By
				.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/section[2]/div[3]/input[1]"))
				.sendKeys("23/05/1998");
		driver.findElement(By.xpath("//label[normalize-space()='Male']//span[@class='ideal-radio']")).click();
		driver.findElement(By.xpath("//input[@id='streetaddress']")).sendKeys("Pune");
	}

}
