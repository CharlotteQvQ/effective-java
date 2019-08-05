package com.charlotte.chapter001;

/**
 * @Author:Charlotte Li
 * @Date:2019-07-30 11:08
 * @Description:返回随机整型数
 * @version:1.0
 */
public class RandomIntGenerator {

    private int min = Integer.MIN_VALUE;

    private int max = Integer.MAX_VALUE;

    //构造函数
    private RandomIntGenerator(int min, int max) {
        this.min = min;
        this.max = max;
    }

    //> min && < max
    public static RandomIntGenerator between(int min, int max) {
        return new RandomIntGenerator(min, max);
    }

    //> min && < Integer.MAX_VALUE
    public static RandomIntGenerator bigger(int min) {
        return new RandomIntGenerator(min, Integer.MAX_VALUE);
    }

    //> Integer.MIN_VALUE && < max
    public static RandomIntGenerator smaller(int max) {
        return new RandomIntGenerator(Integer.MIN_VALUE, max);
    }

    @Override
    public String toString() {
        return String.format("The max value is %d, and the min value is %d.", this.max, this.min);
    }
}
