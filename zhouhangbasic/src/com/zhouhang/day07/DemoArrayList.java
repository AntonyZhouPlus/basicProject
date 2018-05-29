package com.zhouhang.day07;

import java.util.ArrayList;
import java.util.Random;

/**
 * basicProject
 *
 * @author Zhouhang Anthony
 * @date 2018/5/17 15:01
 */
public class DemoArrayList {
    public static void main(String[] args) {
        // method01();
        // method02();
        // method03();
        // method04();
        // method05();
        // method06();
        // method07();
        // method08();
        // System.out.println(method09());

        // 有一分数序列：2/1，3/2，5/3，8/5，13/8，21/13... 定义一个方法求出这个数列的前20 项之和。
        ArrayList<Fraction> list = new ArrayList<Fraction>();
        Fraction f0 = new Fraction(2, 1);
        Fraction f1 = new Fraction(3, 2);
        list.add(f0);
        list.add(f1);
        for (int i = 2; i < 20; i++) {
            Fraction f = new Fraction();
            f.setNumerator(list.get(i - 2).getNumerator() + list.get(i - 1).getNumerator());
            f.setDenominator(list.get(i - 2).getDenominator() + list.get(i - 1).getDenominator());
            list.add(f);
        }
        System.out.println(list.size());
        System.out.println(list);

        Fraction sum = new Fraction();
        for (int i = 0; i < list.size(); i++) {
            sum.add(list.get(i));
        }
        System.out.println(sum);
    }


    public static ArrayList<Integer> method09() {
        // 定义方法，返回一个长度为10，并且元素为1到100之间随机数的集合，要求元素不能重复。
        ArrayList<Integer> list = new ArrayList<Integer>();
        Random rd = new Random();

        while (list.size() < 10) {
            int num = rd.nextInt(100) + 1;
            if (!list.contains(num)) {
                list.add(num);
            }
        }

        return list;
    }

    public static void method08() {
        ArrayList<Integer> b = new ArrayList<Integer>();

        Random rd = new Random();
        for (int i = 0; i < 20; i++) {
            b.add(rd.nextInt(20) + 1);
        }
        System.out.println(b);
        System.out.println(b.indexOf(3));
        System.out.println(returnIndex(b, 3));
    }

    public static int returnIndex(ArrayList<Integer> intList, int num) {
        // 定义方法，接收一个集合和一个集合的元素，返回此元素所在集合中位置的索引值，如果集合中不存在这样的元素，则返回-1
        for (int i = 0; i < intList.size(); i++) {
            if (num == intList.get(i)) {
                return i;
            }
        }
        return -1;
    }

    public static void method07() {
        // 随机生成6个1-100之间的整数存入ArrayList集合中，求这6个整数的最大值最小值和平均值并输出
        ArrayList<Integer> integerArrayList = new ArrayList<Integer>();
        Random rd = new Random();
        for (int i = 0; i < 6; i++) {
            int num = rd.nextInt(100) + 1;
            integerArrayList.add(num);
        }
        System.out.println(integerArrayList);
        int sum = 0;
        int max = integerArrayList.get(0);
        int min = integerArrayList.get(0);
        for (int i = 0; i < integerArrayList.size(); i++) {
            max = max > integerArrayList.get(i) ? max : integerArrayList.get(i);
            min = min < integerArrayList.get(i) ? min : integerArrayList.get(i);
            sum += integerArrayList.get(i);
        }
        System.out.println("max:" + max + ",min:" + min + ",avg:" + sum / integerArrayList.size());
    }

    public static void method06() {
        // 给出一个拥有20个随机数的大集合，利用getSmallList方法返回其中的偶数并组成一个小集合。
        ArrayList<Integer> b = new ArrayList<Integer>();

        Random rd = new Random();
        for (int i = 0; i < 20; i++) {
            b.add(rd.nextInt(20) + 1);
        }

        System.out.println(getSmallList(b));
    }

    public static ArrayList<Integer> getSmallList(ArrayList<Integer> b) {
        ArrayList<Integer> s = new ArrayList<Integer>();
        for (int i = 0; i < b.size(); i++) {
            if (b.get(i) % 2 == 0) {
                s.add(b.get(i));
            }
        }
        return s;
    }

    public static void method05() {
        ArrayList<Person> personArrayList = new ArrayList<Person>();
        Person person1 = new Person("zhouhang", 42);
        Person person2 = new Person("zhouhang2", 13);
        Person person3 = new Person("zhouhang2", 14);

        personArrayList.add(person1);
        personArrayList.add(person2);
        personArrayList.add(person3);

        for (int i = 0; i < personArrayList.size(); i++) {
            if (personArrayList.get(i).getAge() > 30) {
                System.out.println(personArrayList.get(i).getAge() + personArrayList.get(i).getName());
            }
        }
        System.out.println(personArrayList.get(2).getName());
    }

    public static void method04() {
        ArrayList<String> stringArrayList = new ArrayList<String>();
        stringArrayList.add("Xx");
        stringArrayList.add("yy");
        stringArrayList.add("yy");

        System.out.println(stringArrayList);
        printArrayList(stringArrayList);
    }

    public static void printArrayList(ArrayList<String> stringArrayList) {
         /*定义以指定格式打印集合的方法(ArrayList类型作为参数)，使用{}扩起集合，使用@分隔每个元素。
        格式参照 {元素@元素@元素}。*/
        System.out.print("{");
        for (int i = 0; i < stringArrayList.size(); i++) {
            if (i == stringArrayList.size() - 1) {
                System.out.println(stringArrayList.get(i) + "}");
            } else {
                System.out.print(stringArrayList.get(i) + "@");
            }
        }
    }

    public static void method03() {
        // 插入6个偶数进入ArrayList
        ArrayList<Integer> integerArrayList = new ArrayList<Integer>();
        Random random = new Random();

        /*for (int i = 0; i < 6; ) {
            int num = random.nextInt(33) + 1;
            if(num % 2 == 0){
                integerArrayList.add(num);
                i++;
            }
        }*/

        while (integerArrayList.size() < 6) {
            int num = random.nextInt(33) + 1;
            if (num % 2 == 0) {
                integerArrayList.add(num);
            }
        }

        System.out.println(integerArrayList);
    }

    public static void method02() {
        //往字符串集合中添加五个亚洲的首都名，删除其中一个，获取剩余的其他首都并输出
        ArrayList<String> stringArrayList = new ArrayList<String>();
        stringArrayList.add("Bangkok");
        stringArrayList.add("Tokyo");
        stringArrayList.add("Peking");
        stringArrayList.add("Seoul");
        stringArrayList.add("New Delhi");

        stringArrayList.remove("Peking");
        for (int i = 0; i < stringArrayList.size(); i++) {
            System.out.println(stringArrayList.get(i));
        }
    }

    public static void method01() {
        ArrayList<String> stringArrayList = new ArrayList<String>();
        stringArrayList.add("1");
        stringArrayList.add("2");
        stringArrayList.add("3");
        stringArrayList.add("4");
        stringArrayList.add("5");
        System.out.println(stringArrayList);
    }
}
