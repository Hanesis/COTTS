package tests.gui

import geb.junit4.GebReportingTest
import geb.pageObjects.HomePage
import geb.pageObjects.LoanCalculatorPage
import geb.pageObjects.LoanPage
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.JUnit4

@RunWith(JUnit4)
class C8_LoanCalculatorPageSlidersAndTitleTest extends GebReportingTest {

    private LoanCalculatorPage loanCalculatorPage
    private LoanPage loanPage

    @Test
    void openLoanCalculatorMoveSomeSlidersAround() {
        given:
        openedLoanCalculatorPage()

        when:

        then:
        println()

    }

    void openedLoanCalculatorPage() {
        to(HomePage)
        loanPage = to(LoanPage)
        loanPage.clickOnLoanCalculatorPageNavigationButton()
        loanCalculatorPage = at(LoanCalculatorPage)
    }
}
