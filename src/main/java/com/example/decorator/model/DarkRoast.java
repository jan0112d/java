package com.example.decorator.model;

import com.example.decorator.abs.CondimentDecorator;

/**
 * 焦炒咖啡
 *
 * @author wll
 * @data 2020/06/03
 */
public class DarkRoast extends CondimentDecorator {
    @Override
    public String getDescription() {
        return "DarkRoast";
    }

    @Override
    public double cost() {
        return 0;
    }
}
