package com.charlotte.effectiveJava;


/**
 * @Author:Charlotte Li
 * @Date:2019-07-24 10:39
 * @Description:
 * @version:1.0
 */
public class Test {
    //required
    private final int params1;

    //required
    private final int params2;

    //required
    private final int params3;

    //not required
    private final String params4;

    //not required
    private final String params5;

    //not required
    private final String params6;

    public static class Builder{
        //required
        private final int params1;
        private final int params2;
        private final int params3;

        //not required
        private String params4 = "";
        private String params5 = "";
        private String params6 = "";

        public Builder(int params1,int params2,int params3){
            this.params1 = params1;
            this.params2 = params2;
            this.params3 = params3;
        }

        public Builder params4(String params4){
            this.params4 = params4;
            return this;
        }

        public Builder params5(String params5){
            this.params5 = params5;
            return this;
        }

        public Builder params6(String params6){
            this.params6 = params6;
            return this;
        }

        public Test build(){
            return new Test(this);
        }
    }

    private Test(Builder build){
        this.params1 = build.params1;
        this.params2 = build.params2;
        this.params3 = build.params3;
        this.params4 = build.params4;
        this.params5 = build.params5;
        this.params6 = build.params6;
    }

    @Override
    public String toString(){
        return String.format("Test: params1:%d,params2:%d,params3:%d,params4:%s,params5:%s,params6:%s",params1,params2,params3,params4,params5,params6);
    }
}
