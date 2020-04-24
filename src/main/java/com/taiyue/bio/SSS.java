package com.taiyue.bio;


import com.sun.org.apache.regexp.internal.RE;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

public class SSS {

    private static int x=100;
    public static void main(String args[]){
        SSS hs1=new SSS();
              hs1.x++;
        SSS  hs2=new SSS();
               hs2.x++;
            hs1=new SSS();
             hs1.x++;
        SSS.x--;
              System.out.println("x="+x);
            }

}
