package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        String[] wordListOne = new String[]{"круглосуточный", "трех-звенный", "3000-футовый", "взаимный", "обоюдный выйргыш", "фронтэнд"};
        String[] wordListTwo = new String[]{"уполномоченный", "трудный", "чистый продукт", "ориентированный", "центральный", "распределенный", "фирменный", "нестандарный ум", "сетевой"};
        String[] wordListThree = new String[]{"процесс", "пункт разгрузки", "выход из положения", "тип структуры", "талант", "подход", "портал"};

        int oneLength = wordListOne.length;
        int twoLength = wordListTwo.length;
        int threeLength = wordListThree.length;

        int rand1 = (int)(Math.random() * (double)oneLength);
        int rand2 = (int)(Math.random() * (double)twoLength);
        int rand3 = (int)(Math.random() * (double)threeLength);

        String phrase = wordListOne[rand1] + " " + wordListTwo[rand2] + " " + wordListThree[rand3];

        System.out.println("Все, что нам нужно, - это " + phrase);

    }
}