package tests.api

import groovy.json.JsonSlurper
import org.junit.Assert
import org.junit.jupiter.api.Test
import tools.Helper

import static io.restassured.RestAssured.get
import static io.restassured.RestAssured.given

class C5_Validation  implements Helper{
    @Test
    void checkUniqId(){
        given:
        int initLoanAmount = 10000000;
        int initloanPeriod = 10;
        def id = getClientId();
        def response = given().headers("Content-Type", "application/json")
                .body( "{\"loanAmount\":$initLoanAmount,\"loanPeriod\":$initloanPeriod,\"clientId\":\"$id\"}").put('http://157.230.77.139:3000/v1/client').then()
                .assertThat()
                .statusCode(200)
                .extract()
                .asString()
        JsonSlurper slurper = new JsonSlurper()
        def object = slurper.parseText(response)
        println("response=" + response);
        println("initLoanAmount=" + initLoanAmount);
        println("initloanPeriod=" + initloanPeriod);


    }
}
