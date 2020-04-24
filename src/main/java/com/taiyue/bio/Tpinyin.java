package com.taiyue.bio;

import net.sourceforge.pinyin4j.PinyinHelper;

public class Tpinyin {

        public static void main(String[] args) {
            String ss = "你好";
            StringBuilder sb=new StringBuilder();
            String[] strings = null ;
            for (int i = 0;i<ss.length();i++){
                strings = PinyinHelper.toHanyuPinyinStringArray(ss.charAt(i));
                if(strings!=null && strings.length>0){
                    for (String string : strings) {
                        sb.append(string);
                    }
                }else {
                    sb.append(ss.charAt(i));
                }
            }
            System.out.println(sb);
        }

}
