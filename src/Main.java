public class Main {
    public static void main(String[] args) {

        // Задание 1;
        System.out.println("Задание 1:");
        byte clientOS1 = 1;
        switch (clientOS1){
            case 0:
                System.out.println("Установите версию приложения для iOS по ссылке");
                break;
            case 1:
                System.out.println("Установите версию приложения для Android по ссылке");
                break;
        }
        // Задание 2;
        System.out.println("Задание 2:");
        byte clientOS2 = 0;
        short clientDeviceYear = 2013;
        switch (clientOS2){
            case 0:
                if (clientDeviceYear>2015) {System.out.println("Установите версию приложения для iOS по ссылке");
                }
                else {System.out.println("Установите облегченную версию приложения для iOS по ссылке");
                }
                break;
            case 1:
                if (clientDeviceYear>2015) {System.out.println("Установите версию приложения для Android по ссылке");
                }
                else {System.out.println("Установите облегченную версию приложения для Android по ссылке");
                }
            break;
        }

        // Задание 3;
        System.out.println("Задание 3:");
        short year = 1603;
        if (year % 4 == 0 && year % 100 != 0) {System.out.println(year + " год високосный");}
        else if (year % 4 == 0 && year % 400 == 0) {System.out.println(year + " год високосный");}
        else {System.out.println(year + " год не является високосный");}

        // Задание 4;
        System.out.println("Задание 4:");
        byte deliveryDistance = 95;
        byte deliveryTime = 1;
        if (deliveryDistance<=20) {System.out.println ("Потребуется дней: " + deliveryTime);}
        else if (deliveryDistance<=60 && deliveryDistance>20) {System.out.println ("Потребуется дней: " + (deliveryTime+1));}
        else { if (deliveryDistance<=100) {System.out.println ("Потребуется дней: " + (deliveryTime+2));}
                else {System.out.println ("Потребуется обратиться банк в своем регионе");}
        }

        // Задание 5;
        System.out.println("Задание 5:");
        byte monthNumber = 12;
        switch (monthNumber){
            case 12:
            case 1:
            case 2:
                System.out.println("Это зимний месяц");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Это весенний месяц");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Это летний месяц");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Это осенний месяц");
                break;
            default:
                System.out.println("Число не соответствует номеру какого-либо месяца, введите от 1 до 12");

        }

    }
}