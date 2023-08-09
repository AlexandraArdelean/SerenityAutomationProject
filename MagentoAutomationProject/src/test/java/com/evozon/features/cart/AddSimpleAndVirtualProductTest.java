package com.evozon.features.cart;

import com.evozon.features.BaseTest;
import net.serenitybdd.junit.runners.SerenityParameterizedRunner;
import net.thucydides.junit.annotations.UseTestDataFrom;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(SerenityParameterizedRunner.class)
@UseTestDataFrom(value = "features/simple_virtual_products.csv")
public class AddSimpleAndVirtualProductTest extends BaseTest {
    private String product_name;

    @Test
    public void validAddSimpleAndVirtualProductToCart() {
        searchSteps.searchProduct(product_name);
        addToCartSteps.addSimpleProductToCart(product_name);
        cartSteps.verifyIsProductAddedToCart(product_name);
    }
}
