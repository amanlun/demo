package com.lun.bito.api.demo.dao;

import java.text.SimpleDateFormat;
import java.util.*;
import com.google.gson.Gson; //

public class DataModelBO {

    public static String get(String query) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");

        switch (query) {
            case "1" : {
                List<Map> list = new ArrayList<>();

                for (int i = 0; i < 10; i++) {
                    Map<String, Object> map = new HashMap<>();

                    map.put("idx", i);
                    map.put("value", UUID.randomUUID().toString());
                    map.put("time", sdf.format(new Date()));
                    list.add(map);
                }
                Gson gson = new Gson();
                return gson.toJson(list);
            }
            case "2" :{
                List<Map> list = new ArrayList<>();

                for (int i = 0; i < 10; i++) {
                    Map<String, Object> map = new HashMap<>();

                    map.put("idx", i);
                    map.put("time", sdf.format(new Date()));
                    list.add(map);
                }
                Gson gson = new Gson();
                return gson.toJson(list);
            }
            default :
                return "[]";
        }
    }
}
