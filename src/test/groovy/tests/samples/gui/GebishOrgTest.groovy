package tests.samples.gui

import geb.junit4.GebReportingTest
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.JUnit4
import pageObjects.GebishOrgHomePage
import pageObjects.TheBookOfGebPage

@RunWith(JUnit4)
class GebishOrgTest extends GebReportingTest {

    private GebishOrgHomePage gebishOrgHomePage

    @Test
    void canGetToTheCurrentBookOfGeb() {
        given:
        openedGebishOrgHomePageAndOpenedManualsMenu()

        when:
        assert gebishOrgHomePage.manualsMenu.links[0].text().startsWith("current") //first link is for the current manual
        gebishOrgHomePage.manualsMenu.links[0].click()

        then:
        at(TheBookOfGebPage)
    }

    void openedGebishOrgHomePageAndOpenedManualsMenu() {
        gebishOrgHomePage = to(GebishOrgHomePage)
        gebishOrgHomePage.manualsMenu.open()
    }
}