package com.taiyue.bio;

import java.util.*;

public class Sa {
    public static void main(String[] args) {

//        System.out.println(UUID.randomUUID().toString().replace("-",""));
//        Properties properties = new Properties();
//        ArrayList<Object> objects = new ArrayList<>();
//        objects.add("ss");
//        objects.add("dd");
//        objects.add("ww");
//    //   fun1(objects);
//      //  fun2(objects);
//        fun3(objects);
    }
    public static void fun3(List list){
       list.forEach(e->{
           System.out.println(e);
       });
    }
    public static void fun2(List list){
        Iterator iterator = list.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
    public static void fun1(List list){
         for (int i = 0 ; i<list.size();i++){
             System.out.println(list.get(i));
         }
    }
    public  static  void fun4(){
        Calendar instance = Calendar.getInstance();
        System.currentTimeMillis();
        Date date = new Date();
        instance.getTimeInMillis();
    }
}
