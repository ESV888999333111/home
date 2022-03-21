package work7.exercise1;

import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        int a;
        Manager dir = new Manager("Mr Green", 78); // директор
        Teacher math = new Teacher("Odin", 55, "Math", 5); // учитель
        Student[] group = new Student[2]; // массив учеников
        for (int i = 0; i < group.length; i += 1) {
            //System.out.println(i + 1);
            if (group[i] == null) {
                group[i] = new Student("Avgust", 25 + i, "Math", (int) (Math.random() * 10));
                System.out.print("Добавлен ученик" + i + " уровень: " + group[i].getLevel() + " :: ");
                //System.out.println(" Klass:" + Arrays.deepToString(group));
            }
        }
        //System.out.println(Arrays.deepToString(group)); // вывод массива учеников
        int non = 0;
        System.out.println("");
        System.out.println("hey we go again  0 - no 1 - yes");
        Scanner begin = new Scanner(System.in);
        non = begin.nextInt();
        while (0 != non) {
            // ожидание решения директора
            System.out.println("Are we start a day? true - yes false - no");
            Scanner scanner = new Scanner(System.in);
            boolean in = scanner.nextBoolean();
            dir.setDay(in); // решение директора
            if (dir.getDay() == true) {

                for (int i = 0; i < group.length; i += 1) {
                    group[i].addLevel(5);
                    System.out.println("Ученик" + i + " уровень повышен до: " + group[i].getLevel());
                }
            } else {
                for (int i = 0; i < group.length; i++) {
                    System.out.println("Ученик" + i + " уровень: " + group[i].getLevel());
                }
            }
            System.out.println("Do you wont more? 0 - no 1 - yes"); // проверка выхода из цикла
            System.out.print("");
            non = begin.nextInt();
        }
    }
}
