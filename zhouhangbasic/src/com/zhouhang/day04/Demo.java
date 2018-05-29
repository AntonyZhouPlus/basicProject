package com.zhouhang.day04;

import java.util.Scanner;

/**
 * DemoScanner code
 *
 * @author Zhouhang Anthony
 * @date 2018/5/11 16:34
 */
public class Demo {
    public static void main(String[] args) {
        /*Scanner sc = null;
        int a = 0;
        int b = 0;

        System.out.println("输入两个数字：");
        a = sc.nextInt();
        b = sc.nextInt();
        sc = new Scanner(System.in);

        System.out.println(judgement(a, b));
        System.out.println(method03(4, 2, 3, true));
        System.out.println(method04());
        System.out.println(method05(16));
        System.out.println(method07(5, 6));
        System.out.println(method08(1, 2, 4));
        System.out.println(methiod09(23, 12));
        System.out.println(methiod10(100, 100, 200));*/




    }

    public static int methiod10(int a, int b, int c) {
        /*8. 定义方法，接收三个int数，返回三个数的中间值，如果有且仅有两个数相同，则返回最小值，如果都相同则返回0；*/
        if (a == b && b == c) {
            return 0;
        }

        int minNum = a < b ? a : b;
        minNum = minNum < c ? minNum : c;
        if ( a == b || a == c || b == c) {
            return minNum;
        }

        int maxNum = a > b ? a : b;
        maxNum = maxNum > c ? maxNum : c;
        int midNum = a + b + c - maxNum - minNum;
        return midNum;

    }

    public static boolean methiod09(int a, int b) {
        /*7.定义方法，接收两个int数，范围在10到99之间，如果有一个数字都出现在两个数当中，则返回true。例如，"23"和"12"中都有2，则返回值为true。*/
        int aShi = a / 10 % 10;
        int aGe = a % 10;
        int bShi = b / 10 % 10;
        int bGe = b % 10;

        if (aShi == bShi || aShi == bGe) {
            return true;
        }
        if (aGe == bShi || aGe == bGe) {
            return true;
        }

        return false;


    }

    public static boolean method08(int a, int b, int c) {
        /*5.定义方法，接收三个int，a b c，如果b或c中的一个是与a相差最多为1，并且另一个与其他两个值相差2或者更大，则返回true。*/
        if (b >= a - 1 && b <= a + 1) {
            if ((c <= a - 2 || c >= a + 2) && (c <= b - 2 || c >= b + 2)) {
                return true;
            }
        }
        if (c >= a - 1 && c <= a + 1) {
            if ((b <= a - 2 || b >= a + 2) && (b <= c - 2 || b >= c + 2)) {
                return true;
            }
        }
        return false;


    }

    public static int method07(int a, int b) {
        /*6. 定义方法，接收两个整数，返回他们的和。如果所得的和在10到19之间（包括），则返回20.*/
        int sum = a + b;
        if (sum >= 10 && sum <= 19) {
            return 20;
        }

        return sum;

    }

    public static boolean method06(byte a, byte b) {
        return a == b;
    }

    public static boolean method06(int a, int b) {
        return a == b;
    }

    public static boolean method06(short a, short b) {
        return a == b;
    }

    public static boolean method06(long a, long b) {
        return a == b;
    }

    public static boolean method05(int x) {
        /*4. 定义方法，接收一个非负数，如果是3或者5的倍数，则返回true；但如果是3和5共同的倍数则返回false；*/
        if (x < 0) {
            System.out.println("输入错误");
            return false;
        }
        if (x % 3 == 0 || x % 5 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static int method04() {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum += i;
        }

        return sum;
    }

    public static boolean method03(int a, int b, int c, boolean bOk) {
        /*3. 定义方法，接收三个整型参数，a，b，c；和布尔类型的 "bOk"参数，如果b大于a且c大于b，则返回true。如果bOK为true时，b可以不大于a。*/

        if (bOk) {
            if (c > b) {
                return true;
            }
        } else {
            if (b > a && c > b) {
                return true;
            }
        }

        return false;
    }

    public static boolean judgement(int a, int b) {
        /* 2. 定义方法，接收2个int值，如果任意一个在10..20范围内，则返回true。数字范围包含边界*/
        if (a >= 10 && a <= 10) {
            return true;
        } else if (b >= 10 && b <= 20) {
            return true;
        } else {
            return false;
        }

    }
}
