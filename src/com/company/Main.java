package com.company;

public class Main {

    public static void main(String[] args) {
	int a= 2;
	String text="Svarvilicous";
	if(a==2){
	    System.out.println(text);
	    a=3;
	    String t="hej";
    }
	Svarv svarv = new Svarv();
	System.out.println("Svarv är:" + svarv.getAge());
	System.out.println("Han bor i:" +svarv.bor(svarv.getAge()));


    }
}
