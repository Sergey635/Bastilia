package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("14 июля - день взятия Бастилии");
        System.out.println("Java conversion code");
        int a = 3;
        int b = 4;
        int c = a + b;
        int d = a - b;
        int e = a * b;
        int f = a / b;    //разделить и получить целое число
        int g = a % b;    //разделить и получить дробную часть
        // "=" - означает присвоить
        // для сравнения нужно использовать "=="
        // не равно    "!="
        //оператор сравнения
        // оператор условный
        if(a > e){                        //() условия сравнения либо да либо нет
            System.out.println("а больше е");
        }else {
            System.out.println("b больше е");
        }
        if (a == e){
            System.out.println("а равно е ");
        }else {
            System.out.println("а не равно е");
        }
        a = a + 1;      //инкремент
                    // означает а увеличить на 1
                    // аналоги
        a++;        //только +1
        a+=1;
        a = a + 20;
        a+=20;

        String hello = "Hello World";
        System.out.println(hello.charAt(6));
        System.out.println(hello.length());
        for (int i = 0; i <hello.length() ; i+=2) {
            System.out.println(hello.charAt(i));
        }
        String abba = "ABBK";
        boolean result = false;
        for (int i = 0; i <abba.length() /2; i++) {
            if (abba.charAt(i)==abba.charAt(abba.length()-1-i)){
                result = true;
            }
        }
        System.out.println(result);










    }
}
