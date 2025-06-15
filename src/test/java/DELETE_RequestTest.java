import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import io.restassured.http.ContentType;

public class DELETE_RequestTest {
    private static final String BASE_URL = "https://postman-echo.com";

    @Test
    void testDeleteRequest() {
        String payload = "This is expected to be sent back as part of response body.";

        given()
                .body(payload)
                .contentType(ContentType.TEXT)
                .when()
                .delete(BASE_URL + "/delete")
                .then()
                .statusCode(200)
                .body("data", equalTo(payload));
    }
}
