//Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
//        Создать множество ноутбуков.
//        Написать метод, который будет запрашивать у пользователя критерий (или критерии) фильтрации и
//        выведет ноутбуки, отвечающие фильтру. Критерии фильтрации можно хранить в Map. Например:
//        Введите цифру, соответствующую необходимому критерию:
//        1 - ОЗУ
//        2 - Объем ЖД
//        3 - Операционная система
//        4 - Цвет …
//        Далее нужно запросить минимальные значения для указанных критериев - сохранить параметры фильтрации можно также в Map.
//        Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям.


package org.example;


import java.util.*;

public class Main {
    public static void main(String[] args) {

        Laptop laptop1 = new Laptop("ASUS", 4, "windows 10", "black", 14, 25000);
        Laptop laptop2 = new Laptop("Huawei", 8, "windows 10", "black", 15, 46000);
        Laptop laptop3 = new Laptop("HP", 4, "windows 10", "black", 14, 35000);
        Laptop laptop4 = new Laptop("LENOVO", 2, "windows 10", "black", 15, 15000);
        Laptop laptop5 = new Laptop("ASUS", 8, "windows 10", "black", 14, 45000);
        Laptop laptop6 = new Laptop("SAMSUNG", 8, "windows 10", "black", 15, 65000);
        Laptop laptop7 = new Laptop("HONOR", 8, "windows 10", "black", 14, 45000);

        List<Laptop> laptops = new ArrayList<>();
        laptops.add(laptop1);
        laptops.add(laptop2);
        laptops.add(laptop3);
        laptops.add(laptop4);
        laptops.add(laptop5);
        laptops.add(laptop6);
        laptops.add(laptop7);


//        System.out.println(laptops.get(0).getRamMemory());
        List newArr = new ArrayList();
        List arr = filter();
        if (!arr.isEmpty()) {
            for (int i = 0; i < laptops.size(); i++) {
                if (laptops.get(i).getTitle().equals(arr.get(0))
                        && laptops.get(i).getRamMemory() == arr.get(1)
                        && laptops.get(i).getOperatingSystem().equals(arr.get(2))
                        && laptops.get(i).getColor().equals(arr.get(3))
                        && laptops.get(i).getDisplay() == arr.get(4)
                        && laptops.get(i).getPrice() <= (int) arr.get(5)

                ) {
                    newArr.add(laptops.get(i));
                }
            }
            System.out.println(newArr.isEmpty() ? "Такого ноута нет :((" : newArr);
        } else {
            for (int i = 0; i < laptops.size(); i++) {
                System.out.println(laptops.get(i));
            }
        }
    }

    public static ArrayList filter() {
        System.out.println("Добро пожаловать в мир ноутбуков!");
        System.out.println("Желаете воспользоваться фильтром? y/n");
        Scanner scanner = new Scanner(System.in);
        String isFilter = scanner.nextLine();
        ArrayList arrFilters = new ArrayList();
        if (isFilter.equals("y")) {
            System.out.println("Введите название");
            String title = scanner.nextLine();
            arrFilters.add(title);

            System.out.println("Размер оперативки?");
            String ramMemory = scanner.nextLine();
            arrFilters.add(Integer.parseInt(ramMemory));

            System.out.println("Операционная система?");
            String operatingSystem = scanner.nextLine();
            arrFilters.add(operatingSystem);

            System.out.println("Цвет?");
            String color = scanner.nextLine();
            arrFilters.add(color);

            System.out.println("Дисплей?() 14, 15...");
            String display = scanner.nextLine();
            arrFilters.add(Integer.parseInt(display));

            System.out.println("Цена до?");
            String price = scanner.nextLine();
            arrFilters.add(Integer.parseInt(price));


        }
        return arrFilters;
    }
}