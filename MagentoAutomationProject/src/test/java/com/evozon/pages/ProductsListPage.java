package com.evozon.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.function.Function;

public class ProductsListPage extends BasePage {
    private static final NumberFormat format = NumberFormat.getInstance(Locale.UK);

    private static final Function<String, Double> priceParser = price -> {
        try {
            return format.parse(price.substring(1)).doubleValue();
        } catch (ParseException pe) {
            throw new RuntimeException(pe);
        }
    };

    private static final Function<WebElementFacade, Double> priceExtractor = element -> {
        By priceSelector;
        if (element.containsElements(By.cssSelector(".special-price"))) {
            priceSelector = By.cssSelector(".special-price .price");
        } else {
            priceSelector = By.className("price");
        }
        return priceParser.apply(element.find(priceSelector).getText());
    };
    private static final Function<WebElementFacade, String> nameExtractor = element -> element.find(By.className("product-name")).getText();
    private final By nextPageLinkBy = By.cssSelector(".category-products > .toolbar .next");
    @FindBy(css = ".products-grid > li")
    private List<WebElementFacade> productsList;
    @FindBy(css = ".category-products > .toolbar select[title='Sort By']")
    private WebElementFacade sortByDropdown;
    @FindBy(css = ".category-products > .toolbar .sort-by-switcher")
    private WebElementFacade sortOrderLink;
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

    public List<String> getProductNamesList() {
        return productsList.stream()
                .map(el -> el.find(By.className("product-name")).getText())
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

    public void clickSortOrderLink() {
        clickOn(sortOrderLink);
    }

    public boolean isSortByPriceAscending() {
        return isSortBy(priceExtractor, Comparator.naturalOrder());
    }

    public boolean isSortByPriceDescending() {
        return isSortBy(priceExtractor, Comparator.reverseOrder());
    }

    public boolean isSortByNameAscending() {
        return isSortBy(nameExtractor, Comparator.naturalOrder());
    }

    public boolean isSortByNameDescending() {
        return isSortBy(nameExtractor, Comparator.reverseOrder());
    }


    private <T> boolean isSortBy(Function<WebElementFacade, T> extractor, Comparator<T> comparator) {
        List<T> values = productsList.stream().map(extractor).toList();
        List<T> sortedValues = new ArrayList<>(values);
        sortedValues.sort(comparator);
        values.forEach(System.out::println);
        System.out.println();
        sortedValues.forEach(System.out::println);
        return values.equals(sortedValues);
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