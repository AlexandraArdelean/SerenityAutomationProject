package com.evozon.pages.checkout;

import com.evozon.pages.BasePage;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

public class ShippingInformationPage extends BasePage {
    @FindBy(id = "shipping:firstname")
    private WebElementFacade firstNameField;
    @FindBy(id = "shipping:middlename")
    private WebElementFacade middleNameField;
    @FindBy(id = "shipping:lastname")
    private WebElementFacade lastNameField;
    @FindBy(id = "shipping:company")
    private WebElementFacade companyField;
    @FindBy(id = "shipping:street1")
    private WebElementFacade streetAddressField1;
    @FindBy(id = "shipping:street2")
    private WebElementFacade streetAddressField2;
    @FindBy(id = "shipping:city")
    private WebElementFacade cityField;
    @FindBy(id = "shipping[region_id]")
    private WebElementFacade stateDropDown;
    @FindBy(id = "shipping:postcode")
    private WebElementFacade postalCodeField;
    @FindBy(id = "shipping:country_id")
    private WebElementFacade countryDropDown;
    @FindBy(id = "shipping:telephone")
    private WebElementFacade telephoneField;
    @FindBy(id = "shipping:fax")
    private WebElementFacade faxField;

    @FindBy(id = "shipping:same_as_billing")
    private WebElementFacade useBillingAddressCheckButton;
    @FindBy(css = "#shipping-buttons-container [title ='Continue']")
    private WebElementFacade continueShippingButton;

    public void setFirstNameField(String firstName) {
        typeInto(firstNameField, firstName);
    }

    public void setMiddleNameField(String middleName) {
        typeInto(middleNameField, middleName);
    }

    public void setLastNameField(String lastName) {
        typeInto(lastNameField, lastName);
    }

    public void setCompanyField(String company) {
        typeInto(companyField, company);
    }

    public void setStreetAddressField1(String streetAddress) {
        typeInto(streetAddressField1, streetAddress);
    }

    public void setStreetAddressField2(String streetAddress) {
        typeInto(streetAddressField2, streetAddress);
    }

    public void setCityField(String city) {
        typeInto(cityField, city);
    }

    public void setStateDropDown(String state) {
        stateDropDown.selectByVisibleText(state);
    }

    public void setPostalCodeField(String postalCode) {
        typeInto(postalCodeField, postalCode);
    }

    public void setCountryDropDown(String country) {
        countryDropDown.selectByVisibleText(country);
    }

    public void selectUseBillingAddress(){
        clickOn(useBillingAddressCheckButton);
    }

    public void clickOnContinueButton() {
        clickOn(continueShippingButton);
    }


}
