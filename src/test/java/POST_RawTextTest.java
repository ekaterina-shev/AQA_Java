import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import io.restassured.http.ContentType;

public class POST_RawTextTest {
    private static final String BASE_URL = "https://postman-echo.com";

    @Test
    void testPostRawText() {
        String payload = "This is expected to be sent back as part of response body.";

        given()
                .body(payload)
                .contentType(ContentType.TEXT)
                .when()
                .post(BASE_URL + "/post")
                .then()
                .statusCode(200)
                .body("data", equalTo(payload));
    }
}
