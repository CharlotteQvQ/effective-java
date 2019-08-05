package com.charlotte.chapter001;

/**
 * @Author:Charlotte Li
 * @Date:2019-07-30 10:59
 * @Description:考虑用静态工厂模式代替构造器
 * @version:1.0
 */
public class Main {
    public static void main(String[] args) {
        //1.可读性强
        RandomIntGenerator randomIntGenerator;

        randomIntGenerator = RandomIntGenerator.between(10, 100);
        System.out.println(randomIntGenerator.toString());
        randomIntGenerator = RandomIntGenerator.bigger(10);
        System.out.println(randomIntGenerator.toString());
        randomIntGenerator = RandomIntGenerator.smaller(100);
        System.out.println(randomIntGenerator.toString());

        //2.不需要每次都创建一个新对象

    }
}
