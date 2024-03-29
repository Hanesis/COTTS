package tests.api

import groovy.json.JsonSlurper
import org.junit.Assert
import org.junit.jupiter.api.Test

import static io.restassured.RestAssured.get

class C4_UniqIdTest {
    @Test
    void checkUniqId() {
        given:
        for (def i = 0; i < 50; i++) {
            def id = 0
            def response = get('http://157.230.77.139:3000/v1/client').then()
                    .assertThat()
                    .statusCode(200)
                    .extract()
                    .asString()
            JsonSlurper slurper = new JsonSlurper()
            def object = slurper.parseText(response)
            println("response=" + response);
            Assert.assertNotEquals(object.body._id, id, "Id for client is not unique");
        }
    }
}
