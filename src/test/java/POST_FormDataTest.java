import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import io.restassured.http.ContentType;

public class POST_FormDataTest {
    private static final String BASE_URL = "https://postman-echo.com";

    @Test
    void testPostFormData() {
        given()
                .contentType(ContentType.URLENC)
                .formParam("foo1", "bar1")
                .formParam("foo2", "bar2")
                .when()
                .post(BASE_URL + "/post")
                .then()
                .statusCode(200)
                .body("form.foo1", equalTo("bar1"))
                .body("form.foo2", equalTo("bar2"));
    }
}
