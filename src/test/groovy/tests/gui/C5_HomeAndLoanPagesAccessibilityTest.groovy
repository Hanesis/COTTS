package tests.gui

import geb.junit4.GebReportingTest
import geb.pageObjects.HomePage
import geb.pageObjects.LoanPage
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.JUnit4

@RunWith(JUnit4)
class C5_HomeAndLoanPagesAccessibilityTest extends GebReportingTest {

    private HomePage homePage
    private LoanPage loanPage

    @Test
    void openHomePageAndValidateLoanPageAccessibility() {
        given:
        homePage = to(HomePage)

        when:
        homePage.clickOnLoanPageNavigationButton()

        then:
        loanPage = at(LoanPage)
        assert loanPage.isLoanButtonVisible()
    }
}
