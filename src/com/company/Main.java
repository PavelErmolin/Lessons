package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        while (true) {
            task512();
        }
    }

    public static void task11() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число А: ");
        int a = scanner.nextInt();
        System.out.println("Введите число B: ");
        int b = scanner.nextInt();
        int d = a / b;
        System.out.println("Результат деления: " + d);
        int c = a % b;
        System.out.println("Остаток от деления: " + c);
    }

    public static void task12() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число А: ");
        int a = scanner.nextInt();
        System.out.println("Введите число B: ");
        int b = scanner.nextInt();
        int rez = (5 * a + b * b) / (b - a);
        System.out.println("Результат: " + rez);
    }

    public static void task13() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите А: ");
        String a = scanner.next();
        System.out.println("Введите B: ");
        String b = scanner.next();
        String c = a;
        a = b;
        b = c;
        System.out.println("A: " + a);
        System.out.println("B: " + b);
    }

    public static void task14() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число А: ");
        double a = scanner.nextInt();
        System.out.println("Введите число B: ");
        double b = scanner.nextInt();
        System.out.println("Введите число C: ");
        double c = scanner.nextInt();
        double x = (c - b) / a;
        System.out.println("X: " + x);
    }

    public static void task15() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число X1: ");
        int x1 = scanner.nextInt();
        System.out.println("Введите число Y1: ");
        int y1 = scanner.nextInt();
        System.out.println("Введите число X2: ");
        int x2 = scanner.nextInt();
        System.out.println("Введите число Y2: ");
        int y2 = scanner.nextInt();
        double a = (double) (y1 - y2) / (double) (x1 - x2);
        double b = (double) y2 - a * x2;
        System.out.println("y=" + a + "x+" + b);
    }

    public static void task21() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число A: ");
        int A = scanner.nextInt();
        System.out.println("Введите число B: ");
        int B = scanner.nextInt();
        int rez = 0;
        if (A > B) {
            rez = A + B;
        } else {
            if (A == B) {
                rez = A * B;
            } else {
                rez = A - B;
            }
        }
        System.out.println("Результат=" + rez);
    }

    public static void task22() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число X: ");
        int x = scanner.nextInt();
        System.out.println("Введите число Y: ");
        int y = scanner.nextInt();
        if (x > 0 && y > 0) {
            System.out.println("первая четверть");
        } else {
            if (x < 0 && y > 0) {
                System.out.println("вторая четверть");
            } else {
                if (x < 0 && y < 0) {
                    System.out.println("третья четверть");
                } else {
                    if (x > 0 && y < 0) {
                        System.out.println("четвертая четверть");
                    } else {
                        System.out.println("Находится на осях координатной плоскости");
                    }
                }
            }
        }
    }

    public static void task23() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число A: ");
        int a = scanner.nextInt();
        System.out.println("Введите число B: ");
        int b = scanner.nextInt();
        System.out.println("Введите число C: ");
        int c = scanner.nextInt();
        if (a > b) {
            if (a > c) {
                if (b > c) {
                    System.out.println(c + " " + b + " " + a);
                } else {
                    System.out.println(b + " " + c + " " + a);
                }
            } else {
                System.out.println(b + " " + a + " " + c);
            }
        } else {
            if (b > c) {
                if (a > c) {
                    System.out.println(c + " " + a + " " + b);
                } else {
                    System.out.println(a + " " + c + " " + b);
                }
            } else {
                System.out.println(a + " " + b + " " + c);
            }
        }
        System.out.println("END");
    }

    public static void task24() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число A: ");
        int a = scanner.nextInt();
        System.out.println("Введите число B: ");
        int b = scanner.nextInt();
        System.out.println("Введите число С: ");
        int c = scanner.nextInt();
        double diskriminant = b * b - 4 * a * c;
        if (diskriminant > 0) {
            double x1 = ((-b) + Math.sqrt(diskriminant)) / (2 * a);
            double x2 = ((-b) - Math.sqrt(diskriminant)) / (2 * a);
            if (x1 == x2)
                System.out.println("x1=x2=" + x1);
            else
                System.out.println("x1=" + x1 + " x2=" + x2);
        } else
            System.out.println("Нет решений");

    }

    public static void task25() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        int a = scanner.nextInt();
        if (a > 9 && a < 100) {
            if (a < 20) {
                switch (a) {
                    case 10: {
                        System.out.println("Десять");
                        break;
                    }
                    case 11: {
                        System.out.println("Одиннадцать");
                        break;
                    }
                    case 12: {
                        System.out.println("Двенадцать");
                        break;
                    }
                    case 13: {
                        System.out.println("Тринадцать");
                        break;
                    }
                    case 14: {
                        System.out.println("Четырнатцать");
                        break;
                    }
                    case 15: {
                        System.out.println("Пятнадцать");
                        break;
                    }
                    case 16: {
                        System.out.println("Шеснадцать");
                        break;
                    }
                    case 17: {
                        System.out.println("Семнадцать");
                        break;
                    }
                    case 18: {
                        System.out.println("Восемнадцать");
                        break;
                    }
                    case 19: {
                        System.out.println("Девятнадцать");
                        break;
                    }
                }
            } else {
                switch (a / 10) {
                    case 2: {
                        System.out.print("Двадцать");
                        break;
                    }
                    case 3: {
                        System.out.print("Тридцать");
                        break;
                    }
                    case 4: {
                        System.out.print("Сорок");
                        break;
                    }
                    case 5: {
                        System.out.print("Пятьдесят");
                        break;
                    }
                    case 6: {
                        System.out.print("Шестьдесят");
                        break;
                    }
                    case 7: {
                        System.out.print("Семьдесят");
                        break;
                    }
                    case 8: {
                        System.out.print("Восемьдесят");
                        break;
                    }
                    case 9: {
                        System.out.print("Девяносто");
                        break;
                    }
                }
                switch (a % 10) {
                    case 1: {
                        System.out.println(" один");
                        break;
                    }
                    case 2: {
                        System.out.println(" два");
                        break;
                    }
                    case 3: {
                        System.out.println(" три");
                        break;
                    }
                    case 4: {
                        System.out.println(" четыре");
                        break;
                    }
                    case 5: {
                        System.out.println(" пять");
                        break;
                    }
                    case 6: {
                        System.out.println(" шесть");
                        break;
                    }
                    case 7: {
                        System.out.println(" семь");
                        break;
                    }
                    case 8: {
                        System.out.println(" восемь");
                        break;
                    }
                    case 9: {
                        System.out.println(" девять");
                        break;
                    }
                }

            }
        }

    }

    public static void task26() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число x: ");
        int x = scanner.nextInt();
        System.out.println("Введите число y: ");
        int y = scanner.nextInt();
        System.out.println("Введите число r: ");
        int r = scanner.nextInt();
        if (x * x + y * y < r * r) {
            System.out.println("Точка находится внутри окружности");
        } else if (x * x + y * y == r * r) {
            System.out.println("Точка находится на окружности");
        } else
            System.out.println("Точка находится за пределами окружности");
    }

    public static void task27() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберете вариант задания: ");
        String ch = scanner.next();
        switch (ch) {
            case "a": {
                System.out.println("Выбран варинат А");
                System.out.println("Введите трехзначное число");
                int x = scanner.nextInt();
                int a = x / 100;
                int b = x / 10 - a * 10;
                int c = x - a * 100 - b * 10;
                if (x * x == (a + b + c) * (a + b + c) * (a + b + c))
                    System.out.println("True");
                else
                    System.out.println("Falce");
                break;
            }
            case "b": {
                System.out.println("Выбран варинат b");
                System.out.println("Введите четырехзначное число");
                int x = scanner.nextInt();
                int a = x / 1000;
                int b = x / 100 - a * 10;
                int c = x / 10 - a * 100 - b * 10;
                int d = x - a * 1000 - b * 100 - c * 10;
                if (a + b == c + d)
                    System.out.println("True");
                else
                    System.out.println("Falce");
                break;
            }
            case "c": {
                System.out.println("Выбран варинат c");
                System.out.println("Введите трехзначное число");
                int x = scanner.nextInt();
                int a = x / 100;
                int b = x / 10 - a * 10;
                int c = x - a * 100 - b * 10;
                if (a == b)
                    System.out.println("True");
                else if (a == c)
                    System.out.println("True");
                else if (b == c)
                    System.out.println("True");
                else
                    System.out.println("Falce");
                break;
            }
            case "d": {
                System.out.println("Выбран варинат d");
                System.out.println("Введите вещественное число");
                float x = scanner.nextFloat();
                int a = (int) (x * 10 - (int) x * 10);
                int b = (int) (x * 100 - (int) x * 100) - a * 10;
                int c = (int) (x * 1000 - (int) x * 1000) - a * 100 - b * 10;
                if (a * b * c == 0)
                    System.out.println("True");
                else
                    System.out.println("Falce");
                break;
            }
        }
    }

    public static void task31() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число X: ");
        int x = scanner.nextInt();
        System.out.println("В степерь Y : ");
        int y = scanner.nextInt();
        if (y >= 0) {
            int rez = 1;
            for (int i = 0; i < y; i++) {
                rez *= x;
            }
            System.out.println("Результат " + rez);
        } else {
            System.out.println("Степень не может быть меньше 0 ");
        }
    }

    public static void task32() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число X: ");
        int x = scanner.nextInt();
        if (x < -1000 || x > 1000 || x == 0)
            System.out.println("Нет чисел которые делятся на А");
        else {
            for (int i = Math.abs(x); i <= 1000; i += Math.abs(x)) {
                if (i % x == 0) {
                    System.out.println(" " + i);
                }
            }
        }
    }

    public static void task33() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число A: ");
        int a = scanner.nextInt();
        if (a > 1) System.out.println("Результат: " + (int) (Math.ceil(Math.sqrt(a)) - 1));
        else System.out.println("Чисел, квадрат которых меньше " + a + " нет!");
    }

    public static void task34() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число A: ");
        int a = scanner.nextInt();
        a = Math.abs(a);
        for (int i = a / 2 + 1; i >= 1; i--) {
            if (a % i == 0) {
                System.out.println("Результат " + i);
                break;
            }
        }
    }

    public static void task35() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число A: ");
        int a = scanner.nextInt();
        System.out.println("Введите число B: ");
        int b = scanner.nextInt();
        int rez = 0;
        if (a > b) {
            int temp = a;
            a = b;
            b = temp;
        }
        for (int i = a; i < b; i++) {
            if (i % 7 == 0) {
                rez += i;
            }
        }
        System.out.println("Результат " + rez);
    }

    public static void task36() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число N: ");
        int n = scanner.nextInt();
        long rez = 1, rez_old = 0, rez_new = 1;
        if (n >= 1) {
            for (; n > 0; n--) {
                rez_new = rez + rez_old;
                rez_old = rez;
                rez = rez_new;
            }
        } else {
            System.out.println("Введено число меньше 1!");
        }
        System.out.println("Результат " + rez_old);
    }

    public static void task37() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число A: ");
        int a = Math.abs(scanner.nextInt());
        System.out.println("Введите число B: ");
        int b = Math.abs(scanner.nextInt());
        if (a == 0)
            System.out.println("Число А = 0!");
        else if (b == 0)
            System.out.println("Число B = 0!");
        else {
            while (a * b != 0) {
                if (a > b) {
                    a = a % b;
                } else {
                    b = b % a;
                }
            }
            System.out.println("Результат " + (a + b));
        }
    }

    public static void task38() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число A: ");
        int a = Math.abs(scanner.nextInt());
        double x = a;
        if (a == 0)
            System.out.println("Число А = 0!");
        else {
            for (double i = a / 2; i > 0.000000000000000000001; i /= 2) {
                if (x * x * x > a) {
                    x -= i;
                } else {
                    x += i;
                }
            }
        }
        System.out.println("Результат " + x);
    }

    public static void task39() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число A: ");
        int kol = 0, a = scanner.nextInt();
        for (; Math.abs(a) > 0; a /= 10) if (((a % 10) % 2) != 0) kol += 1;
        System.out.println("Количество нечетных чисел " + kol);
    }

    public static void task310() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число A: ");
        int a = scanner.nextInt();
        int b = 0;
        for (; a > 0; a /= 10) {
            b *= 10;
            b += a % 10;
        }
        System.out.println("Число B: " + b);
    }

    public static void task311() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число A: ");
        int a = scanner.nextInt();
        for (int i = 0; i < a; i++) {
            int ch = 0, nch = 0;
            for (int j = i; j > 0; j /= 10) {
                if (((j % 10) % 2) == 0) {
                    ch += j % 10;
                } else {
                    nch += j % 10;
                }
            }
            if (ch > nch)
                System.out.println("Число: " + i + " Сумма четных: " + ch + " Сумма чечетных: " + nch);
        }
    }

    public static void task312() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число A: ");
        int a = scanner.nextInt();
        System.out.println("Введите число B: ");
        int b = scanner.nextInt();
        boolean flag = false;
        for (; Math.abs(a) > 0; a /= 10)
            for (; Math.abs(b) > 0; b /= 10)
                if ((a % 10) == (b % 10))
                    flag = true;
        if (flag) System.out.println("ДА");
        else System.out.println("НЕТ");
    }

    public static void task313() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число N: ");
        float n = scanner.nextInt(), rez = 0;
        for (int i = 1; i <= n; i++) rez += 1 + 1 / (float) (i * i);
        System.out.println("Результат: " + rez);
    }

    public static void task314() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число X: ");
        float x = scanner.nextFloat(), rez = 0;
        System.out.println("Введите число N: ");
        int n = scanner.nextInt();
        for (int i = 1; i <= n; i++) {
            float numerator = x, denominator = 1;
            for (int j = 1; j <= i; j++) {
                numerator *= x;
                denominator *= j;
            }
            rez += numerator / denominator;
        }
        System.out.println("Результат: " + rez);
    }

    public static void task315() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число N: ");
        int n = scanner.nextInt();
        float rez = 0;
        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
            rez += (float) (1+i) / factorial;
        }
        System.out.println("Результат: " + rez);
    }

    public static void task316() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите точность: ");
        double d = Math.abs(scanner.nextFloat()), rez = 0;
        for (long i = 1; Math.abs(rez - (double) 3 / 4) >= d; i++) rez += (double) 1 / (i * (i + 2));
        System.out.println("Результат: " + rez);
    }

    public static void task317() {
        for (int i = 10; i < 100; i++)
            for (int j = 2; j < 10; j++)
                if ((i / 10 + i % 10) == ((i * j) / 10 + (i * j) % 10))
                    System.out.print(i + "*" + j + "=" + i * j + " ");
        System.out.println();
    }

    public static void task318() {
        for (int a = 1, facta = 1; a < 7; a++) {
            facta *= a;
            for (int b = 0, factb = 1; b < 7; b++) {
                if (b != 0) factb *= b;
                for (int c = 0, factc = 1; c < 7; c++) {
                    if (c != 0) factc *= c;
                    if ((a * 100 + b * 10 + c) == (facta + factb + factc))
                        System.out.println(a * 100 + b * 10 + c + " ");
                }
            }
        }
    }

    public static void task319() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число M: ");
        int m = scanner.nextInt();
        if (m < 0) System.out.println("Про мнимую единицу недоговарилась!");
        else {
            boolean flag = true;
            for (int i = 0; i < Math.sqrt(m); i++)
                for (int j = i; j < (Math.sqrt(m)); j++)
                    if (m == (i * i + j * j)) {
                        System.out.println("Есть решение: " + m + " = " + i + "^2 + " + j + "^2");
                        flag = false;
                    }
            if (flag) System.out.println("Нет таких чиселков");
        }
    }

    public static void task320() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        int m = scanner.nextInt(), rez = 0;
        if (m <= 0) System.out.println("Число должно быть больше 0!");
        else {
            for (int i = 1; i <= m / 2; i++)
                if (m % i == 0) rez += i;
            if (rez == m) System.out.println("Число совершенно");
            else System.out.println("Число несовершено");
        }
    }

    public static void task321() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите номер числа: ");
        int m = scanner.nextInt(), rez = 0, count = 0, i = 1;
        boolean flag = false;
        if (m <= 0) System.out.println("Число должно быть больше 0!");
        else {
            while (flag == false) {
                while (i > 0) {
                    i = i / 10;
                    count++;
                }
                if (count >= m) {
                    i=rez;
                    while (count != m) {
                        i /= 10;
                        count--;
                    }
                    System.out.println(m + " число последовательности " + i % 10);
                    flag = true;
                }
                rez++;
                i = rez;
            }
        }
    }

    public static void task322() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите номер числа: ");
        int m = scanner.nextInt(), rez = 0, count = 0, i = 1;
        boolean flag = false;
        if (m <= 0) System.out.println("Число должно быть больше 0!");
        else {
            while (flag == false) {
                while (i > 0) {
                    i = i / 10;
                    count++;
                }
                if (count >= m) {
                    i = rez*rez;
                    while (count != m) {
                        i /= 10;
                        count--;
                    }
                    System.out.println(m + " число последовательности " + i % 10);
                    flag = true;
                }
                rez++;
                i = rez*rez;
            }
        }
    }

    public static void task323() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите номер числа: ");
        int m = scanner.nextInt(), rez = 1,rez_old=0,rez_new=1, count = 0, i = 1;
        boolean flag = false;
        if (m <= 0) System.out.println("Число должно быть больше 0!");
        else {
            while (flag == false) {
                while (i > 0) {
                    i = i / 10;
                    count++;
                }
                if (count >= m) {
                    i = rez;
                    while (count != m) {
                        i /= 10;
                        count--;
                    }
                    System.out.println(m + " число последовательности " + i % 10);
                    flag = true;
                }
                rez_old=rez;
                rez=rez_new;
                rez_new=rez+rez_old;
                i = rez;
            }
        }
    }

    public static void task41() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размерность массива: ");
        int n = Math.abs(scanner.nextInt());
        int[] mass = input_random_mass(n);
        int min = mass[0];
        for (int i = 0; i < n; i++)
            if (min > mass[i])
                min = mass[i];
        output_mass(mass);
        System.out.println("Минимальное число: " + min);
    }

    public static void task42() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размерность массива: ");
        int n = Math.abs(scanner.nextInt());
        int[] mass = input_random_mass(n);
        int max = mass[0];
        for (int i = 0; i < n; i++)
            if (max < mass[i])
                max = mass[i];
        output_mass(mass);
        System.out.println("Максимальное число: " + max);
    }

    public static void task43() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размерность массива: ");
        int n = Math.abs(scanner.nextInt());
        int[] mass = input_random_mass(n);
        int min = mass[0], index = 0;
        for (int i = 0; i < n; i++)
            if (min > mass[i]) {
                min = mass[i];
                index = i;
            }
        output_mass(mass);
        System.out.println("Индекс минимального числа: " + index);
    }

    public static void task44() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размерность массива: ");
        int n = Math.abs(scanner.nextInt());
        int[] mass = input_random_mass(n);
        int max = mass[0], index = 0;
        for (int i = 0; i < n; i++)
            if (max < mass[i]) {
                max = mass[i];
                index = i;
            }
        output_mass(mass);
        System.out.println("Индекс максимального числа: " + index);
    }

    public static void task45() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размерность массива: ");
        int n = Math.abs(scanner.nextInt());
        int[] mass = input_random_mass(n);
        long summ = 0;
        for (int i = 1; i < n; i += 2) {
            summ += mass[i];
        }
        output_mass(mass);
        System.out.println("Сумма нечетных элементов массива: " + summ);
    }

    public static void task46() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размерность массива: ");
        int n = Math.abs(scanner.nextInt());
        int[] mass = input_random_mass(n);
        int temp = 0;
        output_mass(mass);
        for (int i = 0; i < n / 2; i++) {
            temp = mass[i];
            mass[i] = mass[n - i - 1];
            mass[n - i - 1] = temp;
        }
        output_mass(mass);
    }

    public static void task47() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размерность массива: ");
        int n = Math.abs(scanner.nextInt());
        int[] mass = input_random_mass(n);
        int count = 0;
        output_mass(mass);
        for (int i = 0; i < n; i++) {
            if (mass[i] % 2 != 0)
                count++;
        }
        System.out.println("Нечетных чисел: " + count);
    }

    public static void task48() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размерность массива: ");
        int n = Math.abs(scanner.nextInt());
        int[] mass = input_random_mass(n);
        int temp = 0;
        output_mass(mass);
        for (int i = 0; i < n / 2; i++) {
            temp = mass[i];
            mass[i] = mass[(int) Math.ceil((double) n / 2) + i];
            mass[(int) Math.ceil((double) n / 2) + i] = temp;
        }
        output_mass(mass);
    }

    public static void task49() { //Bubble
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размерность массива: ");
        int n = Math.abs(scanner.nextInt());
        int[] mass = input_random_mass(n);
        int temp = 0;
        output_mass(mass);
        for (int i = n - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (mass[j] > mass[j + 1]) {
                    temp = mass[j];
                    mass[j] = mass[j + 1];
                    mass[j + 1] = temp;
                }
            }
        }
        output_mass(mass);
    } //Bubble

    public static void task410() { // Select
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размерность массива: ");
        int n = Math.abs(scanner.nextInt());
        int[] mass = input_random_mass(n);
        int temp = 0, max = 0, index_max = 0;
        output_mass(mass);
        for (int i = 0; i < n; i++) {
            max = mass[i];
            index_max = i;
            for (int j = n - 1; j > i; j--) {
                if (mass[j] > max) {
                    max = mass[j];
                    index_max = j;
                }

            }
            temp = mass[i];
            mass[i] = mass[index_max];
            mass[index_max] = temp;
        }
        output_mass(mass);
    } // Select

    public static void task51() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размерность массива: ");
        int n = Math.abs(scanner.nextInt());
        int m = Math.abs(scanner.nextInt());
        int[][] mass = input_random_mass(n, m);
        int min = mass[0][0];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < m; j++)
                min = mass[i][j] < min ? mass[i][j] : min;
        output_mass(mass);
        System.out.println("Минимальный элемент массива: "+ min);
    } // Через тернарный оператор

    public static void task52() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размерность массива: ");
        int n = Math.abs(scanner.nextInt());
        int m = Math.abs(scanner.nextInt());
        int[][] mass = input_random_mass(n, m);
        int max = mass[0][0];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < m; j++) {
                max = Math.max(mass[i][j], max);
            }
        output_mass(mass);
        System.out.println("Максимальный элемент массива: "+ max);
    } // Через Math

    public static void task53() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размерность массива: ");
        int n = Math.abs(scanner.nextInt());
        int m = Math.abs(scanner.nextInt());
        int[][] mass = input_random_mass(n, m);
        int min = mass[0][0],min_i=0,min_j=0;
        for (int i = 0; i < n; i++)
            for (int j = 0; j < m; j++) {
                if (mass[i][j] < min){
                    min_i=i+1;
                    min_j=j+1;
                    min = mass[i][j];
                }
            }
        output_mass(mass);
        System.out.println("Минимальный элемент массива: "+ min +" По адресу " + min_i+" "+min_j);
    }

    public static void task54() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размерность массива: ");
        int n = Math.abs(scanner.nextInt());
        int m = Math.abs(scanner.nextInt());
        int[][] mass = input_random_mass(n, m);
        int max = mass[0][0],max_i=0,max_j=0;
        for (int i = 0; i < n; i++)
            for (int j = 0; j < m; j++) {
                if(mass[i][j]>max) {
                    max = mass[i][j];
                    max_i = i+1;
                    max_j = j+1;
                }
            }
        output_mass(mass);
        System.out.println("Максимальный элемент массива: "+ max+ " По адресу " + max_i+" "+max_j);
    }

    public static void task55() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размерность массива: ");
        int n = Math.abs(scanner.nextInt());
        int m = Math.abs(scanner.nextInt());
        int[][] mass = input_random_mass(n, m);
        output_mass(mass);
        boolean flag;
        for (int i = 0; i < n; i++)
            for (int j = 0; j < m; j++) {
                flag=true;
                if(i!=0)
                    if(mass[i][j]<=mass[i-1][j])
                        flag=false;
                if(j!=0)
                    if(mass[i][j]<=mass[i][j-1])
                        flag=false;
                if(i!=n-1)
                    if(mass[i][j]<=mass[i+1][j])
                        flag=false;
                if(j!=m-1)
                    if(mass[i][j]<=mass[i][j+1])
                        flag=false;
                if(flag)
                    System.out.println("Элемент массива больше всех своих соседей: "+ mass[i][j]);
            }
    }

    public static void task56() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размерность массива: ");
        int n = Math.abs(scanner.nextInt());
        int[][] mass = input_random_mass(n, n);
        output_mass(mass);
        System.out.println("=====================");
        int temp=0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                temp = mass[i][j];
                mass[i][j]=mass[j][i];
                mass[j][i]=temp;
            }
        }
        output_mass(mass);
    }

    public static void task57() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размерность массива: ");
        int n = Math.abs(scanner.nextInt());
        int m = Math.abs(scanner.nextInt());
        float[][] mass = input_random_mass_float_57(n, m);
        boolean[] vector = new boolean [m];
        System.out.println("=====================");
        for (int i = 0; i < m; i++) {
            vector[i]=true;
            for (int j = 0; j < n; j++){
                if(mass[j][i] != 0)
                    vector[i]=false;
            }
        }
        output_mass(mass);
        System.out.println();
        output_mass(vector);
    }

    public static void task58() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размерность массива: ");
        int n = Math.abs(scanner.nextInt());
        int m = Math.abs(scanner.nextInt());
        int[][] mass = input_random_mass(m+1, n+1);
        int[] vector = new int [n+1];
        System.out.println("=====================");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++){
                if(mass[j][i] != 0)
                    vector[i]+=mass[j][i];
            }
        }
        output_mass(mass);
        System.out.println("Сумма столбцов:");
        output_mass(vector);
    }

    public static void task59() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размерность массива: ");
        int n = Math.abs(scanner.nextInt());
        int[][] mass = input_random_mass(n, n);
        int min,max,min_j=0,max_i=0;
        output_mass(mass);
        System.out.println("=====================");
        for (int i = 0; i < n; i++) {
            min =mass[i][0];
            min_j=0;
            for (int j = 1; j < n; j++){
                if(mass[i][j] < min) {
                    min = mass[i][j];
                    min_j = j;
                }
            }
            for(int k=0;k<n;k++){
                max=mass[0][min_j];
                max_i=0;
                for (int s = 0; s < n; s++){
                    if(mass[s][min_j] >max) {
                        max = mass[s][min_j];
                        max_i = s;
                    }
                }
            }
            if (max_i==i)
                System.out.println("Седловой точка: "+mass[max_i][min_j]+" с координатами ("+(min_j+1)+":"+(max_i+1)+")");
        }
    }

    public static void task510() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число K");
        int k = scanner.nextInt();
        int n = 5,m=7;
        if(k>1&&k<=n+m){
            System.out.println("Размерность массива 5х7");
            float[][] mass = input_random_mass_float(n,m);
            output_mass(mass);
            if(k>5) {
                n=5;
                m=k-n;
            }
            else{
                n=k-1;
                m=1;
            }
            float summ=0;
            System.out.println("=====================");
            for(int i =0;i<n;i++) {
                for(int j = 0 ; j<m;j++){
                    summ+=mass[i][j];
                }
            }
            System.out.println("Сумма массива размерностью ("+n+":"+m+")"+summ);
        }
        else {
            System.out.println("Нет решений!");
        }
    }

    public static void task511() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размерность массива: ");
        int n = Math.abs(scanner.nextInt());
        int m = Math.abs(scanner.nextInt());
        int[][] mass = input_random_mass(n, m);
        output_mass(mass);
        System.out.println("=====================");
        int max = mass[0][0], max_i = 0, max_j = 0, min = mass[0][0], min_i = 0, min_j = 0;
        for (int i = 0; i < n; i++)
            for (int j = 0; j < m; j++) {
                if (mass[i][j] > max) {
                    max = mass[i][j];
                    max_i = i;
                    max_j = j;
                }
                if (mass[i][j] < min) {
                    min = mass[i][j];
                    min_i = i;
                    min_j = j;
                }
            }
        int temp;
        for (int j = 0; j < m; j++) {
            temp=mass[0][j];
            mass[0][j]=mass[max_i][j];
            mass[max_i][j]=temp;
        }
        for (int i = 0; i < n; i++) {
            temp=mass[i][0];
            mass[i][0]=mass[i][max_j];
            mass[i][max_j]=temp;
        }
        output_mass(mass);
        System.out.println("=====================");
        if (min_i == max_i || min_j == max_j)
            System.out.println("Нельзя переместить минимальный в правый нижний угол");
        else {
            if(min_i==0)
                min_i=max_i;
            if(min_j==0)
                min_j=max_j;
            for (int j = 0; j < m; j++) {
                temp=mass[n-1][j];
                mass[n-1][j]=mass[min_i][j];
                mass[min_i][j]=temp;
            }
            for (int i = 0; i < n; i++) {
                temp=mass[i][m-1];
                mass[i][m-1]=mass[i][min_j];
                mass[i][min_j]=temp;
            }
            output_mass(mass);
            System.out.println("=====================");
        }
    }

    public static void task512() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размерность массива: ");
        int n = Math.abs(scanner.nextInt());
        int[][] mass = new int[n][n];
        int count = 1, count_i = 0, count_j = 0;
        while (count <= n * n) {
            for (int j = count_i; j < n - count_j; j++, count++)
                mass[count_i][j] = count;
            count_i++;
            for (int i = count_i; i < n - count_j; i++, count++)
                mass[i][n - count_j - 1] = count;
            count_j++;
            for (int j = n - count_i - 1; j > count_i - 1; j--, count++)
                mass[n - count_i][j] = count;
            for (int i = n - count_j; i > count_j - 1; i--, count++)
                mass[i][count_j - 1] = count;
        }
        output_mass(mass);
        System.out.println("=====================");
    }

    public static void output_mass(int[] mass) {
        for (int i = 0; i < mass.length; i++)
            System.out.print(mass[i] + " ");
        System.out.println();
    }
    public static void output_mass(boolean[] mass) {
        for (int i = 0; i < mass.length; i++)
            System.out.print(mass[i] + " ");
        System.out.println();
    }
    public static void output_mass(int[][] mass) {
        for (int i = 0; i < mass.length; i++) {
            for (int j = 0; j < mass[i].length; j++)
                System.out.print(mass[i][j]<10?mass[i][j] + "  ":mass[i][j] + " ");
            System.out.println();
        }
    }
    public static void output_mass(float[][] mass) {
        for (int i = 0; i < mass.length; i++) {
            for (int j = 0; j < mass[i].length; j++)
                System.out.print(mass[i][j] + " ");
            System.out.println();
        }
    }
    public static int[] input_random_mass(int n) {
        int[] mass = new int[n];
        Random random = new Random();
        for (int i = 0; i < n; i++)
            mass[i] = random.nextInt(100);
        return mass;
    }
    public static int[][] input_random_mass(int n,int m) {
        int[][] mass = new int[n][m];
        Random random = new Random();
        for (int i = 0; i < n; i++)
            for(int j=0;j<m;j++)
                mass[i][j] = random.nextInt(100);
        return mass;
    }
    public static float[][] input_random_mass_float_57(int n,int m) {
        float[][] mass = new float[n][m];
        Random random = new Random();
        for (int i = 0; i < n; i++)
            for(int j=0;j<m;j++)
                mass[i][j] =random.nextInt(0,2);
        return mass;
    }
    public static float[][] input_random_mass_float(int n,int m) {
        float[][] mass = new float[n][m];
        Random random = new Random();
        for (int i = 0; i < n; i++)
            for (int j = 0; j < m; j++)
                mass[i][j] = random.nextFloat();
        return mass;
    }
    //test
}
