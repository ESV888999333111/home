package work7.exercise1;


import work7.exercise1.skill.Skill;

public class Student extends Skill {

    public Student(String name, int age, String subject, int level) {
        super(name, age, subject, level);
        return;
    }

    public void addLevel(int up) {
        this.level += Math.random() * up + 1;
     //   System.out.println("Ученик " + name + " уровень: " + this.level);
        return;
    }

    public int getLevel() {
        return level;
    }
}
