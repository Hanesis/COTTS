package samples.api

import org.junit.jupiter.api.Test
import static io.restassured.RestAssured.*

// Must be run via JUNIT not via Gradle Tasks - Theyre made for GEB tests
class ApiTest {

    @Test
    void getGoogleBody() {
        given:
        def response = get('https://www.google.com').
                then().
                log().
                body()

        println respos
    }

}
