package com.cash.util;

import com.cash.pojo.User;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * 用来处理本地json测试数据的工具类
 */
public class JsonUtil {

    private static Gson gson = new Gson();

    private static final String JSON_FILE_NAME = "src/test/resources/jsons/Users.json";

    public static void addToJsonFile(User role) {
        try {
            List<User> userList = getJson();
            if (userList == null) {
                userList = new ArrayList<>();
            }
            userList.add(role);
            BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(JSON_FILE_NAME), "UTF-8"));
            String json = gson.toJson(userList);
            writer.write(json);
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<User> getJson() {
        List<User> roleList = null;
        try {
            BufferedReader reader = new BufferedReader(new FileReader(new File(JSON_FILE_NAME)));
            roleList = gson.fromJson(reader, new TypeToken<List<User>>() {}.getType());
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return roleList;
    }
}
