package com.taiyue.bio;

import com.alibaba.fastjson.JSON;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;


public class Tstream {
    public static void main(String[] args) throws SQLException {


        PageHelper.startPage(2, 2);
        List<Object> objects = new ArrayList<>();
        objects.add("1");
        objects.add("2");
        objects.add("3");
        objects.add("4");
        objects.add("5");

     PageInfo<List> listPageInfo = new PageInfo(objects);
        System.out.println("sout");
        System.out.println(JSON.toJSONString(listPageInfo));
    }
}
