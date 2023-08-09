package com.evozon.features;

import com.evozon.utils.Categories;
import com.evozon.utils.Constants;
import net.serenitybdd.junit.runners.SerenityRunner;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.Arrays;

@RunWith(SerenityRunner.class)
public class ProductsListTest extends BaseTest {
    @Test
    public void checkIfProductIsAvailableTest() {
        productsListSteps.searchAProduct(Constants.SIMPLE_PRODUCT);
    }

    @Test
    public void verifySortByPriceAscendingTest() {
        productsListSteps.searchAProduct(Constants.SIMPLE_PRODUCT);
        productsListSteps.verifySortByPriceAscending();
    }

    @Test
    public void verifyPageTitlesAreCorrect() {
        Arrays.stream(Categories.values()).forEach(category -> {
            homePageSteps.goToCategory(category.text);
            productsListSteps.verifyPageTitleIsCorrect(category.text);
        });
    }
}