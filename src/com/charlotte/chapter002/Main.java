package com.charlotte.chapter002;

/**
 * @Author:Charlotte Li
 * @Date:2019-07-30 15:24
 * @Description:当构造方法参数过多时使用 builder 模式
 * @version:1.0
 */
public class Main {
    public static void main(String[] args) {
        /*当设计类的构造方法或静态工厂的参数超过几个时，Builder 模式是一个不错的选择，
        特别是如果许 多参数是可选的或相同类型的。客户端代码比使用伸缩构造方法(telescoping constructors)更容易读写，
        并且 builder 比 JavaBeans 更安全。*/
        Production production = new Production.Builder("Car", 999999).type("SAIC").build();
        System.out.println(production.toString());

        /*Builder 模式非常适合类层次结构。
        使用平行层次的 builder，每个嵌套在相应的类中。
        抽象类有抽象的 builder;具体的类有具体的 builder。*/
    }
}
