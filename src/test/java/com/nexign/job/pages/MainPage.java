package com.nexign.job.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.byLinkText;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class MainPage {
    private final SelenideElement
            openTab = $("ul.header-new__list"),
            searchVacancyInput = $(".page-content"),
            actualVacancyInput = $(".view-content :nth-child(4) a"),
            clickSendResumeInput = $("#block-system-main"),
            checkSubmissionInput = $(".form-wrapper__content"),
            headerSubs = $("ul.header-new__list"),
            mainText = $("h1.hero-main-page__title");

    public MainPage openPage() {
        open("https://job.nexign.com/");
        return this;
    }

    public MainPage setOpenTab(String value) {
        openTab.shouldHave(text(value)).click();
        return this;
    }

    public MainPage setSearchVacancyInput(String value) {
        searchVacancyInput.$(byLinkText(value)).click();
        return this;
    }

    public MainPage setActualVacancyInput(String value) {
        actualVacancyInput.shouldHave(text(value)).click();
        return this;
    }

    public MainPage setClickSendResumeInput(String value) {
        clickSendResumeInput.shouldHave(text(value)).click();
        return this;
    }

    public MainPage setCheckSubmissionInput(String value) {
        checkSubmissionInput.shouldHave(text(value));
        return this;
    }

    public SelenideElement selectElementByName(String elemName) {
        return $(elemName);
    }

    public SelenideElement selectElementByText(String text) {
        return $(byText(text));
    }

    public SelenideElement getHeaderSubs() {
        return headerSubs;
    }

    public SelenideElement getMainText() {
        return mainText;
    }
}
