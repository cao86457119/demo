package com.example.demo;

import java.util.concurrent.locks.ReentrantLock;

public class leeThreadLock {

     private final  static ReentrantLock rl;
     static{
         rl = new ReentrantLock();
     }


    public static ReentrantLock getInstance(){

        return li.reet;
    }
    static class li{
        public static final ReentrantLock reet = new ReentrantLock();

    }

}

