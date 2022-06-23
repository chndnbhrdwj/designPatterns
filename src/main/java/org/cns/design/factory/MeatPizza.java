package org.cns.design.factory;

public class MeatPizza implements Pizza{

    @Override
    public void prepare() {
        System.out.println("preparing meat pizza");
    }

    @Override
    public void bake() {
        System.out.println("baking meat pizza");
    }

    @Override
    public void cut() {
        System.out.println("cutting meat pizza");
    }
}
