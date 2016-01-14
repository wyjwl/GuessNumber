package com.company;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by lenovo on 2016/1/12.
 */
public class NumberGenerate {
    public String generate(){
        ArrayList<Integer> Num = new ArrayList<Integer>();
        StringBuffer SystemNumber=new StringBuffer();
        for(int i=0;i<10;i++){
            Num.add(i);
        }
        Collections.shuffle(Num);
        for(int i=0;i<4;i++){
            SystemNumber.append(Num.get(i));
        }
        System.out.println("System Number:"+SystemNumber.toString());
        return SystemNumber.toString();
    }
}

