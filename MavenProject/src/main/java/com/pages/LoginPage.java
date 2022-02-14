package com.pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LoginPage {

		WebDriver lpdriver;
		
		public LoginPage(WebDriver driver) {
			this.lpdriver=driver;
			PageFactory.initElements(driver,this);
		}
		
		@FindBy(id="email")
		private WebElement uname;
		
		@FindBy(id="password")
		private WebElement pass;
		
		@FindBy(xpath="//button")
		private WebElement loginBtn;
		
		public void loginToApplication(String username, String password) {
			uname.sendKeys(username);
			pass.sendKeys(password);
			loginBtn.click();
		}
		
		public DashboardPage validLogin() {
			uname.sendKeys("kiran@gmail.com");
			pass.sendKeys("123456");
			loginBtn.click();
			return new DashboardPage(lpdriver);

}
}

