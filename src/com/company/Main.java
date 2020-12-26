package com.company;

import java.util.Random;
import java.util.Scanner;

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

	boolean married=false;

	boolean isAlive=true;
	Scanner scan = new Scanner(System.in);
	Random rand=new Random();
	while(isAlive){
		System.out.println("Vad vill du göra med Svarven?");
		String action = scan.nextLine();
			if (action.equals("kill")){
				isAlive=false;
				System.out.println("Svarv is dead, all hail Svarven");
			}
			else if(action.equals("getAge")){
				System.out.println("Svarv är:" + svarv.getAge());
			}
			else if(action.equals("marry")){
				if(!svarv.checkMarried()) {
					int chanceToMarry = rand.nextInt(5);
					if (chanceToMarry == 3) {
						svarv.setMarrigeStatus(true);
						System.out.println("Svarven sa ja :D");
					} else {
						System.out.println("Svarven sa nej :(");
					}
				}
				else{
					System.out.println("Ni är redan gifta");
				}
			}
			else if(action.equals("divorce")){
				if(svarv.checkMarried()){
					int settlement = rand.nextInt(1000000);
					System.out.println("Du fick med: "+settlement+" kr från skiljsmässan");
					svarv.setMarrigeStatus(false);
				}
				else{
					System.out.println("Ni är inte gifta");
				}
			}
			else{
				System.out.println("Bad input");
			}

	}


    }







}
