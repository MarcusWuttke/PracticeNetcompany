package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

	Svarv svarv = new Svarv();
	System.out.println("Svarv är:" + svarv.getAge());
	System.out.println("Han bor i:" +svarv.bor(svarv.getAge()));

	int svarvenTaggad=10;
	boolean isAlive=true;
	Scanner scan = new Scanner(System.in);
	Random rand=new Random();
	while(isAlive){
		System.out.println("Vad vill du göra med Svarven?");
		String action = scan.nextLine();
		switch (action) {
			case "kill":
				isAlive = false;
				System.out.println("Svarv is dead, all hail Svarven");
				break;
			case "getAge":
				System.out.println("Svarv är:" + svarv.getAge());
				break;
			case "marry":
				if (!svarv.checkMarried()) {
					int chanceToMarry = rand.nextInt(svarvenTaggad);
					if (chanceToMarry == 0) {
						svarv.setMarrigeStatus(true);
						System.out.println("Svarven sa ja :D");
					} else {
						System.out.println("Svarven sa nej :(");
					}
				} else {
					System.out.println("Ni är redan gifta");
				}
				break;
			case "divorce":
				if (svarv.checkMarried()) {
					int settlement = rand.nextInt(1000000);
					System.out.println("Du fick med: " + settlement + " kr från skiljsmässan");
					svarv.setMarrigeStatus(false);
				} else {
					System.out.println("Ni är inte gifta");
				}
				break;
			case "flirt":
				if(svarvenTaggad>0) {
					svarvenTaggad--;
				}
			default:
				System.out.println("Bad input");
				break;
		}

	}


    }







}
