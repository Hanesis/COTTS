package tools

import groovy.json.JsonSlurper
import org.junit.Assert

import static io.restassured.RestAssured.get

trait Helper {
    String getClientId() {
        def response = get('http://157.230.77.139:3000/v1/client').then()
                .assertThat()
                .statusCode(200)
                .extract()
                .asString()
        JsonSlurper slurper = new JsonSlurper()
        def object = slurper.parseText(response)
        return object.body._id
    }

}