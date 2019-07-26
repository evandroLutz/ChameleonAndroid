package com.example.myfirstapp;

import java.util.Date;

public class TimeStamp {

    private long time;

    public void setTime(long time) {
        this.time = time;
    }

    public long getTime() {
        return time;
    }


    long getDate() {

        Date date = new Date();


        long time = date.getTime();
        setTime(time);
        long lastd = Math.abs(time % 10);
        System.out.println("Time in Milliseconds: " + time);
        System.out.println("Time in Milliseconds: " + lastd);
        return lastd;


    }


}
