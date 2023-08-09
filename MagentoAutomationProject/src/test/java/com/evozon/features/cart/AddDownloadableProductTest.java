package com.evozon.features.cart;

import com.evozon.features.BaseTest;
import net.serenitybdd.junit.runners.SerenityParameterizedRunner;
import net.thucydides.junit.annotations.UseTestDataFrom;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.Arrays;

@RunWith(SerenityParameterizedRunner.class)
@UseTestDataFrom(value = "features/downloadable_products.csv")
public class AddDownloadableProductTest extends BaseTest {
    private String product_name;

    private String links;

    @Test
    public void validAddDownloadableProductToCart() {
        productsListSteps.searchProduct(product_name);
        productsListSteps.clickOnProductByName(product_name);
        Arrays.stream(links.split(","))
                .forEach(productDetailsSteps::selectLinkByTitle);
        productDetailsSteps.clickAddToCart();
        cartSteps.verifyIsProductAddedToCart(product_name);
    }
}
