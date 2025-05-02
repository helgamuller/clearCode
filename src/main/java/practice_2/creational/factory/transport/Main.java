package practice_2.creational.factory.transport;

/**
 * В этом приложении нам нужно создать систему для создания различных типов транспортных средств
 * (например, автомобили и велосипеды).
 * Вместо того чтобы код зависел от конкретных классов (например, Car и Bicycle),
 * мы будем использовать фабричный метод для создания объектов.
 * Это позволит расширять систему, добавляя новые типы транспортных средств, не меняя существующий код.
 * Создать интерфейс с фабричным методом. 2. Реализовать метод в подклассах, создающих конкретные объекты.
 */
public class Main {
    public static void main(String[] args) {
        Logistic logistic;
        String transportType = "bicycle";

        if(transportType.equals("bicycle")){
            logistic = new HumanPowerLogistic();
        }
        else {
            logistic = new GazolinePowerLogistic();
        }
        logistic.planRide();
        }

    }

