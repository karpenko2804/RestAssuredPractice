package catfacts;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

/**
 *
 */
public class FactApiTest {
    @Test
    public void testIsAlive() {
        given().
                when().
                get("https://cat-fact.herokuapp.com").
                then().statusCode(200 );
    }
    @Test
    public void testFacts() {
        given().
                when().
                get("https://cat-fact.herokuapp.com/facts").
                then().statusCode(200 );

    }
}
