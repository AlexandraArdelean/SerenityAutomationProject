package com.evozon.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

public class BillingInformationPage extends BasePage {
    @FindBy(id = "billing:firstname")
    private WebElementFacade firstNameField;
    @FindBy(id = "billing:middlename")
    private WebElementFacade middleNameField;
    @FindBy(id = "billing:lastname")
    private WebElementFacade lastNameField;
    @FindBy(id = "billing:company")
    private WebElementFacade companyField;
    @FindBy(id = "billing:email")
    private WebElementFacade emailAddressField;
    @FindBy(id = "billing:street1")
    private WebElementFacade addressField;
    @FindBy(id = "billing:street2")
    private WebElementFacade street2AddressField;
    @FindBy(id = "billing:city")
    private WebElementFacade cityField;
    @FindBy(id = "billing:region_id")
    private WebElementFacade stateDropDown;
    @FindBy(id = "billing:postcode")
    private WebElementFacade postalCodeField;
    @FindBy(id = "billing:country_id")
    private WebElementFacade countryDropDown;
    @FindBy(id = "billing:telephone")
    private WebElementFacade telephoneField;
    @FindBy(id = "billing:fax")
    private WebElementFacade faxField;
    @FindBy(id = "billing:use_for_shipping_yes")
    private WebElementFacade shipToThisAddressField;
    @FindBy(css = "#billing-buttons-container [title='Continue']")
    private WebElementFacade continueBillingInfoButton;


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

    public void setEmailAddressField(String emailAddress) {
        typeInto(emailAddressField, emailAddress);
    }

    public void setAddressField(String address) {
        typeInto(addressField, address);
    }

    public void setStreet2AddressField(String street) {
        typeInto(street2AddressField, street);
    }

}
