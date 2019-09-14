package geb.pageObjects

import geb.Page

class LoanCalculatorPage extends Page {

    static url = "/loan-calculator"

    static at = {
        title == "Půjčka - kalkulátor"
    }

    static content = {
        captcha { $(".jss163") }
        buttonToContinue(required: false) {$(".MuiButton-label")}
    }

    void clickOnCaptcha() {
        captcha.click()
    }

    void clickOnContinueButton() {
        buttonToContinue.click()
    }
}
