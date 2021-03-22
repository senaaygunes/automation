import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class ExecuteJavascript {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "/Users/saygunes/Downloads/chromedriver_win32/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/modal");

        WebElement openButton = driver.findElement(By.id("modal-button"));
        openButton.click();

        WebElement closeButton = driver.findElement(By.id("close-button"));
        JavascriptExecutor is = (JavascriptExecutor)driver;
        js.executeScript(s: "arguments[0].click();", closeButton);

        driver.quit();
    }
}
