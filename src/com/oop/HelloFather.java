package com.oop;

public class HelloFather extends GroudFather{

    private String strf;

    public String getStrf() {
        return strf;
    }

    public void setStrf(String strf) {
        this.strf = strf;
    }

    public void start(){
        System.out.println("输出子类");
    }
}
