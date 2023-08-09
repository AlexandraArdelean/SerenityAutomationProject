package com.evozon.features.productList;

import com.evozon.features.BaseTest;
import net.serenitybdd.junit.runners.SerenityParameterizedRunner;
import net.thucydides.junit.annotations.Concurrent;
import net.thucydides.junit.annotations.UseTestDataFrom;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.Arrays;

@RunWith(SerenityParameterizedRunner.class)
@UseTestDataFrom(value = "features/categories.csv")
@Concurrent
public class ProductsListTitleTest extends BaseTest {
    private String category;
    private String subcategories;

    @Test
    public void verifyCategoryPageTitlesAreCorrect() {
        homePageSteps.goToCategory(category);
        productsListSteps.verifyPageTitleIsCorrect(category);

    }

    @Test
    public void verifySubcategoryPageTitlesAreCorrect() {
        Arrays.stream(subcategories.split(","))
                .forEach(subcategory -> {
                    homePageSteps.goToSubcategory(category, subcategory);
                    productsListSteps.verifyPageTitleIsCorrect(subcategory);
                });
    }
}
