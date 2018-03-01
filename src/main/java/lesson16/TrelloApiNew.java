package lesson16;

import okhttp3.*;

import java.io.IOException;

public class TrelloApiNew {
    public static final String KEY = "efbed4e97465575aabd4fa15c4e5f520";
    public static final String TOKEN = "4b90f9f26e773dd89d561e9f8ce7b4ddfd21fc2c4986dfb78aca050e5fb008b9";
    OkHttpClient client = new OkHttpClient();

    public String post(String url, String json) throws IOException {
        RequestBody body = RequestBody.create(MediaType.parse("application/json; charset=utf-8"), json);
        Request request = new Request.Builder().url(url).post(body).build();
        Response response = client.newCall(request).execute();
        return response.body().string();
    }

    public String get(String url) throws IOException {
        Request request = new Request.Builder()
                .url(url)
                .build();

        Response response = client.newCall(request).execute();
        return response.body().string();
    }


    public String getBoardsList(String boardId) throws IOException {
        String url = ("https://api.trello.com/1/boards/" + boardId + "/lists?cards=all&key=" + KEY + "&token=" + TOKEN);
        String response = get(url);
        return response;


    }

    public String getLabeList(String boardId) throws IOException {
        String url = ("https://api.trello.com/1/boards/" +boardId + "/labels?cards=all&key=" + KEY + "&token=" + TOKEN);
        String response = get(url);
        return response;


    }
}
