package com.evozon.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ProductsListPage extends BasePage {
    @FindBy(css = "li.item")
    private List<WebElementFacade> webElementFacadeList;

    @FindBy(css = ".category-products > .toolbar select[title='Sort By']")
    private WebElementFacade sortByDropdown;

    @FindBy(css = ".page-title h1")
    private WebElementFacade pageTitleHeading;

    public String getPageTitleHeadingText() {
        return pageTitleHeading.getText();
    }

    public WebElementFacade findProductByName(String product) {
        Assert.assertNotNull(webElementFacadeList);
        for (WebElementFacade element : webElementFacadeList) {
            if (element.findElement(By.cssSelector(".product-name")).getText().equalsIgnoreCase(product)) {
                return element;
            }
        }
        return null;
    }

    public boolean isProductInList(String product) {
        return findProductByName(product) != null;
    }

    public void clickAddToWishlistBtn(String productName) {
        clickOn(findProductByName(productName).findElement(By.cssSelector(".link-wishlist")));
    }


    public void addToCartByName(String product) {
        clickOn(findProductByName(product).findElement(By.className("btn-cart")));
    }

    public void clickOnProductByName(String product) {
        clickOn(findProductByName(product).findElement(By.className("product-image")));
    }


    public void setSortByDropdown(String value) {
        sortByDropdown.selectByVisibleText(value);
    }

    public boolean isSortByPriceAscending() {
        double firstPrice = getPriceFromProduct(webElementFacadeList.get(0));
        double lastPrice = getPriceFromProduct(webElementFacadeList.get(webElementFacadeList.size() - 1));
        if (firstPrice <= lastPrice) {
            return true;
        }
        return false;
    }

    private double getPriceFromProduct(WebElement webElement) {
        return Double.parseDouble(webElement.findElement(By.cssSelector(".price")).
                getText().substring(1));
    }


}