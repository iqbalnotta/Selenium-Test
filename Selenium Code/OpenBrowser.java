import org.testng.annotations.Test;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;


public class OpenBrowser {

File pathToBinary = new File("C:\\Program Files\\Mozilla Firefox\\firefox.exe");
FirefoxBinary ffBinary = new FirefoxBinary(pathToBinary);
FirefoxProfile firefoxProfile = new FirefoxProfile();       
WebDriver driver = new FirefoxDriver(ffBinary,firefoxProfile);


	/*public WebDriver driver = new FirefoxDriver();*/
	@Test
	public void main() throws Exception{
		
		System.setProperty("webdriver.firefox.bin",
                "C:\\Program Files\\Mozilla Firefox\\firefox.exe");
		//driver.get("https://www.google.com");
		driver.navigate().to("http://www.google.com");
		Thread.sleep(3000);
		WebElement gsfi_object = driver.findElement(By.id("lst-ib"));
		gsfi_object.sendKeys ("Manchester united");
		Thread.sleep(3000);
		gsfi_object.sendKeys(Keys.ENTER);
		Thread.sleep(5000);
		
		/*WebElement link_click = driver.findElement(By.xpath("//a[@href='/url?sa=t&rct=j&q=&esrc=s&source=web&cd=5&cad=rja&uact=8&ved=0ahUKEwiD2eq788_PAhXBpo8KHaZ9B4YQFggrMAQ&url=http%3A%2F%2Fwww.manutd.com%2F&usg=AFQjCNF4jUdOM6tmercHe8m5yTbqw7DXvQ&sig2=q9h7YyFB7oz0jAsVJJ4dfw&bvm=bv.135258522,d.c2I']"));
		link_click.click();*/
		
		/*By css = By.cssSelector("a[href='/url?sa=t&rct=j&q=&esrc=s&source=web&cd=5&cad=rja&uact=8&ved=0ahUKEwiD2eq788_PAhXBpo8KHaZ9B4YQFggrMAQ&url=http%3A%2F%2Fwww.manutd.com%2F&usg=AFQjCNF4jUdOM6tmercHe8m5yTbqw7DXvQ&sig2=q9h7YyFB7oz0jAsVJJ4dfw&bvm=bv.135258522,d.c2I']");
		WebElement click_element = driver.findElement(css);
		((JavascriptExecutor)driver).executeScript("arguments[0].click();" , click_element);*/
		
		driver.findElement(By.linkText("Official Manchester United Website")).click();
		
		Thread.sleep(5000);
	/*	WebElement link_click = driver.findElement(By.xpath("//a[@href='http://store.manutd.com/stores/manutd/default.aspx?portal=QYTMF8KF&CMP=PSC-QYTMF8KF']"));
		link_click.click();
		Thread.sleep(5000);*/
		
		WebElement image_click = driver.findElement(By.xpath("//img[@src='/~/media/F3A4DA50229C4F40AB0207C442E5386E.ashx']"));
		image_click.click();
		Thread.sleep(5000);
		
		
		Actions actions = new Actions(driver);
        WebElement menuHoverLink = driver.findElement(By.xpath(".//a[@id='ctl00_site_navigation1_hlnk_nav3']"));
        actions.moveToElement(menuHoverLink).build().perform();
        WebElement subLink = driver.findElement(By.xpath(".//*[@id='ctl00_site_navigation1_lit_home1314Mens']"));
        subLink.click();
		
        Thread.sleep(3000);
        
        
        WebElement sort_click = driver.findElement(By.xpath(".//*[@id='ctl00_ContentMain_product_browse1_lv_pagingTop_dd_sortBy']"));
		sort_click.click();
      
		WebElement sort_click_1 = driver.findElement(By.xpath("//option[@value='name_manutd|ASC']"));
		sort_click_1.click();
		Thread.sleep(5000);
		
		WebElement socks_link = driver.findElement(By.xpath(".//img[@id='ctl00_ContentMain_product_browse1_lv_products_ctrl0_ProductInfo_ProductImg']"));
        socks_link.click();
        Thread.sleep(2000);
       
        WebElement thumb_image_click = driver.findElement(By.xpath("//img[@src='http://kbis-cdn.clikimaging.com/mufc/180292/img/mufc-180292c/thumbnail/mufc-180292c-60x45.jpg']"));
		thumb_image_click.click();
		Thread.sleep(5000);
        
		
		/*WebElement size_select = driver.findElement(By.xpath(".//*[@id='ctl00_ContentMain_kit_selector1_product_selector1_dd_variations']"));
		size_select.click();
		Thread.sleep(3000);      
		WebElement size_select_1 = driver.findElement(By.xpath("//option[@value='180292x756022']"));
		size_select_1.click();
		Thread.sleep(3000);*/
		
		Select size_select_driver = new Select(driver.findElement(By.id("ctl00_ContentMain_kit_selector1_product_selector1_dd_variations")));
		size_select_driver.selectByValue("180292x756022");
		Thread.sleep(3000);
		
		/*WebElement quantity_select = driver.findElement(By.xpath(".//*[@id='ctl00_ContentMain_kit_selector1_product_selector1_dd_quantity']"));
		quantity_select.click();
		Thread.sleep(3000);*/
		
		
		/*WebElement add_cart = driver.findElement(By.xpath("//image[@src='//static2.kbobject.com/stores/manutd/artwork/english/interface/buttons/button_addtobasket_small.gif']"));
		add_cart.click();
        Thread.sleep(2000);*/
		
        /*driver.findElement(By.className("ctl00$ContentMain$kit_selector1$product_selector1$imgbtn_addToBasket")).click();
        Thread.sleep(3000);*/
        
        WebElement add_cart = driver.findElement(By.xpath("/html/body/form/div[7]/div[2]/div[2]/div/div[1]/div[2]/div/div[3]/div[5]/input"));
		add_cart.click();
        Thread.sleep(2000);
        
		driver.close();
	
		
		
	}
}

