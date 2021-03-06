package com.designpatterns.decorator.model;

import com.designpatterns.decorator.abs.Beverage;
import com.designpatterns.decorator.abs.CondimentDecorator;

/**
 * 摩卡
 *
 * @author wll
 * @data 2020/06/03
 */
public class Mocha extends CondimentDecorator {

    private Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }

    @Override
    public double cost() {
        return 0.20 + beverage.cost();
    }
}
