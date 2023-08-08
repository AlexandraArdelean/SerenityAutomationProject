package com.evozon.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class WishlistPage extends BasePage {
    @FindBy(css = ".success-msg")
    private WebElementFacade addToWishlistSuccessMsg;
    @FindBy(css = "#wishlist-table tbody tr")
    private List<WebElementFacade> productsList;

    @FindBy(css = ".customer-wishlist-item-quantity .input-text")
    private List<WebElementFacade> wishlistQtyFieldList;

    @FindBy(css = ".buttons-set  button[title='Update Wishlist']")
    private WebElementFacade updateWishlistQtyBtn;

    @FindBy(css = ".first.odd button[title='Add to Cart']")
    private WebElementFacade addToCartButton;


    public String getAddToWishListMsgSuccess() {
        return addToWishlistSuccessMsg.getText();
    }

    public WebElementFacade findProductToModifyQty(String name) {
        Assert.assertNotNull(productsList);
        for (WebElementFacade elementFacade : productsList) {
            if (elementFacade.findElement(By.cssSelector(".product-name a")).getText().equalsIgnoreCase(name)) {
                return elementFacade;
            }

        }
        return null;
    }

    public void setQuantityWishlistField(String name, int qty) {
        WebElementFacade element = findProductToModifyQty(name).find(By.cssSelector(".cart-cell .input-text"));
        element.clear();
        typeInto(element, String.valueOf(qty));
    }

    public String getQuantity(String name) {
        WebElementFacade elementFacade = findProductToModifyQty(name).find(By.cssSelector(".cart-cell .input-text"));
        return elementFacade.getValue();

    }

    public void clickOnUpdateWishlistBtn() {
        clickOn(updateWishlistQtyBtn);
    }

    public void clickOnAddToCartButton() {
        clickOn(addToCartButton);
    }
}
