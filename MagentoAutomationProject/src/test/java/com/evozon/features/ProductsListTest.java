package com.evozon.features;

import com.evozon.utils.Constants;
import org.junit.Test;

public class ProductsListTest extends BaseTest {
    @Test
    public void checkIfProductIsAvailableTest() {
        productsListSteps.searchAProduct(Constants.SIMPLE_PRODUCT);
    }

    @Test
    public void verifySortByPriceAscendingTest() {
        productsListSteps.searchAProduct("earrings");
        productsListSteps.verifySortByPriceAscending();
    }

    @Test
    public void validAddDownloadableProductToCart() {
        productsListSteps.searchProduct(Constants.DOWNLOADABLE_PRODUCT);
        productsListSteps.clickOnProductByName(Constants.DOWNLOADABLE_PRODUCT);
        productDetailsSteps.selectLinkByTitle(Constants.DOWNLOADABLE_PRODUCT_OPTION);
        productDetailsSteps.clickAddToCart();
        cartSteps.verifyIsProductAddedToCart(Constants.DOWNLOADABLE_PRODUCT);
    }
}