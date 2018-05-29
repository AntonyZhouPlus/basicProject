package com.zhouhang.day08;

/**
 * basicProject
 *
 * @author Zhouhang Anthony
 * @date 2018/5/18 16:27
 */
public class Demo03 {

    public static void main(String[] args) {
        String str = "I Love U";
        byte[] bytes = str.getBytes();
        for (int i = 0; i < bytes.length; i++) {
            System.out.print(bytes[i] + "\t");
        }

        byte aC = 'A';
        byte aS = 'a';
        System.out.println(aC);
        System.out.println(aS);
        int countC = 0;
        int countS = 0;
        int countN = 0;
        int countO = 0;

        for (int i = 0; i < bytes.length; i++) {
            if (bytes[i] > (byte) 'A' && bytes[i] < (byte) 'Z') {
                countC++;
            }else if(bytes[i] > (byte) 'a' && bytes[i] < (byte) 'z'){
                countS++;
            }else if(bytes[i] > (byte) '0' && bytes[i] < (byte) '9'){
                countN++;
            }else {
                countO++;
            }
        }

        System.out.println("C:" + countC + ",S:" + countS + ",N:" + countN + ",O:" + countO);

    }

}
