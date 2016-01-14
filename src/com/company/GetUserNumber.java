package com.company;

import java.util.*;
/**
 * Created by lenovo on 2016/1/12.
 */
public class GetUserNumber {
    public boolean isNumber(String number){

        return number.matches("[0-9]*");
    }

    public boolean isUnRepeat(String number){
        char[] c=number.toCharArray();
        for(int i=0;i<number.length();i++){
            if(number.lastIndexOf(c[i])!=i){
                return false;
            }
        }
        return true;
    }

    public boolean is4Digit(String number){
        if(number.length()==4){
            return true;
        }
        else{
            return false;
        }
    }
    public boolean isLegal(String number){
        return isNumber(number)&&isUnRepeat(number)&&is4Digit(number);
    }

    public String getUserNumber() {
        String UserNum;
        Scanner input = new Scanner(System.in);
        while(true){
            UserNum=input.nextLine();
            if(isLegal(UserNum)){
                break;
            }
            else{
                System.out.println("Illegal input, please try again!");
            }
        }
        return UserNum;
    }
}
