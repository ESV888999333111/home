package work6.exercise1; //место хранения

import work6.exercise1.groups.Group;
import work6.exercise1.mountaineers.Mountaineer; // подключаем шаблон объекта

import java.util.Scanner; // подключаем объект сканер

public class App1 {
    public static void main(String[] args) {
        String mouner;
        String mAdress;

        System.out.println("Введи имя: ");
        Scanner mIn = new Scanner(System.in);
        mouner = mIn.nextLine();

        System.out.println("Введи адресс: ");
        Scanner aIn = new Scanner(System.in);
        mAdress = aIn.nextLine();
        Mountaineer person = new Mountaineer(mouner, mAdress);
        Mountaineer per = new Mountaineer();
        //per.setAdress("Arturj"); //обращение к setter
        //per.setName("fdasgfavvv"); //обращение к setter
        // System.out.println(person.getFullInfo()); // обращение к getter
        // System.out.println(per.getFullInfo());  // обращение к getter
    }
}
