package com.imooc;

import java.util.HashMap;
import java.util.Map;

/**
 * @Description
 * @Author Gao Hang Hang
 * @Date 2020-06-24 00:35
 **/
public class TestMap {

    public static void main(String[] args) {
        Map<String, Integer> userMap = new HashMap<>();
        userMap.put("zhangsan3", new Integer(120));
        userMap.put("zhangsan4", new Integer(130));
        userMap.put("zhangsan5", new Integer(140));
        Integer n = userMap.get("zhangsan4");
        System.out.println(n + "=======");
    }

}
