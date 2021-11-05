package com.jacksondat.designpatterns.creational.builder;

public class LunchOrder {

    private String bread;
    private String condiments;
    private String dressing;
    private String meat;

    public LunchOrder(LunchOrderBuilder builder) {
        this.bread = builder.getBread();
        this.condiments = builder.getCondiments();
        this.dressing = builder.getDressing();
        this.meat = builder.getMeat();
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
}
