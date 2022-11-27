package manager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import java.util.List;

public class HelperBase {
    WebDriver wd;
    public HelperBase(WebDriver wd){
        this.wd = wd;
    }
    public void type(By locator, String text) {
        if (text != null) {
            WebElement element = wd.findElement(locator);
            element.click();
            element.clear();
            element.sendKeys(text);
        }

    }
    public void search() {
        type(By.xpath("(//input[@id='search'])[1]"), "madonna");
        wd.findElement(By.xpath("//button[@id='search-icon-legacy']//yt-icon[@class='style-scope ytd-searchbox']"))
                .click();

    }

    public void searchJustifySong() {
        Actions actions = new Actions(wd);
        WebElement element;
        while (true) {
            try {
                element = wd.findElement(By.cssSelector("a[title*=\"Justify My Love\"]"));
                break;
            } catch (Exception e) {
                actions.scrollByAmount(0, 10000).perform();
            }
        }
        element.click();

    }
    public boolean isSongPlaying(){
        List<WebElement>list = wd.findElements(By.cssSelector("div[id='title'] h1 yt-formatted-string"));
        return list.size()>0;
    }



}


