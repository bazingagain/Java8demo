package com.leon.learnjava.part1.chapter1.predicate;

import com.leon.learnjava.part1.common.Apple;

/**
 * Created on 22/10/2017.
 *
 * @author Xiaolei-Peng
 */
public class AppleGreenColorPredicate implements ApplePredicate {
    public boolean test(Apple apple) {
        return "green".equals(apple.getColor());
    }
}
