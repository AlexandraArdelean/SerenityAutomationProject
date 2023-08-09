package com.evozon.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;

import java.util.List;
import java.util.stream.Collectors;

public class CartPage extends BasePage {
    @FindBy(css = ".success-msg span")
    private WebElementFacade addToCartSuccessMessage;
    @FindBy(css = ".bottom .btn-checkout")
    private WebElementFacade bottomCheckoutButton;

    public String getAddToCartMessage() {
        return addToCartSuccessMessage.getText();
    }

    @FindBy(css = "#shopping-cart-table tbody tr")
    private List<WebElementFacade> itemsList;


    public void clickBottomCheckoutButton() {
        this.clickOn(this.bottomCheckoutButton);
    }

    public String getAttributeValueByName(final String attribute, final String productName) {
        return this.findByName(productName)
                .find(By.xpath(String.format("//dt[text() = '%s']/following-sibling::dd[1]", attribute)))
                .getTextContent();
    }

    public List<String> getAttributeValuesByName(final String attribute, final String productName) {
        return this.findByName(productName)
                .thenFindAll(By.xpath(String.format("//dt[text() = '%s']/following-sibling::dd", attribute)))
                .stream()
                .map(WebElementFacade::getTextContent)
                .collect(Collectors.toList());
    }

    private WebElementFacade findByName(final String productName) {
        return this.itemsList
                .stream()
                .filter(el -> productName.equalsIgnoreCase(el.find(By.cssSelector("#shopping-cart-table tbody tr .product-name a")).getText()))
                .findFirst()
                .orElse(null);
    }
}
