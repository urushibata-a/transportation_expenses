package com.example.transportationexpenses;

import android.content.Context;

public class SimpleThread {
    public static void main(String[] args) {
        System.out.println("メインスレッドだよ");
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("別のスレッドだよ");
            }
        }).start();
    }
}