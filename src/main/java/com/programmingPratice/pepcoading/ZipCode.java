//package com.programmingPratice.pepcoading;
//
//
//
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.net.HttpURLConnection;
//import java.net.URL;
//import org.json.JSONArray;
//import org.json.JSONException;
//import org.json.JSONObject;
//public class ZipCode {
//    public static void main(String[] args) {
//        String zipCode = "73001"; // Example zip code//12401,90210, 99950
//
//        try {
//            String state = getStateFromZipCode(zipCode);
//            System.out.println("State for zip code " + zipCode + " is: " + state);
//        } catch (IOException e) {
//            e.printStackTrace();
//        } catch (JSONException e) {
//            throw new RuntimeException(e);
//        }
//    }
//
//    public static String getStateFromZipCode(String zipCode) throws IOException, JSONException {
//        String apiUrl = "https://api.zippopotam.us/us/" + zipCode;
//        URL url = new URL(apiUrl);
//        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
//        connection.setRequestMethod("GET");
//
//        int responseCode = connection.getResponseCode();
//        if (responseCode == HttpURLConnection.HTTP_OK) {
//            BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
//            String inputLine;
//            StringBuilder response = new StringBuilder();
//
//            while ((inputLine = in.readLine()) != null) {
//                response.append(inputLine);
//            }
//            in.close();String jsonResponse = response.toString();
//            JSONObject jsonObject = new JSONObject(jsonResponse);
//            JSONArray placesArray = jsonObject.getJSONArray("places");
//            JSONObject firstPlace = placesArray.getJSONObject(0);
//            String state = firstPlace.getString("state");
//            return state;
//        } else {
//            throw new IOException("Error response code: " + responseCode);
//        }
//    }
//}
