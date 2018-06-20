package Helpers;

import com.fasterxml.jackson.databind.ObjectMapper;
import pojo.PojoParent;

import java.io.File;
import java.io.IOException;

public class Converter {

    public static void toJSON(PojoParent pojo, String file) {
        try {
            ObjectMapper mapper = new ObjectMapper();
            mapper.writeValue(new File(file), pojo);
        } catch (Exception e) {
            System.out.print("error-serializ");
        }
    }

    public static PojoParent toJavaObject(String file) {
        try {
            ObjectMapper mapper = new ObjectMapper();
            return mapper.readValue(new File(file), PojoParent.class);
        } catch (Exception e) {
            System.out.print("error-deserializ");
            return null;
        }
        }
}
