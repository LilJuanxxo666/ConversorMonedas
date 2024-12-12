package co.alura.conversor.modules;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
public class Request {

    public Base consultar(String base, String divisaConvertir) {

        base = base.toUpperCase();
        divisaConvertir = divisaConvertir.toUpperCase();
        String url_str = "https://v6.exchangerate-api.com/v6/bd11ebc64e8e53e2a20af221/latest/" + base;
        JsonObject jsonobj = null;
        try {
            // Making Request
            URL url = new URL(url_str);
            HttpURLConnection request = (HttpURLConnection) url.openConnection();
            request.connect();

            // Convert to JSON
            JsonParser jp = new JsonParser();
            JsonElement root = jp.parse(new InputStreamReader((InputStream) request.getContent()));
            jsonobj = root.getAsJsonObject();

        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Accessing object
        String base_code = jsonobj.get("base_code").getAsString();
        JsonObject conversion_rates = jsonobj.getAsJsonObject("conversion_rates");

        List<Divisa> divisas = new ArrayList<>();
        divisas.add(new Divisa(base, conversion_rates.get(base).getAsDouble()));
        divisas.add(new Divisa(divisaConvertir, conversion_rates.get(divisaConvertir).getAsDouble()));
        return new Base(base_code, divisas);
    }
}