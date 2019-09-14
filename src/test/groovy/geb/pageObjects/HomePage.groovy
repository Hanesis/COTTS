package geb.pageObjects

import geb.Page

class HomePage extends Page{

    static at = {
        title == "Banka"
        button
    }

    static content = {
        button { $("a", title: "Sjednat půjčku") }
    }

    void clickOnButton() {
        button.click()
    }

}
