package com.zhouhang.day02homework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

/**
 * basicProject
 *
 * @author Zhouhang Anthony
 * @date 2018/5/30 14:34
 */
public class MyArrayList<E> {
    private int size;
    // private E[] elementDate; 泛型不能new E(),这是java底层存在的问题，不能这样使用
    private Object[] elementDate;

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < size; i++) {
            if (i == size - 1) {
                sb.append(elementDate[i]);
            } else {
                sb.append(elementDate[i]).append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public MyArrayList() {
        elementDate = new Object[0];
    }

    public MyArrayList(int initialCapacity) {
        elementDate = new Object[initialCapacity];
    }

    public boolean add(E e) {
        ensureCapacity();
        elementDate[size++] = e;
        return true;
    }

    public E remove(int index) {
        Object o = elementDate[index];
        System.arraycopy(elementDate, index + 1, elementDate, index,
                size-- - index - 1);
        return (E) o;
    }

    public void clear() {
        for (int i = 0; i < size; i++) {
            elementDate[i] = null;
        }
        size = 0;
    }

    public boolean contains(Object o) {
        for (Object o1 : elementDate) {
            if (o.equals(o1)) {
                return true;
            }
        }
        return false;
    }

    public E get(int index) {
        Objects.checkIndex(index, size);
        return (E) elementDate[index];
    }

    private void ensureCapacity() {
        if (elementDate.length == 0) {
            elementDate = new Object[10];
            return;
        }
        if (size + 1 > elementDate.length) {
            grow(size);
        }
    }

    private void grow(int size) {
        Object[] newElementDate = new Object[size + size / 2];

        System.arraycopy(elementDate, 0, newElementDate, 0, elementDate.length);

        elementDate = newElementDate;
    }
}
