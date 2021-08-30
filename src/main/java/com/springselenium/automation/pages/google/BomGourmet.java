package com.springselenium.automation.pages.google;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.springselenium.automation.pages.AbstractPage;

@Component
public class BomGourmet extends AbstractPage {
	
	@Value("${application.url}")
	private String url;

	@Value("${fullName}")
	private String sfullName;
	
	@Value("${email}")
	private String sEmail;
	
	@Value("${place}")
	private String sPlace;
	
	@Value("${city}")
	private String sCity;
	
	@FindBy(id = "fullname")
	private WebElement fullName;
	
	@FindBy(id = "email")
	private WebElement email;
	
	@FindBy(id = "place")
	private WebElement place;
	
	@FindBy(id = "city")
	private WebElement city;
	
	@FindBy(xpath = "//input[@type=\"checkbox\"]")
	private WebElement checkbox;
	
	@FindBy(name = "enviar")
	private WebElement btnSend;
	
	@FindBy(className = "btn")
	private WebElement sendAgain;
	
	@Override
	public boolean isAt() {
		return wait.until((d) -> fullName.isDisplayed());
	}
	
	public void goTo() {
		driver.get(url);
	}
	
	public void quit() {
		driver.quit();
	}
	
	public void fillFields() {
		fullName.sendKeys(sfullName);
		email.sendKeys(sEmail);
		place.sendKeys(sPlace);
		city.sendKeys(sCity);
		checkbox.click();
	}
	
	public void clickSend() {
		btnSend.click();
	}
	
	public void clickSendAgain() {
		sendAgain.click();
	}
	
}
