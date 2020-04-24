package com.taiyue.bio;

import java.util.*;

public class MapT {
    public static void main(String[] args) {
        Map<Object, Object> objectObjectHashMap = new HashMap<>();
        //   fun1(objectObjectHashMap);
        //  fun2(objectObjectHashMap);
        fun3(objectObjectHashMap);
    }
    public static void fun3(Map map){
          map.keySet().forEach(e->{
              System.out.println("key:"+e+" Value:"+map.get(e));
          });
    }
    public static void fun2(Map<Object, Object> map){
      for (Map.Entry<Object, Object> entry : map.entrySet()){
          System.out.println("key:"+entry.getKey()+" Value:"+entry.getValue());
      }
    }
    public static void fun1(Map map){
         for (Object key : map.keySet()){
             System.out.println("key:"+ key+" Value:"+map.get(key));
         }
    }
}
