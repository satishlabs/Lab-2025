package com.custome;

public class CustomClass<T> {
    private T data;

    public CustomClass(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    static void main() {
        CustomClass<String> strData = new CustomClass<>("Hello, How are you!!");
        System.out.println(strData.data);

        CustomClass<Integer> intData = new CustomClass<Integer>(20);
        System.out.println(intData.data);
    }
}
