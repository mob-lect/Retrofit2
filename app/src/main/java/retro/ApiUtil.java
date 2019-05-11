package retro;

public class ApiUtil {

    private static final String BASE_URL = "http://ask.osify.com/wp-json/wp/";

    public static RetrofitInterface getServiceClass(){
        return RetrofitAPI.getRetrofit(BASE_URL).create(RetrofitInterface.class);
    }
}
