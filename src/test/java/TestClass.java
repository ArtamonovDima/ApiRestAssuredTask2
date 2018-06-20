import Data.JsonDataClass;
import Helpers.Converter;
import com.sun.scenario.Settings;
import io.restassured.http.ContentType;

import io.restassured.response.Response;
import org.testng.annotations.Test;
import pojo.ClassForInit;

import static io.restassured.RestAssured.*;
import static io.restassured.RestAssured.basePath;
import static org.hamcrest.Matchers.equalTo;


public class TestClass {

    @Test (description = "вызов метода init")
    public void initMethod(){

        ClassForInit init = new ClassForInit("testDEMO", "2000", "h6");
        Converter.toJSON(init, JsonDataClass.getInitFile());

        Response resp =
        given().
                contentType(ContentType.JSON).
                body(JsonDataClass.getInitFile())
                .when().post("https://rest-api-test.tcsbank.ru/v2/Init")
                .then().extract().response();

        System.out.println(resp.asString());

        }


}
