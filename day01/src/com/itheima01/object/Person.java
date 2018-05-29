package com.itheima01.object;

import java.util.Objects;

public class Person extends Object {
    private int age;
    private String name;

    public Person() {
    }

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    //    @Override
//    public boolean equals(Object o) {
//        if (this == o)// 地址的判断
//            return true;
//        if (o == null || getClass() != o.getClass())//为空的和类型不一样的 返回false
//            return false;
//        Person person = (Person) o;//向下转型
//        return age == person.age &&
//               Objects.equals(name, person.name);// 引用类型要使用equals比较
//    }
    /*
       在这里完成两个对象的比较
         如果他们的属性都一样 则认为是相同元素 返回true
         否则返回false
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {//同一地址内容
            return true;
        }
        if (obj == null) {//空常量
            return false;
        }
        if (obj instanceof Person) {
            //如果是同一类型 继续判断
            // 向下转型
            Person other = (Person) obj;

            if (this.age == other.age) {
                if (this.name == null) {
                    if (other.name == null) {
                        return true;
                    }
                } else {
                    if (this.name.equals(other.name)) {
                        return true;
                    }
                }
            }
        }

        return false;


    }

    @Override
    public int hashCode() {

        return Objects.hash(age, name);
    }
    //    @Override
//    public String toString() {
//        return "这里是java学习的地方";
//    }
}
