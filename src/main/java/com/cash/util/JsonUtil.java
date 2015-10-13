package com.cash.util;

import com.cash.domain.User;
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

    public static void addEle(User role) {
        List<User> userList = getJson();
        if (userList == null) {
            userList = new ArrayList<>();
        }
        userList.add(role);
        rewriteToJsonFile(userList);

    }

    private static void rewriteToJsonFile(List<User> userList) {
        try {
            BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(JSON_FILE_NAME), "UTF-8"));
            String json = gson.toJson(userList);
            writer.write(json);
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void deleteEle(int userId) {
        List<User> userList = getJson();
        if (userList == null || userList.size() == 0) {
            return;
        }

        for (User user : userList) {
            if (user.getUserId() == userId) {
                userList.remove(user);
                break;
            }
        }

        rewriteToJsonFile(userList);
    }

    public static void updateEle(User user) {
        List<User> userList = getJson();
        if (userList == null || userList.size() == 0) {
            System.out.println("这个用户没有注册");
            return;
        }

        for (int i = 0; i < userList.size(); i++) {
            if (userList.get(i).equals(user)) {
                userList.set(i, user);
                break;
            }
        }

        rewriteToJsonFile(userList);
    }

    public static List<User> getJson() {
        List<User> roleList = null;
        try {
            BufferedReader reader = new BufferedReader(new FileReader(new File(JSON_FILE_NAME)));
            roleList = gson.fromJson(reader, new TypeToken<List<User>>() {
            }.getType());
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return roleList;
    }
}
