package work7.exercise1;

import work7.exercise1.skill.Skill;

public class Teacher extends Skill {
    public Teacher(String name, int age, String subject, int upLevel) {
        super(name, age, subject, upLevel);
    }
    public int getLevel() {
        return this.level;
    }
}
