package com.evozon.features.cart;

import com.evozon.features.BaseTest;
import net.serenitybdd.junit.runners.SerenityParameterizedRunner;
import net.thucydides.junit.annotations.UseTestDataFrom;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(SerenityParameterizedRunner.class)
@UseTestDataFrom(value = "features/configurable_products.csv")
public class AddConfigurableProductTest extends BaseTest {
    private String product_name;

    private String color;

    private String size;

    @Test
    public void validAddConfigurableProductToCart() {
        searchSteps.executeSearch(product_name);
        productsListSteps.clickOnProductByName(product_name);
        productDetailsSteps.selectColour(color);
        productDetailsSteps.selectSize(size);
        productDetailsSteps.clickAddToCart();
        cartSteps.verifyIsProductAddedToCart(product_name);
        cartSteps.verifyColor(product_name, color);
        cartSteps.verifySize(product_name, size);
    }
}
