package com.nexign.job.tests;

import org.junit.jupiter.api.*;

import static io.qameta.allure.Allure.step;

@DisplayName("Поиск на странице job.nexign.com")
public class SearchTest extends TestBase {
    private final static String vacancy = "Вакансии";
    private final static String searchVacancy = "Тестирование";
    private final static String actualVacancy = "QA Automation engineer";
    private final static String clickSendResume = "Откликнуться";
    private final static String checkSubmission = "Пришли своё резюме";
    private final static String textSelection = "\"";

    @BeforeEach
    public void openCheckPage() {
        step("Открываем страницу job.nexign.com", () -> {
            mainPage.openPage();
        });
    }

    @Test
    @Tag("UITest")
    @DisplayName("Поиск конкретной вакансии")
    void vacancySearchTest() {
        step(String.format("Нажимаем на вкладку %s", textSelection + vacancy + textSelection), () -> {
            mainPage.setOpenTab(vacancy);
        });

        step(String.format("Нажимаем на раздел %s", textSelection + searchVacancy + textSelection), () -> {
            mainPage.setSearchVacancyInput(searchVacancy);
        });

        step(String.format("Нажимаем на вакансию %s", textSelection + actualVacancy + textSelection), () -> {
            mainPage.setActualVacancyInput(actualVacancy);
        });

        step(String.format("Нажимаем на кнопку %s", textSelection + clickSendResume + textSelection), () -> {
            mainPage.setClickSendResumeInput(clickSendResume);
        });

        step(String.format("Переход на форму %s", textSelection + checkSubmission + textSelection), () -> {
            mainPage.setCheckSubmissionInput(checkSubmission);
        });
    }
}