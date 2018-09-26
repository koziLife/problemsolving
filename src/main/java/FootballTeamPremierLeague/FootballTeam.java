package FootballTeamPremierLeague;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class FootballTeam {

    public static void main(String[] args) {
        try {
            StringBuilder result = new StringBuilder();
            URL url = new URL("https://raw.githubusercontent.com/openfootball/football.json/master/2014-15/en.1.json");
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            BufferedReader rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            String line;
            while ((line = rd.readLine()) != null) {
                result.append(line);
            }
            rd.close();

            JsonObject jsonObject = new JsonParser().parse(result.toString()).getAsJsonObject();

            Gson gson = new Gson();
            JsonElement jsonElement = jsonObject.getAsJsonArray("rounds");
            Round rounds = gson.fromJson(jsonElement, Round.class);

            System.out.println(rounds);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
