package geb.pageObjects

import geb.Page

class LoanCalculatorPage extends Page {

    static url = "/loan-calculator"

    static at = {
        title == "Půjčka - kalkulátor"
    }

    static content = {
        loanAmountSlider {  }
        loanDurationSlider {  }
    }

    void doSmth() {
        interact {
            clickAndHold($(".MuiSlider-root"))
            moveByOffset(150,0)
            release()
        }
    }
}
