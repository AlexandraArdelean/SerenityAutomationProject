package com.evozon.features;

import com.github.javafaker.Faker;
import org.junit.Test;

public class RegisterTest extends BaseTest {
    @Test
    public void validRegisterTest() {
        Faker faker = new Faker();
        String firstName = faker.name().firstName();
        String middleName = faker.name().nameWithMiddle();
        String lastName = faker.name().lastName();
        String password = faker.internet().password(6, 20);
        registerSteps.navigateToRegisterPage();
        registerSteps.enterFirstName(firstName);
        registerSteps.enterMiddleName(middleName);
        registerSteps.enterLastName(lastName);
        registerSteps.enterEmailAddress(faker.internet().emailAddress());
        registerSteps.enterPassword(password);
        registerSteps.enterConfirmPassword(password);
        registerSteps.signUpForNewsletter();
        registerSteps.clickRegister();
        registerSteps.verifyUserIsRegistered(String.format("%s %s %s", firstName, middleName, lastName));
    }
}
