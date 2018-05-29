package com.zhouhang.test;

/**
 * basicProject
 *
 * @author Zhouhang Anthony
 * @date 2018/5/15 10:30


/*某同学参加计算机大赛：（用switch语句）
如果获得第1名，将参加清华大学组织的1个月夏令营；
如果或得第2名，将奖励联想笔记本电脑一部；
如果获得第3名，将奖励移动硬盘一个；
否则没有任何奖励；*/
public class Test04 {
    public static void main(String[] args) {
        int computerDegree = 1;

        System.out.println("获得奖励为：");
        computerReward(computerDegree);
    }

    public static void computerReward(int computerDegree) {
        switch (computerDegree){
            case 1:
                System.out.println("参加清华大学组织的1个月夏令营");
                break;
            case 2:
                System.out.println("奖励联想笔记本电脑一部");
                break;
            case 3:
                System.out.println("奖励移动硬盘一个");
                break;
            default:
                System.out.println("无奖励");
                break;
        }
    }
}
