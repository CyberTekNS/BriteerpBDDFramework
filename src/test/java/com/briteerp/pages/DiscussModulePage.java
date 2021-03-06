package com.briteerp.pages;

import com.briteerp.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DiscussModulePage {
    public DiscussModulePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//*[@class='oe_topbar_name']")
    public WebElement dropDown;

    @FindBy (xpath = "//*[@data-menu='logout']")
    public WebElement signOutButton;

    @FindBy(xpath = "//*[@data-menu-xmlid='point_of_sale.menu_point_root']")
    public WebElement pointOfSale;


    @FindBy(xpath = "(//*[@class='oe_menu_text'])[1]")
    public WebElement discuss;
}
