import io.restassured.path.json.JsonPath;
import org.json.JSONObject;

public class Json {
    public static Float getFloatFromJsonPath(String json, String path){
        return JsonPath.given(json).getFloat(path);
    }
    public static String getStringFromJsonPath(String json, String path){
        return JsonPath.given(json).getString(path);
    }
}