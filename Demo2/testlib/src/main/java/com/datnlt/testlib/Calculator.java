package com.datnlt.testlib;

public class Calculator {
    static {
        System.loadLibrary("testnative");
    }
//    public
//    int Sum(int a,int b){
//        System.loadLibrary("calculator");
//        return a+b;
//    }
////    String GetStr(){
////        return stringFromJNI();
////    }
    public native int Sum(int a, int b);
    public native String stringFromJNI();
}