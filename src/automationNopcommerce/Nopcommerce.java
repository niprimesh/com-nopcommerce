package automationNopcommerce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class Nopcommerce {

        //Setup Chrome browser
        static String browser = "Chrome";
        static String baseUrl = "https://demo.nopcommerce.com/";
        static WebDriver driver;

        public static void main(String[] args) {
            //Multiple browser
            if (browser.equalsIgnoreCase("Chrome")) {
                driver = new ChromeDriver();
            } else if (browser.equalsIgnoreCase("Firefox")) {
                driver = new FirefoxDriver();
            } else if (browser.equalsIgnoreCase("Edge")) {
                driver = new EdgeDriver();
            } else {
                System.out.println("Wrong Browser name");
            }
            //Open URL
            driver.get(baseUrl);
            //Maximize the window
            driver.manage().window().maximize();
            //Timeout for hold the page
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            //Print the title of the page.
            System.out.println(driver.getTitle());
            //Print the current url.
            System.out.println(driver.getCurrentUrl());
            //Print the page source
            System.out.println(driver.getPageSource());
            String loginUrl = "https://demo.nopcommerce.com/login?returnUrl=%2F";
            //Navigate to other URL
            driver.navigate().to(loginUrl);
            //Print current URL
            System.out.println("This is the current URL : " + driver.getCurrentUrl());
            //come back to home page
            driver.navigate().back();
            //come back to login page by forword arrow
            driver.navigate().forward();
            //Print current URL
            System.out.println("This is the current URL : " + driver.getCurrentUrl());
            //Refresh the page
            driver.navigate().refresh();
            //Enter the email to email field
            driver.findElement(By.id("Email")).sendKeys("diwali@gmail.com");
            //Enter the password field
            driver.findElement(By.id("Password")).sendKeys("xyz@123");
            //Click on login button
            driver.findElement(By.partialLinkText("Log in")).click();
            //Close the browser
            driver.quit();
        }
    }

