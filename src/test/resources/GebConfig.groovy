import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.chrome.ChromeOptions
import org.openqa.selenium.firefox.FirefoxDriver

waiting {
    includeCauseInMessage = true
    timeout = 15
    retryInterval = 0.5
    presets {
        pages {
            timeout = 1
        }
        quick {
            timeout = 2
        }
        medium {
            timeout = 5
        }
        WFListRefreshPeriod {
            timeout = 5
        }
    }
}

environments {

    // See: http://code.google.com/p/selenium/wiki/ChromeDriver
    chrome {
        atCheckWaiting = 1
        driver = { new ChromeDriver() }
    }

    // See: http://code.google.com/p/selenium/wiki/ChromeDriver
    chromeHeadless {
        driver = {
            ChromeOptions o = new ChromeOptions()
            o.addArguments('headless')
            new ChromeDriver(o)
        }
    }

    // See: http://code.google.com/p/selenium/wiki/FirefoxDriver
    firefox {
        atCheckWaiting = 1

        driver = { new FirefoxDriver() }
    }

}

baseUrl = "http://157.230.77.139:3000/" // TODO: this needs to be changed when actually testing
requirePageAtCheckers = true
atCheckWaiting = true

