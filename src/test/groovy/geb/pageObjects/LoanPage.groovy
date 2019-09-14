package geb.pageObjects

import geb.Page

class LoanPage extends Page {

    static url = "/cashloan"

    static at = {
        title == "Banka - sjednání půjčky"
        loanButton
    }

    static content = {
        loanButton { $(".MuiButton-label") }
    }

    void clickOnLoanCalculatorPageNavigationButton() {
        loanButton.click()
    }

    boolean isLoanButtonVisible() {
        loanButton.isDisplayed()
    }
}
