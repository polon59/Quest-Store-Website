package com.codecool.app.controler;


import com.sun.net.httpserver.Headers;
import com.sun.net.httpserver.HttpExchange;

import java.io.*;
import java.net.URLDecoder;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Common {

    static void redirect(HttpExchange httpExchange, String location) {
        Headers headers = httpExchange.getResponseHeaders();
        headers.add("Location", location);
        try {
            httpExchange.sendResponseHeaders(302, -1);
        } catch (IOException e) {
            e.printStackTrace();
        }
        httpExchange.close();

    }

    static void sendResponse(HttpExchange httpExchange, String response) {
        httpExchange.sendResponseHeaders(200, response.length());
        OutputStream os = httpExchange.getResponseBody();
        os.write(response.getBytes());
        os.close();
    }

    static String[] parseUri(String URI) {
        String[] parts = URI.split("/");
        return parts;
    }


    static Map<String, String> formatData(HttpExchange httpExchange) throws UnsupportedEncodingException, IOException {
        InputStreamReader isr = new InputStreamReader(httpExchange.getRequestBody(), "utf-8");
        BufferedReader br = new BufferedReader(isr);
        String formData = br.readLine();

        System.out.println(formData);

        return parseFormData(formData);
    }

    static Map<String, String> parseFormData(String formData) throws UnsupportedEncodingException {
        Map<String, String> map = new HashMap<String, String>();
        String[] pairs = formData.split("&");
        for(String pair : pairs){
            String[] keyValue = pair.split("=");

            String value = new URLDecoder().decode(keyValue[1], "UTF-8");
            map.put(keyValue[0], value);
        }
        return map;
    }

}
