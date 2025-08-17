package com.ahsan;

public class StringSplit
{
    public static void main(String[] args) {

        String str1 = "ahsan-shareef-mohammed";

        System.out.println(str1);

        System.out.println(str1.split("-")[0]);
        System.out.println(str1.split("-")[1]);
        System.out.println(str1.split("-")[2]);
    }
}
