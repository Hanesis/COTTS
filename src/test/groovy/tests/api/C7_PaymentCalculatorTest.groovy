package tests.api

import groovy.json.JsonSlurper
import org.junit.Assert
import org.junit.jupiter.api.Test
import tools.Helper

import static io.restassured.RestAssured.get
import static io.restassured.RestAssured.given

// Must be run via JUNIT not via Gradle Tasks - Theyre made for GEB tests
class C7_PaymentCalculatorTest implements Helper{
    @Test
    void checkCalculator() {
        given:
         def id = getClientId();
         println("id="+id);
         def response = given().headers("Content-Type", "application/json").body("{\"loanAmount\":60000,\"loanPeriod\":20,\"clientId\":\"$id\"}").put('http://157.230.77.139:3000/v1/client').then()
                 .assertThat()
                 .statusCode(200)
            .extract()
            .asString()
        JsonSlurper slurper = new JsonSlurper()
        def object = slurper.parseText(response)
        println("response="+response);
        Assert.assertNotEquals(object.body.payment, id, "Id for client is not uniq");
    }
}
