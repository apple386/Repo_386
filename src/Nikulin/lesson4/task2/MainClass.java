package Nikulin.lesson4.task2;

public class MainClass {
    public static void main(String[] args) {
        System.out.println("Создаем справочник");
        Phonebook phonebook = new Phonebook();
        System.out.println("-----------------");

        System.out.println("Наполняем справочник");
        phonebook.add("Алексеев", "223344");
        phonebook.add("Алексеев", "22334411");
        phonebook.add("Сергеев", "22334499");
        phonebook.add("Петров", "22334488");
        phonebook.add("Алексеев", "22334422");
        System.out.println("-----------------");

        System.out.println("Получаем номера");
        System.out.println("Алексеев");
        System.out.println(phonebook.get("Алексеев"));
        System.out.println("Сергеев");
        System.out.println(phonebook.get("Сергеев"));
        System.out.println("Петров");
        System.out.println(phonebook.get("Петров"));
        System.out.println("-----------------");

        System.out.println("Случай отсутствия записи");
        System.out.println("Дмитриев");
        System.out.println(phonebook.get("Дмитриев"));
        System.out.println("-----------------");

        System.out.println("Пробуем записать существующий номер");
        phonebook.add("Алексеев", "223344");
        System.out.println("Алексеев");
        System.out.println(phonebook.get("Алексеев"));
    }
}
