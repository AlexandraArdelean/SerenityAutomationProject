package com.evozon.steps;


import net.thucydides.core.annotations.Step;

public class CheckoutAsGuestSteps extends BaseSteps {



    @Step
    public void selectCheckoutAsGuest() {
        checkoutPage.selectCheckoutAsGuestRadioBtn();
    }

    @Step
    public void clickContinueButton() {
        checkoutPage.clickContinueCheckoutAsGuestButton();
    }

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
    public void enterCompany(String company) {
        billingInformationPage.setCompanyField(company);
    }

    @Step
    public void enterEmailAddress(String email) {
        billingInformationPage.setEmailAddressField(email);
    }

    @Step
    public void enterStreetAddress1(String streetAddress) {
        billingInformationPage.setStreetAddressField(streetAddress);
    }

    @Step
    public void enterStreetAddress2(String streetAddress) {
        billingInformationPage.setStreet2AddressField(streetAddress);
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
    public void enterTelephone(String telephone) {
        billingInformationPage.setTelephoneField(telephone);
    }

    @Step
    public void enterFax(String fax) {
        billingInformationPage.setFaxField(fax);
    }

    @Step
    public void selectShipToDifferentAddress() {
        billingInformationPage.setShipToDifferentAddress();
    }

    @Step
    public void clickContinueToShipping() {
        billingInformationPage.clickOnContinueButton();
    }

    @Step
    public void clickUseBillingAddress() {
        shippingInformationPage.selectUseBillingAddress();
    }

    @Step
    public void selectFixedShippingRate() {
        shippingMethodPage.clickOnFixedFlatRateButton();
    }

    @Step
    public void clickContinueToPayment() {
        shippingMethodPage.clickContinue();
    }

    @Step
    public void clickContinueToOrderReview() {
        paymentInformationPage.clickOnContinueButton();
    }

    @Step
    public void clickOnPlaceOrder() {
        orderPreviewPage.clickOnPlaceOrderButton();
    }


}
