package com.zhouhang.day04;

/**
 * com.zhouhang.day04
 *
 * @author zhouhang
 * @date 2018/6/2 下午4:45
 */
public class Student implements Comparable<Student>{
    private String name;
    private int age;
    private int score;

    public Student() {
    }

    public Student(String name, int age, int score) {
        this.name = name;
        this.age = age;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", score=" + score +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        int disScore = this.score - o.score;
        int disAge = this.age - o.age;
        int disName = this.getName().compareTo(o.name);

        if(disScore != 0){
            return disScore;
        }else if(disAge != 0){
            return disAge;
        }else {
            return disName;
        }
    }
}
