package com.software.game.airhockeyandroid.NetworkRequest;

import com.software.game.airhockeyandroid.Entities.Player;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by Abhishek on 10/13/2015.
 */
public class JSONManager {

    public void parseJSON(JSONObject object){
        try {
            JSONArray array = object.getJSONArray("players");
            String username=array.getJSONObject(0).getString("username");
            int coins=array.getJSONObject(0).getInt("coins");
            int games_lost = array.getJSONObject(0).getInt("games_lost");
            int games_won = array.getJSONObject(0).getInt("games_won");
            int rank = array.getJSONObject(0).getInt("rank");
            Player player = Player.getInstance(username,coins,rank,games_won,games_lost);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
}
