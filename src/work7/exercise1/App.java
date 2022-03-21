package work7.exercise1;

import java.util.Arrays;
import java.util.Objects;

public class App {
    public static void main(String[] args) {
        int a;
        Student[] group = new Student[10];
        for (int i = 0; i < group.length; i += 1) {
            System.out.println(i + 1);
            if (group[i] == null) {
                group[i] = new Student("Avgust", 25 + i, "Math", 95 + i);
                System.out.println("Добавлен ученик"+i + " уровень: "+ group[i].getLevel());
                //System.out.println(" Klass:" + Arrays.deepToString(group));
            }
        }

        System.out.println(Arrays.deepToString(group));
        Teacher math = new Teacher("Odin", 55, "Math", 5);
        for (int i = 0; i < group.length; i += 1) {
            group[i].addLevel(5);
           // System.out.println("Ученик"+i+  " уровень повышен до: "+ group[i].getLevel());
        }
    }

}