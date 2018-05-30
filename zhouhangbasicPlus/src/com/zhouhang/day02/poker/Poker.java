package com.zhouhang.day02.poker;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

/**
 * basicProject
 *
 * @author Zhouhang Anthony
 * @date 2018/5/29 19:25
 */
public class Poker {
    public static void main(String[] args) {
        String[] huaSe = {"♥", "♦", "♣", "♠"};
        ArrayList<String> num = new ArrayList<>();
        for (int i = 3; i < 11; i++) {
            num.add(i + "");
        }
        num.add("J");
        num.add("Q");
        num.add("K");
        num.add("A");
        num.add("2");

        ArrayList<String> poker = new ArrayList<>();

        for (int i = 0; i < num.size(); i++) {
            for (int j = 0; j < huaSe.length; j++) {
                StringBuilder sb = new StringBuilder();
                sb.append(huaSe[j]);
                sb.append(num.get(i));
                poker.add(sb.toString());
            }
        }

        poker.add("大💀");
        poker.add("小💀");

        ArrayList<Integer> index = new ArrayList<>();
        for (int i = 0; i < 54; i++) {
            index.add(i);
        }
        Collections.shuffle(index);

        ArrayList<Integer> one = new ArrayList<>();
        ArrayList<Integer> two = new ArrayList<>();
        ArrayList<Integer> three = new ArrayList<>();
        Random rd = new Random();
        int dizhu = rd.nextInt(3) + 1;

        for (int i = 0; i < index.size(); i++) {
            int s = index.get(i);
            if (i < poker.size() - 3) {
                if (i % 3 == 0) {
                    one.add(s);
                } else if (i % 3 == 1) {
                    two.add(s);
                } else if (i % 3 == 2) {
                    three.add(s);
                }
            } else {
                switch (dizhu) {
                    case 1:
                        one.add(s);
                        break;
                    case 2:
                        two.add(s);
                        break;
                    case 3:
                        three.add(s);
                        break;
                    default:
                        break;
                }

            }
        }
        Collections.sort(one);
        Collections.sort(two);
        Collections.sort(three);

        for (int i = 0; i < one.size(); i++) {
            System.out.print(poker.get(one.get(i)) + "\t");
        }
        System.out.println();
        for (int i = 0; i < two.size(); i++) {
            System.out.print(poker.get(two.get(i)) + "\t");
        }
        System.out.println();
        for (int i = 0; i < three.size(); i++) {
            System.out.print(poker.get(three.get(i)) + "\t");
        }


    }
}
