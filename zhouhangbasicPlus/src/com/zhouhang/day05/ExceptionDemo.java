package com.zhouhang.day05;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 * com.zhouhang.day05
 *
 * @author zhouhang
 * @date 2018/6/4 上午11:06
 */
public class ExceptionDemo {
    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy");
        try {

            Date parse = sdf.parse("123");
            int[] arr = {1,2,3};
            int i = arr[1];

            arr= null;
            int length = arr.length;

        }catch (ParseException pe){
            System.out.println(pe);
        }catch (RuntimeException re){
            System.out.println(re);
        }
        ArrayList list = new ArrayList();

        System.out.println(list);

    }
}
