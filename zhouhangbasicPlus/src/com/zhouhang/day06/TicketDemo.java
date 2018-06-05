package com.zhouhang.day06;

/**
 * com.zhouhang.day06
 *
 * @author zhouhang
 * @date 2018/6/5 下午3:17
 */
public class TicketDemo {
    public static int ticketNum = 100;

    public static void main(String[] args) {

        Ticket ticket = new Ticket();
        new Thread(ticket,"win1").start();
        new Thread(ticket,"win2").start();
        new Thread(ticket,"win3").start();

    }
}
