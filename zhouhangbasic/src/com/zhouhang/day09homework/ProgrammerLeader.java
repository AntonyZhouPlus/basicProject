package com.zhouhang.day09homework;

/**
 * basicProject
 *
 * @author Zhouhang Anthony
 * @date 2018/5/20 21:22
 */
public class ProgrammerLeader extends ITWorker{
    /*属性：
    姓名 工号 工资 奖金
    行为：
    工作work*/
    private String bonus;

    public ProgrammerLeader() { }

    public ProgrammerLeader(String name, String id, String salary, String bonus) {
        super(name, id, salary);
        this.bonus = bonus;
    }

    public String getBonus() {
        return bonus;
    }

    public void setBonus(String bonus) {
        this.bonus = bonus;
    }

    @Override
    public void work() {
        System.out.println("项目经理在工作");
    }
}
