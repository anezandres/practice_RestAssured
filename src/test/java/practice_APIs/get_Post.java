package practice_APIs;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.testng.annotations.Test;

public class get_Post {
    @Test
    public void validatePrettyPrint(){
        RestAssured.given()
                .when()
                .get("https://jsonplaceholder.typicode.com/posts")
                .prettyPrint();
    }
    @Test
    public void validateStatusCode(){
        RestAssured.given()
                .when()
                .get("https://jsonplaceholder.typicode.com/posts")
                .then()
                .assertThat()
                .statusCode(200);
    }
    @Test
    public void validateContentType(){
        RestAssured.given()
                .when()
                .get("https://jsonplaceholder.typicode.com/posts")
                .then()
                .assertThat()
                .contentType(ContentType.JSON);
    }
}
