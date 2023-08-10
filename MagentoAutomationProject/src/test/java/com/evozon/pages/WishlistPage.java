package com.evozon.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class WishlistPage extends BasePage {
    @FindBy(css = ".success-msg span")
    private WebElementFacade addToWishlistSuccessMessageText;
    @FindBy(css = "#wishlist-table tbody tr")
    private List<WebElementFacade> productsList;

    @FindBy(css = ".customer-wishlist-item-quantity .input-text")
    private List<WebElementFacade> wishlistQtyFieldList;

    @FindBy(css = ".buttons-set  button[title='Update Wishlist']")
    private WebElementFacade updateWishlistQtyBtn;

    @FindBy(css = ".first.odd button[title='Add to Cart']")
    private WebElementFacade addToCartButton;


    public String getAddToWishListMessageSuccess() {
        return addToWishlistSuccessMessageText.getText();
    }

    public WebElementFacade findProductToModifyQuantity(String name) {
        Assert.assertNotNull(productsList);
        for (WebElementFacade elementFacade : productsList) {
            if (elementFacade.findElement(By.cssSelector(".product-name a")).getText().equalsIgnoreCase(name)) {
                return elementFacade;
            }

        }
        return null;
    }

    public void setQuantityWishlistField(String name, int qty) {
        WebElementFacade element = findProductToModifyQuantity(name).find(By.cssSelector(".cart-cell .input-text"));
        element.clear();
        typeInto(element, String.valueOf(qty));
    }

    public String getQuantityByName(String name) {
        WebElementFacade elementFacade = findProductToModifyQuantity(name).find(By.cssSelector(".cart-cell .input-text"));
        return elementFacade.getValue();

    }

    public void clickOnUpdateWishlistBtn() {
        clickOn(updateWishlistQtyBtn);
    }

    public void clickOnAddToCartButton() {
        clickOn(addToCartButton);
    }
}
