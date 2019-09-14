package geb.pageObjects

import geb.Page

class LoanPage extends Page {

    static at = {
        title == "Banka - sjednání půjčky"
        loanButton
    }

    static content = {
        loanButton { $(".MuiButton-label") }
    }

    void clickOnLoanButton() {
        loanButton.click()
    }

    boolean isLoanButtonVisible() {
        loanButton.isDisplayed()
    }
}
