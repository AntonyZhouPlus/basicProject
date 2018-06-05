package com.zhouhang.day05homework;

import jdk.nashorn.api.scripting.ScriptObjectMirror;

import java.util.HashMap;
import java.util.Map;

/**
 * com.zhouhang.day05homework
 *
 * @author zhouhang
 * @date 2018/6/5 上午8:39
 * 用于解释java是传地址还是传值
 */
public class Test03 {
    public static void main(String[] args) {
        Map<String,String> map2 = new HashMap<>();
        setMap(map2);
        System.out.println(map2); // {key=123}

    }

    public static void setMap(Map map){
        map.put("key","123");
        map = null;

    }
}
