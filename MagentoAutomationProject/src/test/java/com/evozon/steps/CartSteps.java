package com.evozon.steps;

import net.thucydides.core.annotations.Step;
import org.hamcrest.Matchers;
import org.junit.Assert;

public class CartSteps extends BaseSteps {
    @Step
    public void clickBottomCheckout() {
        cartPage.clickBottomCheckoutButton();
    }

    @Step
    public void verifyIsProductAddedToCart(String productName) {
        Assert.assertEquals(String.format("%s was added to your shopping cart.", productName), cartPage.getAddToCartMessage());
    }

    @Step
    public void verifySize(String productName, String size) {
        Assert.assertThat(cartPage.getAttributeValueByName("Size", productName), Matchers.containsStringIgnoringCase(size));
    }

    @Step
    public void verifyColor(String productName, String color) {
        Assert.assertThat(cartPage.getAttributeValueByName("Color", productName), Matchers.containsStringIgnoringCase(color));
    }

    @Step
    public void verifyLinks(String productName, String link) {
//        Assert.assertThat(this.cartPage.getAttributeValuesByName("Links", productName), Matchers.containsStringIgnoringCase(link));
    }
}