package com.mycompany.KiparoProj.Executors;

import com.google.gson.Gson;
import com.mycompany.KiparoProj.helper.Choisable;
import com.mycompany.KiparoProj.model.NewsModel;
import okhttp3.*;

import java.io.IOException;
import java.util.logging.Logger;

public class JsonExecutor implements Choisable {

    private final String url;
    private final Gson gson = new Gson();
    private final Logger logger = Logger.getLogger(JsonExecutor.class.getName());


    public JsonExecutor(String url){
        this.url = url;
    }

    @Override
    public Object getData() {
        OkHttpClient okHttpClient = new OkHttpClient();
        try {
            Request request = new Request.Builder()
                    .url(url)
                    .build();

            Call call = okHttpClient.newCall(request);
            Response response = call.execute();
            if (response.isSuccessful()) {
                logger.info(String.format("SUCCESS OKCODE: %s", response.code()));
                ResponseBody body = okHttpClient.newCall(request).execute().body();
                assert body != null;
                return gson.fromJson(body.string(), NewsModel.class);
            }
        } catch (IOException e) {
            logger.info("Нет подключения к интернету.");
        }
        return null;
    }

}
