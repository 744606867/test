package com.taiyue.bio;

import java.util.ArrayList;

public enum TestEnum {

    SUCCESS(true, 1000, "成功"),

    FAIL(false, 1111, "失败");

    TestEnum(boolean success, int code, String message) {
        this.success = success;
        this.code = code;
        this.message = message;
    }
    boolean success;
    int code;
    String message;

}

class Result {

    private boolean success;
    private int code;
    private String message;
    private Object data;

    public Result(TestEnum TestEnum) {
        this.success = TestEnum.success;
        this.code = TestEnum.code;
        this.message = TestEnum.message;
    }

    public Result(TestEnum TestEnum, Object data) {
        this.success = TestEnum.success;
        this.code = TestEnum.code;
        this.message = TestEnum.message;
        this.data = data;
    }
    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}

class T {
    public static void main(String[] args) {
        ArrayList<Object> objects = new ArrayList<>();
        objects.add("1");
        objects.add("2");
        Result result = new Result(TestEnum.FAIL,objects);
        System.out.println(result.getMessage());
        System.out.println(result.getData());
    }
}