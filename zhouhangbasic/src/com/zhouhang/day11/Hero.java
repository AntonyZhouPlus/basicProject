package com.zhouhang.day11;

/**
 * basicProject
 *
 * @author Zhouhang Anthony
 * @date 2018/5/24 17:45
 */
public class Hero {
    private Weapon weapon;
    private InterA i;

    public void attack() {
        System.out.println("在用" + weapon.getWeaponName());
    }

    public Hero(Weapon weapon, InterA i) {
        this.weapon = weapon;
        this.i = i;
    }

    public Hero() {
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public InterA getI() {
        return i;
    }

    public void setI(InterA i) {
        this.i = i;
    }
}
