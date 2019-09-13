package pageObjects

import geb.Page
import modules.ManualsMenuModule

class GebishOrgHomePage extends Page {

    // Every page must have its own At validator and a static content

    static at = { title == "Geb - Very Groovy Browser Automation" }

    static content = {
        manualsMenu { module(ManualsMenuModule) }
    }
}
