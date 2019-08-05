package com.charlotte.chapter002;

import java.util.Date;

/**
 * @Author:Charlotte Li
 * @Date:2019-07-30 15:26
 * @Description:
 * @version:1.0
 */
public class Production {

    //名字--required
    private final String name;

    //价格--required
    private final int price;

    //类型--not required
    private final String type;

    //产地--not required
    private final String originPlace;

    //用途--not required
    private final String usage;

    //生产日期--not required
    private final Date productionTime;

    public static class Builder {
        private final String name;
        private final int price;
        private String type = "";
        private String originPlace = "";
        private String usage = "";
        private Date productionTime = null;

        public Builder(String name, int price) {
            this.name = name;
            this.price = price;
        }

        public Builder type(String type) {
            this.type = type;
            return this;
        }

        public Builder originPlace(String originPlace) {
            this.originPlace = originPlace;
            return this;
        }

        public Builder usage(String usage) {
            this.usage = usage;
            return this;
        }

        public Builder productionTime(Date productionTime) {
            this.productionTime = productionTime;
            return this;
        }

        public Production build() {
            return new Production(this);
        }
    }

    public Production(Builder builder) {
        this.name = builder.name;
        this.price = builder.price;
        this.type = builder.type;
        this.originPlace = builder.originPlace;
        this.usage = builder.usage;
        this.productionTime = builder.productionTime;
    }

    @Override
    public String toString() {
        return String.format("Production:[name:%s,price:%d,type:%s,originPlace:%s,usage:%s,productionTime:%s]",
                name, price, type, originPlace, usage, productionTime == null ? "" : productionTime.toString());
    }

}
