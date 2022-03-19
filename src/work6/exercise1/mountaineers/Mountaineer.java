package work6.exercise1.mountaineers;

// объект описывающий альпиниста
// сущность альпиниста обладает следующими свойствами:
// именем альпиниста (не менее 3 букв)
// адресом проживания (не менее 5 бувк)

public class Mountaineer {
    private String name; // имя альпиниста
    private String adress; // адресс альпиниста

    // пустой конструктор
    public Mountaineer() {
    }

    // конструктор с именем, с проверкой на сеттере
    public Mountaineer(String name, String adress) {
        setName(name); // ссылочная проверка
        setAdress(adress); // ссылочная проверка
    }

    // setter name
    private void setName(String name) {
        if (name == null || name.length() < 3) {
            throw new IllegalArgumentException("Значение name от 3 символов"); // вывод ошибки
        }
        this.name = name;
    }

    // setter adress
    private void setAdress(String adress) {
        if (adress == null || adress.length() < 5) {
            throw new IllegalArgumentException("Значение adress от 3 символов"); // вывод ошибки
        }
        this.adress = adress;
    }

    // getter fullInfo
    public String getFullInfo() {
        return name + " " + adress;
    }
}
