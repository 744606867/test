package com.taiyue.bio;

import java.sql.*;
import java.util.HashMap;

/*
* 不是单例
* */
class TestNoSafeSingle{

}

/*
 * 饿汉式单例
 * */
public class TestSafeSingle {

    private static TestSafeSingle testSingle = new TestSafeSingle();

    private TestSafeSingle(){}

    public static TestSafeSingle getInstance(){
        return testSingle;
    }

}

/*
* 懒汉式单例 (线程不安全)
* */
class TestSafeSingle1{
    private TestSafeSingle1(){}

    private  static TestSafeSingle1 testSafeSingle1 = null;

    public static TestSafeSingle1 getInstance(){
        if(testSafeSingle1 == null){
            testSafeSingle1 =  new TestSafeSingle1();
        }
            return testSafeSingle1;
    }
}

/*
 * 懒汉式单例 (线程安全)
 * */
class TestSafeSingle2{
    private TestSafeSingle2(){}

    private  static TestSafeSingle2 testSafeSingle2 = null;

    public static TestSafeSingle2 getInstance(){
        if(testSafeSingle2 == null){
            synchronized (TestSafeSingle2.class){
                if (testSafeSingle2 == null){
                     testSafeSingle2 = new TestSafeSingle2();
                }
            }
            }
        return testSafeSingle2;
        }

}

/*
* 静态内部类
* */
class TestSafeSingle3{

    public static void main(String[] args) throws SQLException {
//        Connection connection = DriverManager.getConnection();
//        PreparedStatement preparedStatement = connection.prepareStatement();
//
//        ResultSet resultSet = preparedStatement.getResultSet();
//        ResultSetMetaData metaData = resultSet.getMetaData();
//        HashMap<Object, Object> objectObjectHashMap = new HashMap<>();
//        while (resultSet.next()){
//            resultSet
//        }
//        metaData.
    }
    private TestSafeSingle3(){}

     private static class GetInstance{
            private static final TestSafeSingle3 testSafeSingle3 = new TestSafeSingle3();
    }
    public static TestSafeSingle3 getI(){
        return GetInstance.testSafeSingle3;
    }

    }




class  Test{
    public static void main(String[] args) {
       // System.out.println(TestSafeSingle.getInstance()==TestSafeSingle.getInstance());
      //  System.out.println(new TestNoSafeSingle() == new TestNoSafeSingle());
//        System.out.println(TestSafeSingle1.getInstance());
//        System.out.println(TestSafeSingle1.getInstance());
        System.out.println(TestSafeSingle3.getI()==TestSafeSingle3.getI());

    }
}