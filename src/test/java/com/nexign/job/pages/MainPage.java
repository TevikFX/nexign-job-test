package com.nexign.job.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.byLinkText;
import static com.codeborne.selenide.Selenide.*;

public class MainPage {
    private final SelenideElement
            vacancyInput = $("ul.header-new__list"),
            searchVacancyInput = $(".page-content"),
            actualVacancyInput = $(".view-content :nth-child(4) a"),
            clickSendResumeInput = $("#block-system-main"),
            checkSubmissionInput = $(".form-wrapper__content");

    public MainPage openPage() {
        open("https://job.nexign.com/");
        return this;
    }

    public MainPage setVacancyInput(String value) {
        vacancyInput.shouldHave(text(value)).click();
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

}
