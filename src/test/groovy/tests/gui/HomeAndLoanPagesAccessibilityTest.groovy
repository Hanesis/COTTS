package tests.gui

import geb.junit4.GebReportingTest
import geb.pageObjects.HomePage
import geb.pageObjects.LoanPage
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.JUnit4
import tools.Helper

@RunWith(JUnit4)
class HomeAndLoanPagesAccessibilityTest extends GebReportingTest implements Helper{

    private HomePage homePage
    private LoanPage loanPage

    @Test
    void openHomePageAndValidateLoanPageAccessibility() {
        given:
        homePage = to(HomePage)

        when:
        homePage.clickOnButton()

        then:
        loanPage = at(LoanPage)
        assert loanPage.isLoanButtonVisible()
    }
}
