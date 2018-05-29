package com.zhouhang.day04;

/**
 * DemoScanner code
 *
 * @author Zhouhang Anthony
 * @date 2018/5/12 9:02
 */
public class TestFromQiu {
    public static void main(String[] args) {
        /*打印出四位数字中个位+百位=十位+千位并且个位数为偶数，千位数为奇数的数字,并打印符合条件的数字的个数(符合条件的数字,每行显示5个,用空格隔开）
                打印格式:
        1012 1034 1056 1078 1100
        1122 1144 1166 1188 1210

        符合条件的数字总共有: 165个*/

        int numGe = 0;
        int numShi = 0;
        int numBai = 0;
        int numQian = 0;
        int count = 0;

        for (int num = 1000; num <= 9999; num++) {
            numGe = num % 10;
            numShi = num / 10 % 10;
            numBai = num / 100 % 10;
            numQian = num / 1000 % 10;

            if (numGe + numBai == numShi + numQian) {
                if (numQian % 2 != 0 && numGe % 2 == 0) {
                    System.out.print(num + " ");
                    count++;
                    if (count % 5 == 0) {
                        System.out.println();
                    }
                }
            }
        }


        System.out.println("count : " + count);
    }
}
