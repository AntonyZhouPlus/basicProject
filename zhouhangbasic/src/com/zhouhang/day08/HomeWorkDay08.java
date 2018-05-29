package com.zhouhang.day08;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 * basicProject
 *
 * @author Zhouhang Anthony
 * @date 2018/5/18 20:17
 */
public class HomeWorkDay08 {

    public static void main(String[] args) {
//        test02();
//        System.out.println(getStr());
//        test05();


    }

    public static void test03() {
        Phone one = new Phone("Xiaomi",1999.0);
        Phone two = new Phone("Huawei",4999.0);
        one.call();
        one.playGame();
        one.sendMessage();
        two.call();
        two.playGame();
        two.sendMessage();
    }

    public static String getStr() {
        /*分析以下需求,并用代码实现
        定义String getStr()方法
        功能描述：
        获取长度为5的随机字符串
        字符串由随机的4个大写英文字母和1个0-9之间(包含0和9)的整数组成
                英文字母和数字的顺序是随机的*/
        Random rd = new Random();
        String str = "";
        int num = rd.nextInt(10);
        int index = rd.nextInt(5);
        for (int i = 0; i < 5; i++) {
            if(i == index){
                str+= num;
            }else {
                char c = (char) ('A' + rd.nextInt(26));
                str += c;
            }

        }
        return str;
    }

    public static String getStr2() {
        ArrayList<Character> list = new ArrayList<Character>();
        Random rd = new Random();
        char chNum = (char) (rd.nextInt(10) + 48);  // 生成一个随机的数字字符
        list.add(chNum);
        for (int i = 0; i < 4; i++) {
            char chBig =  (char) (rd.nextInt(26) + 65); // 生成四个随机的大写字符
            list.add(chBig);
        }
//        System.out.println(list);


        System.out.println("==================");

        String str = "";
        while(list.size() > 0) {
            int index = rd.nextInt(list.size()); // 0 - 4
            str += list.remove(index); //  从集合中随机删除元素 ， 并把随机删除的元素添加到字符串中
        }
        return str;

    }


    public static void test01() {
    /*分析以下需求，并用代码实现
        1.键盘录入一个大字符串,再录入一个小字符串
        2.统计小字符串在大字符串中出现的次数
        3.代码运行打印格式:
        请输入大字符串:woaiheima,heimabutongyubaima,wulunheimahaishibaima,zhaodaogongzuojiushihaoma
        请输入小字符串:heima

        控制台输出:共出现3次*/
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入大字符串:");
        String strB = sc.next();
        System.out.println("请输入小字符串");
        String strS = sc.next();
        int count = 0;

        for (int i = 0; i < strB.length() - strS.length() + 1; i++) {
            if (strB.substring(i, i + strS.length()).equals(strS)) {
                count++;
            }
        }

        System.out.println("共出现" + count + "次");
    }

}
