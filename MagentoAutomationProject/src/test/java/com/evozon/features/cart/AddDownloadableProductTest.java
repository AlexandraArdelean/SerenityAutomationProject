package com.evozon.features.cart;

import com.evozon.features.BaseTest;
import net.serenitybdd.junit.runners.SerenityParameterizedRunner;
import net.thucydides.junit.annotations.UseTestDataFrom;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

@RunWith(SerenityParameterizedRunner.class)
@UseTestDataFrom(value = "features/downloadable_products.csv")
public class AddDownloadableProductTest extends BaseTest {
    private String product_name;

    private String links;

    @Test
    public void validAddDownloadableProductToCart() {
        searchSteps.executeSearch(product_name);
        productsListSteps.clickOnProductByName(product_name);
        List<String> linkList = List.of(links.split(","));
        productDetailsSteps.selectLinksByTitle(linkList);
        productDetailsSteps.clickAddToCart();
        cartSteps.verifyIsProductAddedToCart(product_name);
        cartSteps.verifyLinks(product_name, linkList);
    }
}
