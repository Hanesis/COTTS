package samples.api

import groovy.json.JsonSlurper
import org.junit.Assert
import org.junit.jupiter.api.Test

import static io.restassured.RestAssured.get

// Must be run via JUNIT not via Gradle Tasks - Theyre made for GEB tests
class uniqId4 {
    @Test
    void checkUniqId() {
        given:
        for (i = 0; i <50; i++) {
            def id = 0
            def response = get('http://157.230.77.139:3000/v1/client').then()
                    .assertThat()
                    .statusCode(200)
                    .extract()
                    .asString()
            JsonSlurper slurper = new JsonSlurper()
            def object = slurper.parseText(response)
            Assert.assertNotEquals(object.body._id, id);
            println(object.body._id)
        }

    }

    @Test
    void checkCalculator() {
        given:
        for (def i = 0; i <50; i++) {
            def id = 0
            def response = get('http://157.230.77.139:3000/v1/client').then()
                    .assertThat()
                    .statusCode(200)
                    .extract()
                    .asString()
            JsonSlurper slurper = new JsonSlurper()
            def object = slurper.parseText(response)
            Assert.assertNotEquals(object.body._id, id);
        }
    }
}
