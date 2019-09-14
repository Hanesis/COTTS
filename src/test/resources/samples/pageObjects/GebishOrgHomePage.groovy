package samples.pageObjects

import geb.Page
import samples.modules.ManualsMenuModule

class GebishOrgHomePage extends Page {

    // Every page must have its own At validator and a static content

    static at = { title == "Geb - Very Groovy Browser Automation" }

    static content = {
        manualsMenu { module(ManualsMenuModule) }
    }
}
