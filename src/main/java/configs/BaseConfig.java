package configs;


import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class BaseConfig {
    private static Gson gson;

    public static Gson getGson() {
        if(gson == null){
            gson = new GsonBuilder()
                    .setPrettyPrinting()
                    .setDateFormat("yyyy-MM-dd  HH:mm:ss")
                    .create();
        }
        return gson;
    }
}
