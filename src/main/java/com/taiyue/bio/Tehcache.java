package com.taiyue.bio;


import net.sf.ehcache.Cache;
import net.sf.ehcache.CacheManager;
import net.sf.ehcache.Element;
import org.junit.Test;

import java.util.Random;

public class Tehcache {
//    public static void main(String[] args) {
//        CacheManager cacheManager = CacheManager.create(Tehcache.class.getClassLoader().getResourceAsStream("ehcache.xml"));
//        Cache object = cacheManager.getCache("object");
//        Element element = new Element("aa", "bbddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddadasxc");
//        object.put(element);
//        Element aa = object.get("aa");
//        System.out.println(aa);
//        object.flush();
//        cacheManager.shutdown();
//
//    }

    //    public static void main(String args[]){
//        StringBuffer s = new StringBuffer("We Are Happy");
//        System.out.println(replaceSpace(s));
//    }
//
//    public static String replaceSpace(StringBuffer str) {
//        String s = str.toString();
//        char[] chars = s.toCharArray();
//        StringBuffer stringBuffer = new StringBuffer();
//        for (int i = 0;i<chars.length;i++){
//            if (chars[i]==' '){
//                stringBuffer.append("%20");
//            }else {
//                stringBuffer.append(chars[i]);
//            }
//        }
//return stringBuffer.toString();
//
//    }
    @Test
    public void ssss() {

        System.out.println((int) (Math.random() * 100));
    }

    public static void main(String[] args) {
        int[] ints = new int[10];
        for (int i = 0; i < ints.length; i++) {
            ints[i] = (int) (Math.random() * 1000);
        }
        System.out.println(sss(ints));
    }

    //peek
    public static int sss(int[] ins) {
        int[] ints = peekScore(ins);
        int total = 0;
        for (int i : ints) {
            total += i;
        }
        return total/ins.length;
    }


    //排序
    private static  int[] peekScore(int[] ins) {
        int[] ints11 = new int[10];
        int k;
        for (int i = 0; i < ins.length - 1; i++) {
            for (int j = 0; j < ins.length - 1 - i; j++) {
                if (ins[j] > ins[j + 1]) {
                    k = ins[j];
                    ins[j] = ins[j + 1];
                    ins[j + 1] = k;
                }
            }
        }
        //去掉头尾
        for (int i = 1; i < ins.length-1; i++) {
            ints11[i-1] = ins[i];
        }

        return ints11;
    }


}
