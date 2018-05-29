package com.zhouhang.day01homework.test02;

import java.util.Objects;

/**
 * basicProject
 *
 * @author Zhouhang Anthony
 * @date 2018/5/28 12:05
 */
public class Person {
    String x;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(x, person.x);
    }

    @Override
    public int hashCode() {

        return Objects.hash(x);
    }
}
