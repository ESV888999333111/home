package work6.exercise1.moutains;
// Гора создаётся с названием (не менее 4 символов),
// страной (не менее 4 символов)
// и высотой (не менее 100 метров)

public class Moutain {
    private String name;
    private String country;
    private int higth;

    // пустой конструктор
    public Moutain() {
    }

    // полный конструктор
    public Moutain(String name, String country, int higth) {
        setName(name);
        setCountry(country);
        setHigth(higth);
    }

    // setter названия
    public void setName(String name) {
        if (name == null || name.length() < 4) {
            throw new IllegalArgumentException("Значение name от 4 символов"); // вывод ошибки
        }
        this.name = name;
    }

    // setter страны
    public void setCountry(String country) {
        if (country == null || country.length() < 4) {
            throw new IllegalArgumentException("Значение country от 4 символов"); // вывод ошибки
        }
        this.country = country;
    }

    // setter высоты
    public void setHigth(int higth) {
        if (higth == 0 || higth < 100) {
            throw new IllegalArgumentException("Значение higth от 100 метров"); // вывод ошибки
        }
        this.higth = higth;
    }
}
