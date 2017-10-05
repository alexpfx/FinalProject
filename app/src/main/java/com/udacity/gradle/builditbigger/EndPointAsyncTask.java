package com.udacity.gradle.builditbigger;

import android.os.AsyncTask;
import android.util.Log;

import com.github.alexpfx.backend.jokeApi.model.MyBean;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;

import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

/**
 * Created by alexandre on 04/10/17.
 * http://localhost:8080/_ah/api/jokeApi/v1/tellAJoke
 * https://api-project-964136514052.appspot.com/?
 */
public class EndPointAsyncTask extends AsyncTask<Void, Void, String> {
    private static final String TAG = "EndPointAsyncTask";
    Gson gson = new GsonBuilder().create();
    private OkHttpClient client;
    private Listener listener;

    public EndPointAsyncTask(Listener listener) {
        this.listener = listener;
    }

    @Override
    protected void onPostExecute(String s) {
        listener.onResult(s);
    }

    @Override
    protected String doInBackground(Void... param) {

        if (client == null) {
            client = new OkHttpClient();
        }

        String base = "https://api-project-964136514052.appspot.com";
        String url = base + "/_ah/api/jokeApi/v1/tellAJoke";
        MediaType jsonMediaType = MediaType.parse("application/json; " +
                "charset=utf-8");
        RequestBody body = RequestBody.create(jsonMediaType, "{}");

        Request request = new Request.Builder().url(url).post(body).build();

        String joke = null;
        try {
            Response response = client.newCall(request).execute();
            MyBean myBean = gson.fromJson(response.body().string(), MyBean.class);
            joke = myBean.getData();

        } catch (IOException e) {
            Log.e(TAG, "doInBackground: ", e);
        }

        return joke;
    }

    interface Listener {
        void onResult(String result);
    }
}
