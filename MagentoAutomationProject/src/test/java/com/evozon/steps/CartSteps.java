package com.evozon.steps;

import net.thucydides.core.annotations.Step;
import org.hamcrest.Matchers;
import org.junit.Assert;

public class CartSteps extends BaseSteps {
    @Step
    public void clickBottomCheckout() {
        this.cartPage.clickBottomCheckoutButton();
    }

    @Step
    public void verifyIsProductAddedToCart(final String productName) {
        Assert.assertEquals(String.format("%s was added to your shopping cart.", productName), cartPage.getAddToCartMessage());
    }

    @Step
    public void verifySize(final String productName, final String size) {
        Assert.assertThat(this.cartPage.getAttributeValueByName("Size", productName), Matchers.containsStringIgnoringCase(size));
    }

    @Step
    public void verifyColor(final String productName, final String color) {
        Assert.assertThat(this.cartPage.getAttributeValueByName("Color", productName), Matchers.containsStringIgnoringCase(color));
    }

    @Step
    public void verifyLinks(final String productName, final String link) {
//        Assert.assertThat(this.cartPage.getAttributeValuesByName("Links", productName), Matchers.containsStringIgnoringCase(link));
    }
}