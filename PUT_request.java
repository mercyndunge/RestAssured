import io.restassured.http.ContentType;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import org.json.simple.JSONObject;

import java.util.HashMap;
import java.util.Map;

public class PUT_request {
    @Test
    void test_3(){
        Map<String, Object> map = new HashMap<String, Object>();

        map.put("name", "Mercy");
        map.put("job", "Teacher");

        JSONObject request = new JSONObject(map);
        System.out.println(request.toJSONString());

        given().
                header("Content-Type", "application/json").
                contentType(ContentType.JSON).
                accept(ContentType.JSON).
                body(request.toJSONString()).

                when().
                put("https://reqres.in/api/users/2").
                then().
                statusCode(200).
                log().all();

    }
}
