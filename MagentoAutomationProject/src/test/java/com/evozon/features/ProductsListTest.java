package com.evozon.features;

import com.evozon.utils.Constants;
import org.junit.Assert;
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
    public void validAddSimpleProductToCart() {
        productsListSteps.searchProduct(Constants.SIMPLE_PRODUCT);
        productsListSteps.addSimpleProductToCart(Constants.SIMPLE_PRODUCT);
        cartSteps.verifyIsProductAddedToCart(Constants.SIMPLE_PRODUCT);
    }

    @Test
    public void validAddConfigurableProductToCart() {
        productsListSteps.searchProduct(Constants.CONFIGURABLE_PRODUCT);
        productsListSteps.clickOnProductByName(Constants.CONFIGURABLE_PRODUCT);
        productDetailsSteps.selectColour(Constants.CONFIGURABLE_PRODUCT_COLOR);
        productDetailsSteps.selectSize(Constants.CONFIGURABLE_PRODUCT_SIZE);
        productDetailsSteps.clickAddToCart();
        cartSteps.verifyIsProductAddedToCart(Constants.CONFIGURABLE_PRODUCT);
        cartSteps.verifySize(Constants.CONFIGURABLE_PRODUCT, Constants.CONFIGURABLE_PRODUCT_SIZE);
        cartSteps.verifyColor(Constants.CONFIGURABLE_PRODUCT, Constants.CONFIGURABLE_PRODUCT_COLOR);
    }

    @Test
    public void validAddVirtualProductToCart() {
        productsListSteps.searchProduct(Constants.VIRTUAL_PRODUCT);
        productsListSteps.clickOnProductByName(Constants.VIRTUAL_PRODUCT);
        productDetailsSteps.clickAddToCart();
        cartSteps.verifyIsProductAddedToCart(Constants.VIRTUAL_PRODUCT);
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
