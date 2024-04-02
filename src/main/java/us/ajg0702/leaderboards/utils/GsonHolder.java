package us.ajg0702.leaderboards.utils;

import com.google.gson.Gson;

public class GsonHolder {
    private static final Gson gson = new Gson();

    public static Gson getGson() {
        return gson;
    }
}
