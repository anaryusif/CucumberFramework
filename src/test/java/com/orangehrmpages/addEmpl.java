package com.orangehrmpages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.syntex.utils.BaseClass;

public class addEmpl extends BaseClass{
	@FindBy(xpath="//span[text()='PIM']")
	public WebElement pim;
	@FindBy(xpath="//span[text()='Add Employee']")
	public WebElement addEmp;
	@FindBy(css="input#firstName")
	public WebElement firstName;
	
	@FindBy(css="input#lastName")
	public WebElement lastName;
	
	@FindBy(xpath="//select[@id='location']")
	public WebElement DropDown;
	@FindBy(xpath="//a[text()='Next']")
	public WebElement next;
	
	@FindBy(xpath="//div[@id='location_inputfileddiv']//input")
    public WebElement location;
	 @FindBy(xpath="//div[@id='location_inputfileddiv']//ul")
	    public WebElement locationList;
	
	 @FindBy(xpath="//a[@id='systemUserSaveBtn']")
	    public WebElement nextBtn;
	 @FindBy(xpath="//h4[text()='Personal Details']")
	    public WebElement empVer;
	    @FindBy(xpath="//form[@id='pimAddEmployeeForm']//label")
	    public List<WebElement> addEmpLabels;
	    
	    @FindBy(xpath = "//label[text()='Create Login Details']")
	    	public WebElement loginDetails;
	    	@FindBy(id = "username")
	    	public WebElement userName;
	    	@FindBy(id = "password")
	    	public WebElement password;
	    	@FindBy(id = "confirmPassword")
	    	public WebElement confirmPassword;
	    	@FindBy(xpath = "//div[@id='essRoleId_inputfileddiv']//input")
	    	public WebElement clickEss;
	    	@FindBy(xpath = "//div[@id='essRoleId_inputfileddiv']//ul")
	    	public WebElement selectEss;
	    	@FindBy(xpath = "//div[@id='supervisorRoleId_inputfileddiv']//input")
	    	public WebElement clickSupervisor;
	    	@FindBy(xpath = "//div[@id='supervisorRoleId_inputfileddiv']//ul")
	    	public WebElement selectSupervisor;
	    	@FindBy(xpath="//a[@id='systemUserSaveBtn']")
	    	public WebElement saveBtn;
	public addEmpl() {
		PageFactory.initElements(driver, this);
		
	}
}