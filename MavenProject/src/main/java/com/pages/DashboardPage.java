package com.pages;


	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

	public class DashboardPage {

		WebDriver dpdriver;
		
		@FindBy(tagName="h1")
		private WebElement header;
		
		@FindBy(xpath="//span[text()='Users']")
		private WebElement userBtn;
		
		public DashboardPage(WebDriver driver) {
			this.dpdriver=driver;
			PageFactory.initElements(driver, this);
		}
		
		public boolean verifyHeader() {
			boolean b= header.isDisplayed();
			return b;
		}
		
		public UserPage clickUser() {
			userBtn.click();
			return new UserPage(dpdriver);
		}
		
	}

