package com.orangehrmpages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.syntex.utils.BaseClass;
import com.syntex.utils.CommonMethods;

public class LogInpage extends BaseClass{
	@FindBy(id="txtUsername")
	public WebElement userName;
	@FindBy(id="txtPassword")
	public WebElement pass;
	
	@FindBy(id="btnLogin")
	public WebElement button;
	@FindBy(xpath="//*[@id=\"divLogo\"]/img")
	public WebElement Logo;
	public LogInpage() {
		PageFactory.initElements(driver, this);
		
	}
	
	public void login(String uname, String pwd) {
        CommonMethods.sendText(userName, uname);
        CommonMethods.sendText(pass, pwd);
        CommonMethods.jsClick(button);
    }
	//initialize all of our

}