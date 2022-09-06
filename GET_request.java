import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.hasItems;

import org.hamcrest.Matchers;

public class GET_request {

    @Test
    void test_1 (){

        given().
                get("https://reqres.in/api/users?page=2").
                then().
                statusCode(200).
                body("data.id[1]",equalTo(8)).
                body("data.first_name", hasItems("Michael", "Lindsay", "Tobias")).
                body("data.email", hasItems("michael.lawson@reqres.in", "lindsay.ferguson@reqres.in", "tobias.funke@reqres.in")).
                log().all();
    }

}
