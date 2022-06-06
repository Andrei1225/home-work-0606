package ru.skypro;

public class Main {

    public static void main(String[] args) {
	// Задание 1

        byte apples = 10;
        short potatoes = 8;
        int lemons = 3;
        long bananas = 10L;
        float oranges = 2.5f;
        double cucumbers = 3.5;
        double productsQuantity = apples + potatoes + lemons + bananas + oranges + cucumbers;
        System.out.println("Общее количество продуктов равно " + productsQuantity);

        // Задание 2

        float boxerOneWeight = 78.2f;
        float boxerTwoWeight = 82.7f;
        float totalBoxerWeight = boxerOneWeight + boxerTwoWeight;
        System.out.println("Общий вес боксеров равен " + totalBoxerWeight + " кг");

        // Задание 3

        byte bananasQuantity = 5;
        int milkQuantity = 200;
        byte icecreamQuantity = 2;
        byte eggsQuantity = 4;
        float breakfast = (80 * bananasQuantity) + ((milkQuantity * 105) / 100) + (icecreamQuantity * 100) + (eggsQuantity * 70);
        System.out.println("Вес завтрака равен " + breakfast + " гр");
        System.out.println("Вес завтрака равен " + (breakfast / 1000) +  " кг");

        // Задание 4

        byte totalWeightToLose = 7;
        int dietOneToLoseWeight = 250;
        int dietTwoToLoseWeight = 500;
        int dayQuantityWithDietOne = (totalWeightToLose * 1000) / dietOneToLoseWeight;
        int dayQuantityWithDietTwo = (totalWeightToLose * 1000) / dietTwoToLoseWeight;
        System.out.println("Количество дней на похудение с первой диетой равно " + dayQuantityWithDietOne);
        System.out.println("Количество дней на похудение со второй диетой равно " + dayQuantityWithDietTwo);
        System.out.println("Количество дней на похудение в среднем равно " + ((dayQuantityWithDietOne +  dayQuantityWithDietTwo) / 2));


        // Задание 5
        int mashasSallary = 67760;
        int denisSallary = 83690;
        int kristinasSallary = 76230;

        int newMashasSallary = mashasSallary + (mashasSallary / 10) ;
        int newDenisSallary = denisSallary + (denisSallary / 10);
        int newKristinasSallary = kristinasSallary + (kristinasSallary / 10);

        int godovayaRaznizaMasha = (newMashasSallary - mashasSallary) * 12;
        int godovayaRaznizaDenis = (newDenisSallary - denisSallary) * 12;
        int godovayaRaznizaKristina = (newKristinasSallary - kristinasSallary) * 12;

        System.out.println("Маша теперь получает " + newMashasSallary + " рублей. Годовой доход вырос на " + godovayaRaznizaMasha + " рублей");
        System.out.println("Денис теперь получает " + newDenisSallary + " рублей. Годовой доход вырос на " + godovayaRaznizaDenis);
        System.out.println("Кристина теперь получает " + newKristinasSallary + " рублей. Годовой доход вырос на " + godovayaRaznizaKristina + " рублей");










    }
}
