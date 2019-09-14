package geb.pageObjects

import geb.Page

class HomePage extends Page{

    static at = {
        title == "Banka"
        button
    }

    static content = {
        button { $("a:nth-child(2)") } // JQUERY ?!?!?!?!?!?
    }

    void clickOnLoanPageNavigationButton() {
        button.click()
    }

}
