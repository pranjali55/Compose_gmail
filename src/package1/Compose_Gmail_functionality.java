package package1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Compose_Gmail_functionality {
	
			public static void main(String[] args) throws InterruptedException 
			{
				
				ChromeOptions option = new ChromeOptions();
				option.addArguments("--remote-allow-origins=*");
				WebDriver driver = new ChromeDriver(option);
				
				driver.get("https://www.google.com/search?q=gmail.com&sxsrf=APwXEdfkHGkiDEgyBBNfGtqEbdA6qTK11w%3A1684561437563&ei=HV5oZKb4IZe_juMP8ciBkAo&ved=0ahUKEwjm-tmwmIP_AhWXn2MGHXFkAKIQ4dUDCA8&uact=5&oq=gmail.com&gs_lcp=Cgxnd3Mtd2l6LXNlcnAQAzIOCAAQigUQsQMQgwEQkQIyCAgAEIoFEJECMg4IABCKBRCxAxCDARCRAjIOCAAQigUQsQMQgwEQkQIyDggAEIoFELEDEIMBEJECMgsIABCABBCxAxCDATIQCAAQgAQQFBCHAhCxAxCDATIFCAAQgAQyCwgAEIAEELEDEIMBMgsIABCABBCxAxCDAToKCAAQRxDWBBCwAzoKCAAQigUQsAMQQzoECCMQJ0oECEEYAFDwDliFFWDDF2gBcAF4AIAB_QGIAb4GkgEFMC4yLjKYAQCgAQHIAQrAAQE&sclient=gws-wiz-serp");
				
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
				driver.findElement(By.xpath("(//h3[@class='LC20lb MBeuO DKV0Md'])[1]")).click();
				driver.findElement(By.xpath("//a[@href='https://accounts.google.com/AccountChooser/signinchooser?service=mail&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&flowName=GlifWebSignIn&flowEntry=AccountChooser']")).click();
				driver.findElement(By.xpath("//input[@type='email']")).sendKeys("acdummy977");
				driver.findElement(By.xpath("(//span[@class='VfPpkd-vQzf8d'])[2]")).click();
				
				driver.findElement(By.xpath("//div[@id='password']//input[@type='password']")).sendKeys("Dummy@157");
				driver.findElement(By.xpath("//*[@id=\"passwordNext\"]/div/button/span")).click();
				
				driver.findElement(By.xpath("//div[@class='T-I T-I-KE L3']")).click();
				
				Thread.sleep(3000);
				driver.findElement(By.xpath("//input[@class='agP aFw']")).sendKeys("pranjalishende03@gmail.com");
				driver.findElement(By.xpath("//input[@name='subjectbox']")).sendKeys("automation script");
				driver.findElement(By.xpath("//div[@role='textbox']")).sendKeys("Hi, \n "+"This mail is regarding compose mail functionality.");
			
				Thread.sleep(5000);
				driver.quit();
				
				
			}
		}

