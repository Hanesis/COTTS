package samples.api

import groovy.json.JsonSlurper
import org.junit.jupiter.api.Test

import static io.restassured.RestAssured.get

// Must be run via JUNIT not via Gradle Tasks - Theyre made for GEB tests
class uniqId4 {
    @Test
    void getGoogleBody() {
        given:
        for (i = 0; i <150; i++) {
            System.out.println("Hello World")
        }
        def response = get('http://157.230.77.139:3000/v1/client').then()
                .assertThat()
                .statusCode(200)
                .extract()
                .asString()
        JsonSlurper slurper = new JsonSlurper()
        def object = slurper.parseText(response)
        println(object)
        println("asda")
        println(object.body._id)
//        assert result._id == "Guillaume"
    }
}
