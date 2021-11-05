package com.jacksondat.designpatterns.creational.builder;

public class LunchOrderBuilder {

    private String bread;
    private String condiments;
    private String dressing;
    private String meat;

    public LunchOrderBuilder() {
        this.bread = "wheat";
        this.meat = "jam";
    }

    public LunchOrderBuilder setBread(String bread) {
        this.bread = bread;
        return this;
    }

    public LunchOrderBuilder setCondiments(String condiments) {
        this.condiments = condiments;
        return this;
    }

    public LunchOrderBuilder setDressing(String dressing) {
        this.dressing = dressing;
        return this;
    }

    public LunchOrderBuilder setMeat(String meat) {
        this.meat = meat;
        return this;
    }

    public String getBread() {
        return bread;
    }

    public String getCondiments() {
        return condiments;
    }

    public String getDressing() {
        return dressing;
    }

    public String getMeat() {
        return meat;
    }

    public LunchOrder build() {
        return new LunchOrder(this);
    }
}
