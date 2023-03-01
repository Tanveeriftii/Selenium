package test;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class registrationtest {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		RegistrationPage rgPage = new RegistrationPage(driver);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(240, TimeUnit.SECONDS);
		driver.get("https://test.sharebus.co/");
		driver.findElement(By.xpath("//body/div[@id='app']/nav[1]/div[1]/ul[1]/li[1]/button[1]")).click();
		rgPage.setemail("brainstation23@yopmail.com");
		Thread.sleep(1000);
		rgPage.setpassword("Pass@1234");
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[4]/button[1]")).click();
		Thread.sleep(2000);

		driver.findElement(By.cssSelector(".p-dropdown.p-component.p-inputwrapper.p-inputwrapper-filled.w-50")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("li[aria-label='sharelead']")).click();
		// driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/button[1]")).click();
		driver.findElement(By.cssSelector(
				".btn.btn-primary.btn.btn-success.text-white.align-self-center.rounded-pill.fw-bolder.px-4.my-3.d-flex.justify-content-between.align-items-center.mt-3"))
				.click();
		Thread.sleep(3000);

		driver.findElement(
				By.cssSelector(".btn.btn-primary.px-4.py-1.my-2.rounded-pill.sb-btn-lg.sb-btn-primary.fw-400")).click();
		Thread.sleep(2000);

		WebElement listbox = driver.findElement(By.id("startPoint"));
		listbox.sendKeys("Oslo Norway");
		listbox.sendKeys(Keys.DOWN);
		listbox.sendKeys(Keys.ENTER);
		//driver.findElement(By.xpath("//div[@class='my-3']//div[@class='input-group']")).click();
		Thread.sleep(1000);

		WebElement listbox1 = driver.findElement(By.id("destination"));
		listbox1.sendKeys("Kolbotn Norway");
		listbox1.sendKeys(Keys.DOWN);
		listbox1.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		
		
		driver.findElement(By.cssSelector("input[placeholder='Departure Date']")).click();
		driver.findElement(By.cssSelector("tbody tr:nth-child(3) td:nth-child(3) span:nth-child(1)")).click();
		
		//driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/div[2]/div[1]/div/form/div[1]/div[3]/div[1]/div[1]/div/div[1]/span/input")).click();
		//driver.findElement(By.xpath("//span[normalize-space()='14']")).click();
		driver.findElement(By.xpath("body > div.p-datepicker.p-component.p-ripple-disabled > div.p-datepicker-group-container > div > div.p-datepicker-calendar-container > table > tbody > tr:nth-child(3) > td:nth-child(3) > span")).click();
		driver.findElement(By.xpath(
				"//div[@class='row my-3']//span[@class='p-calendar p-component p-inputwrapper p-calendar-timeonly p-inputwrapper-filled']//input[@placeholder='Time']"))
				.click();
		driver.findElement(By.xpath("//div[@class='p-hour-picker']//button[1]")).click();
		Thread.sleep(1000);

		driver.findElement(By.cssSelector("input[placeholder='Return Date']")).click();
		driver.findElement(By.xpath("//span[normalize-space()='29']")).click();

		driver.findElement(By.xpath(
				"//div[@class='row my-4']//span[@class='p-calendar p-component p-inputwrapper p-calendar-timeonly p-inputwrapper-filled']//input[@placeholder='Time']"))
				.click();
		driver.findElement(By.xpath("//div[@class='p-hour-picker']//span[@class='pi pi-chevron-up']")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("//button[@class='btn yes-no-btn custom-border-radius bg-white border-light']"))
				.click();

		driver.findElement(By.xpath("//i[@class='fi fi-chevron-down']")).click();
		driver.findElement(By.xpath("//li[normalize-space()='NTNUI']")).click();
		driver.findElement(By.xpath("//button[contains(@type,'submit')]")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("//button[@class='btn gray-white-bg ship-gray btn-discount-size rounded-end']"))
				.click();
		driver.findElement(By.xpath("//button[@class='btn gray-white-bg ship-gray btn-discount-size rounded-end']"))
				.click();
		driver.findElement(By.xpath("//button[contains(@type,'submit')]")).click();

		driver.findElement(By.xpath("//div[@class='body-wrapper']//button[1]")).click();
		driver.findElement(By.cssSelector("div[class='col-sm-12 col-md-6 my-4'] input[class='form-control rounded']"))
				.click();
		driver.findElement(By.xpath("//div[@id='sport0']")).click();
		driver.findElement(
				By.xpath("//button[contains(@class,'rounded-pill d-flex align-items-center fw-bold ms-auto')]"))
				.click();
		driver.findElement(By.xpath(
				"//button[contains(@class,'btn sb-btn-primary sb-btn-lg w-auto rounded-pill lh-1 px-4 fw-bold d-flex justify-content-center align-items-center')]"))
				.click();
		driver.findElement(By.id("navbarScrollingDropdown")).click();
		driver.findElement(By.xpath(
				"//button[@class='btn dropdown-item fw-bold text-dark sharelead-item-hover'][normalize-space()='My busses']"))
				.click();

		driver.findElement(By.xpath("//span[normalize-space()='Tickets']")).click();

	}
}
