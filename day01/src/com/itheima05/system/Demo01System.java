package com.itheima05.system;
/*
  java.lang.System类 定义了与系统相关的功能
    静态的
 主要的功能
   public static long currentTimeMillis()：返回以毫秒为单位的当前时间。
   public static void arraycopy(Object src, int srcPos, Object dest, int destPos, int length)：将数组中指定的数据拷贝到另一个数组中。
 */
public class Demo01System {
    public static void main(String[] args) {
        // 获取当前时间毫秒值
//        System.out.println(System.currentTimeMillis());

        // 求一个循环执行的时间 ？
        getTime();
    }
    /*
      求 循环10W 输出 我爱JAVA 这个语句 执行的时间是多长
     */
    private static void getTime() {
        // 先获取执行前的时间毫秒值
        long start = System.currentTimeMillis();
        for (int i = 0; i <100000 ; i++) {
            System.out.println("我爱JAVA "+i);
        }
        long end = System.currentTimeMillis();


        // 在获取执行后的时间毫秒值
        System.out.println("该循环执行了："+(end-start)+"毫秒");
    }
}
