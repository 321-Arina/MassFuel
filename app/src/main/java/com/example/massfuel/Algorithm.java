package com.example.massfuel;

public class Algorithm {
    // создание поля для алгоритма (усорение свободного падения)
    private final float GRAVITI_ACCELERATION_EARTH = (float) 9.80665; // метров в секунду в квадрате
    private final float GRAVITI_ACCELERATION_MARS = (float) 3.721; // метров в секунду в квадрате


    // создание пустого конструктора
    public Algorithm() {
    }

    // метод вычисляющий массу топлива по величине массы груза на Марсе
    public float fuelMassCalculation(String input) {

        /** Необходимо проверить корректность ввода массы тела, так как пользователь может ввести нецелое значение
         * Java понимает нецелые значения лишь с точкой, если пользователь введёт нецелое число с запятой, то возникнет ошибка
         * Данную ситуацию нужно отработать
         */
        // проверка корректности вводимого значения (с помощью метода contains(",") мы можем проверить есть ли в строке символ ",")
        if (input.contains(",")) { // если в вводимой строке есть запятая, то

            String inputMod = input.replace(",", "."); // то с помощью метода replace() мы поменяем её на точку

            // конвертирование входного значения из String в float с помощью метода Float.parseFloat()
            float inputFloat = Float.parseFloat(inputMod);

            // возврат вычисленного значения
            return (inputFloat * 100 * GRAVITI_ACCELERATION_MARS / GRAVITI_ACCELERATION_EARTH);

        } else {
            // конвертирование входного значения из String в float с помощью метода Long.parseLong()
            float inputFloat = Float.parseFloat(input);

            // возврат вычисленного значения
            return (inputFloat * 100 * GRAVITI_ACCELERATION_MARS / GRAVITI_ACCELERATION_EARTH);
        }
    }
}
