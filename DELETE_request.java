import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;


public class DELETE_request {
    @Test
    void test_4(){
                given().
                when().
                delete("https://reqres.in/api/users/2").
                then().
                statusCode(204).
                log().all();

    }
}
