package com.company;

/**
 * Created by lenovo on 2016/1/12.
 */
public class ReturnResult {
    public String getResult(String sysNumber, String userNumber){
        int a=0;
        int b=0;
        StringBuffer buf = new StringBuffer();
        char[] uNum = userNumber.toCharArray();
        for(int i=0;i<userNumber.length();i++){
            if(sysNumber.indexOf(uNum[i])>-1){
                if(sysNumber.indexOf(uNum[i])==i){
                    a++;
                }
                else{
                    b++;
                }
            }
        }
        buf.append(a+"A"+b+"B");
        System.out.println(buf);
        return buf.toString();
    }
}

