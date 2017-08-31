package com.octa_v.customlistviewabsen;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class ParseJSON {
    public static String[] tanggal_absen;
    public static String[] jam_masuk;
    public static String[] jam_keluar;

    public static final String JSON_ARRAY = "result";
    public static final String KEY_TANGGAL_ABSEN = "tanggal_absen";
    public static final String KEY_JAM_MASUK = "jam__masuk";
    public static final String KEY_JAM_KELUAR = "jam_keluar";

    private JSONArray users = null;

    private String json;

    public ParseJSON(String json){
        this.json = json;
    }

    protected void parseJSON(){
        JSONObject jsonObject=null;
        try {
            jsonObject = new JSONObject(json);
            users = jsonObject.getJSONArray(JSON_ARRAY);

            tanggal_absen = new String[users.length()];
            jam_masuk = new String[users.length()];
            jam_keluar = new String[users.length()];

            for(int i=0;i<users.length();i++){
                JSONObject jo = users.getJSONObject(i);
                tanggal_absen[i] = jo.getString(KEY_TANGGAL_ABSEN);
                jam_masuk[i] = jo.getString(KEY_JAM_MASUK);
                jam_keluar[i] = jo.getString(KEY_JAM_KELUAR);
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
}