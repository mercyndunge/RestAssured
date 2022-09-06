import io.restassured.http.ContentType;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import org.json.simple.JSONObject;

import java.util.HashMap;
import java.util.Map;

public class POST_request {
    @Test
    void test_2(){
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
                post("https://reqres.in/api/users").
                then().
                statusCode(201);

    }
}
