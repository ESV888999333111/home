package work7.exercise1.skill;

import work7.exercise1.man.Man;

abstract public class Skill extends Man {
    protected String subject;
    protected int level;
    private int maxLevel = 100;

    public Skill(String name, int age, String subject, int level) {
        super(name, age);
        this.subject = subject;
        if (level<maxLevel){
            this.level = level;
            System.out.println("Ученик");
            return;

        }else {
            this.level=maxLevel;
            System.out.println("Учитель");
        }
    }

}
