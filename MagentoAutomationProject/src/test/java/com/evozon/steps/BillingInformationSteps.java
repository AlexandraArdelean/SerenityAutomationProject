package com.evozon.steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;

public class BillingInformationSteps extends BaseSteps {
    @Step
    public void enterFirstName(String firstName) {
        billingInformationPage.setFirstNameField(firstName);
    }

    @Step
    public void enterMiddleName(String middleName) {
        billingInformationPage.setMiddleNameField(middleName);
    }

    @Step
    public void enterLastName(String lastName) {
        billingInformationPage.setLastNameField(lastName);
    }

    @Step
    public void enterCompanyName(String company) {
        billingInformationPage.setCompanyField(company);
    }

    @Step
    public void enterEmailAddress(String emailAddress) {
        billingInformationPage.setEmailAddressField(emailAddress);
    }

    @Step
    public void enterStreet1Address(String street1Address) {
        billingInformationPage.setStreetAddressField(street1Address);
    }

    @Step
    public void enterStreet2Address(String street2Address) {
        billingInformationPage.setStreet2AddressField(street2Address);
    }

    @Step
    public void enterCity(String city) {
        billingInformationPage.setCityField(city);
    }

    @Step
    public void selectState(String state) {
        billingInformationPage.selectStateFromDropDown(state);
    }

    @Step
    public void enterPostalCode(String postalCode) {
        billingInformationPage.setPostalCodeField(postalCode);
    }

    @Step
    public void selectCountry(String country) {
        billingInformationPage.selectCountryFromDropDown(country);
    }

    @Step
    public void enterTelephoneNumber(String telephone) {
        billingInformationPage.setTelephoneField(telephone);
    }

    @Step
    public void enterFax(String fax) {
        billingInformationPage.setFaxField(fax);
    }

    @Step
    public void selectShipToThisAddressRadioBtn() {
        billingInformationPage.setShipToThisAddressRadioBtn();
    }

    @Step
    public void clickContinueButton() {
        billingInformationPage.clickOnContinueButton();
    }
}
