package pageObjects

import geb.Page

class TheBookOfGebPage extends Page {

    // Every page must have its own At validator and a static content

    static at = { title.startsWith("The Book Of Geb") }
}
