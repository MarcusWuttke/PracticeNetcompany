package com.company;

public class Svarv {
    String liveAt;
    boolean married=false;
    public String bor(int age){
        if(age<24){
            liveAt="Malmö";
        }
        else if(age==24){
            liveAt="Copenhagen";
        }
        else{
            liveAt="Oklart";
        }
        return liveAt;
    }
    public int getAge(){
        return calculateAge(2020);
    }
    private int calculateAge(int currentYear){
        return currentYear-1996;
    }
    public void setMarrigeStatus(boolean isMarried) {
        married=isMarried;
        return;
    }
    public boolean checkMarried(){
        return married;
    }
}
