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
         int initLoanAmount = 10000;
         int initloanPeriod = 10;
        def id = getClientId();
        for (def a = 0; a <11; a++) {
            for (def i = 0; i < 18; i++) {
                def response = given().headers("Content-Type", "application/json").body("{\"loanAmount\":$initLoanAmount,\"loanPeriod\":$initloanPeriod,\"clientId\":\"$id\"}").put('http://157.230.77.139:3000/v1/client').then()
                        .assertThat()
                        .statusCode(200)
                        .extract()
                        .asString()
                JsonSlurper slurper = new JsonSlurper()
                def object = slurper.parseText(response)
                println("response=" + response);
                println("initLoanAmount=" + initLoanAmount);
                println("initloanPeriod=" + initloanPeriod);
                int expectedPayment = (initLoanAmount / initloanPeriod)
                Assert.assertEquals(object.payment, expectedPayment);
                initLoanAmount = initLoanAmount + 5000;
            }
            initloanPeriod = initloanPeriod + 10;
        }

    }
}
