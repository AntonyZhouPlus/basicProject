package com.itheima07.packageclass;
/*
  基本类型--->String
      比如 12+""
  String转换为对应的基本类型


    除了Character类之外，其他所有包装类都具有parseXxx静态方法可以将字符串参数转换为对应的基本类型：
 */
public class Demo03PackageClass {

    public static void main(String[] args) {
        // 将字符串转换成double类型
        String s = "3.14";
        double d = Double.parseDouble(s);

        // 将字符串转换成 boolean类型
        String sf = "true";
        boolean flag = Boolean.parseBoolean(sf);


        // 将字符串转换成int类型
        String si = "flag";
        int i = Integer.parseInt(si);
        //NumberFormatException:
    }
}
