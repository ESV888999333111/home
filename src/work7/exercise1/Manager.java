package work7.exercise1;

import work7.exercise1.man.Man;

public class Manager extends Man {
    private boolean day;

    public Manager(String name, int age) {
        super(name, age);
    }

    void setDay(boolean day) {
        if( day==true) this.day = true;
                else this.day=false;
                return;
    }
    public boolean getDay(){
        return this.day;
    }
}
