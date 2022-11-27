package manager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ApplicationManager {
    WebDriver wd;
    HelperBase helperBase;

    public void init() {
        wd = new ChromeDriver();
        wd.navigate().to("https://www.youtube.com/");
        wd.manage().window().maximize();
        wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        helperBase = new HelperBase(wd);
    }

    public void stop() {
        wd.quit();
    }
    public HelperBase getHelperBase(){return helperBase;}
}
