package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Есть 3 типа самолетов : Fighter, " +
                "Пассажирский самолёт (Aerobus), " +
                "Пассажирский самолёт (Boeing)");
        System.out.println("Введите номер самолета для получения большей информации ");
        System.out.println("1 - Fighter OR 2 - Aerobus OR 3 - Boeing OR 4 - Узнать информацию о всем них");


        Integer number = Integer.parseInt(reader.readLine());

        if (number == 1) {
            System.out.println("Тип самолёта: Jet");
            System.out.println("Модель : F-22 Raptor");
        } else if (number == 2) {
            System.out.println("Тип самолёта: Airliner");
            System.out.println("Модель: Aerobus 737,");
            System.out.println("Колличество пасажиров в эконом классе : 99");
        } else if (number == 3) {
            System.out.println("Тип самолёта: Airliner");
            System.out.println("Модель: Boeing 777,");
            System.out.println("Колличество пасажиров в эконом классе: 110");
            System.out.println("Колличество пасажиров в бизнес классе: 30");
        } else if (number == 4) {
            System.out.println("Тип самолёта:: Jet");
            System.out.println("Модель : F-22 Raptor");
            System.out.println("====================");
            System.out.println("Тип самолёта:: Airliner");
            System.out.println("Модель : Aerobus 737,");
            System.out.println("Колличество пасажиров в эконом классе : 99");
            System.out.println("====================");
            System.out.println("Тип самолёта:: Airliner");
            System.out.println("Модель : Boeing 777,");
            System.out.println("Колличество пасажиров в эконом классе: 110");
            System.out.println("Колличество пасажиров в бизнес классе: 30");
        } else
            System.out.println ("Неправильно введен номер ");

    }
}

