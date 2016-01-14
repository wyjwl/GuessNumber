package com.company;

import java.util.*;
import com.company.*;

public class Main {

    public static void main(String[] args) {
        String SysNumber=new NumberGenerate().generate();
		int TryTimes=6;
        System.out.println("Please input your number:");
        while(TryTimes>0){
            String UserNumber=new GetUserNumber().getUserNumber();
            if(new ReturnResult().getResult(SysNumber,UserNumber).equals("4A0B")){
                System.out.println("Congratulation!");
                break;
            }
            else{
                TryTimes--;
                if(TryTimes>0) {
                    System.out.println("Pls try again!(" + TryTimes + " times remain)");
                }
                else{
                    System.out.println("Game over");
                    System.out.println("System number is: "+SysNumber);
                }
            }
        }
    }
}
