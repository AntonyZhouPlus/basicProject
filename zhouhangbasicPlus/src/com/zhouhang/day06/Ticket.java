package com.zhouhang.day06;

import com.zhouhang.day05.ThreadDemo;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * com.zhouhang.day06
 *
 * @author zhouhang
 * @date 2018/6/5 下午3:15
 */
public class Ticket implements Runnable {
    Lock lock = new ReentrantLock();

    @Override
    public void run() {
        while (true) {
            lock.lock();
            try {
                if (method()) {
                    break;
                }
            } finally {
                lock.unlock();
            }

        }
    }

    private /*synchronized*/ boolean method() {
        if (TicketDemo.ticketNum > 0) {
            try {
                Thread.sleep(20);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + ":" + TicketDemo.ticketNum--);
        }

        if (TicketDemo.ticketNum < 1) {
            return true;
        }
        return false;
    }
}
