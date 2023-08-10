package com.evozon.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ProductsListPage extends BasePage {
    private final By nextPageLinkBy = By.cssSelector(".category-products > .toolbar .next");
    @FindBy(css = "li.item")
    private List<WebElementFacade> productsList;
    @FindBy(css = ".category-products > .toolbar select[title='Sort By']")
    private WebElementFacade sortByDropdown;
    @FindBy(css = ".page-title h1")
    private WebElementFacade pageTitleHeading;

    public boolean isLastPage() {
        return find(nextPageLinkBy) == null || !find(nextPageLinkBy).isVisible();
    }

    public void goToNextPage() {
        clickOn(find(nextPageLinkBy));
    }

    public String getPageTitleHeadingText() {
        return pageTitleHeading.getText();
    }

    public void refreshProductList() {
        getDriver().navigate().refresh();
    }

    public boolean isProductInList(String product) {
        return findProductByName(product) != null;
    }

    public void clickAddToWishlistBtn(String productName) {
        clickOn(findProductByName(productName).find(By.cssSelector(".link-wishlist")));
    }

    public List<String> getProductLinksList() {
        return productsList.stream()
                .map(el -> el.find(By.className("product-image")).getAttribute("href"))
                .toList();
    }

    public void clickOnProductByWebElement(WebElementFacade webElementFacade) {
        clickOn(webElementFacade.find((By.className("product-image"))));
    }


    public void addToCartByName(String product) {
        clickOn(findProductByName(product).find(By.className("btn-cart")));
    }

    public void clickOnProductByName(String product) {
        clickOn(findProductByName(product).find(By.className("product-image")));
    }


    public void setSortByDropdown(String value) {
        sortByDropdown.selectByVisibleText(value);
    }

    public boolean isSortByPriceAscending() {
        double firstPrice = getPriceFromProduct(productsList.get(0));
        double lastPrice = getPriceFromProduct(productsList.get(productsList.size() - 1));
        if (firstPrice <= lastPrice) {
            return true;
        }
        return false;
    }

    private double getPriceFromProduct(WebElement webElement) {
        return Double.parseDouble(webElement.findElement(By.cssSelector(".price")).
                getText().substring(1));
    }

    private WebElementFacade findProductByName(String product) {
        Assert.assertNotNull(productsList);
        for (WebElementFacade element : productsList) {
            if (element.findElement(By.cssSelector(".product-name")).getText().equalsIgnoreCase(product)) {
                return element;
            }
        }
        return null;
    }


}