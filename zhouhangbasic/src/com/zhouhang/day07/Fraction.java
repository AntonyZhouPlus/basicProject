package com.zhouhang.day07;

import java.math.MathContext;

/**
 * basicProject
 *
 * @author Zhouhang Anthony
 * @date 2018/5/17 20:40
 */
public class Fraction{
    private int numerator;
    private int denominator;

    public Fraction() {
    }

    public Fraction(int numerator, int denominator) {
        this.denominator = denominator;
        this.numerator = numerator;
        this.setNumerator(this.numerator / hcf(this.numerator, this.denominator));
        this.setDenominator(this.denominator / hcf(this.numerator, this.denominator));
        if (denominator == 0) {
            System.out.println("报错");
        }
    }


    @Override
    public String toString() {
        return this.numerator + "/" + this.denominator;
    }

    public void add(Fraction b) {
        if (this.denominator == 0) {
            this.denominator = b.denominator;
            this.numerator = b.numerator;
        }
        int a1 = this.numerator;
        int a2 = this.denominator;
        int b1 = b.numerator;
        int b2 = b.denominator;
        this.setNumerator(a1 * b2 + a2 * b1);
        this.setDenominator(a2 * b2);
        this.setNumerator(this.numerator / hcf(this.numerator, this.denominator));
        this.setDenominator(this.denominator / hcf(this.numerator, this.denominator));
    }

    public int hcf(int m, int n) {
        while (true) {
            if ((m = m % n) == 0) {
                return n;
            }
            if ((n = n % m) == 0) {
                return m;
            }
        }
    }

    public int getDenominator() {
        return denominator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }

    public int getNumerator() {
        return numerator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }
}
