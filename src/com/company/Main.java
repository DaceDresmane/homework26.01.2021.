package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //myMethod();
        //myMethod2();
        //myMethod3();
        //myMethod4();
        //myMethod5();

    }

    static void myMethod() {
        //task 1
        //Write a program to compare two elements

        short a = -10;
        short b = 3530;

        System.out.println("Largest number is " + Math.max(a, b));
        System.out.println("Smallest number is " + Math.min(a, b));
        System.out.println("Variables are equals? " + (a == b));

        if (a % 2 == 0) {
            System.out.println(a + " is even");
        } else {
            System.out.println(a + " is odd");
        }

        if (b % 2 == 0) {
            System.out.println(b + " is even");
        } else {
            System.out.println(b + " is odd");
        }
        if (a < 0) {
            System.out.println("Negative is " + a);
        } else if (b < 0) {
            System.out.println("Negative is " + b);
        }
        if (a > 0) {
            System.out.println("Positive is " + a);
        } else if (b > 0) {
            System.out.println("Positive is " + b);
        }
        if (a < 100) {
            System.out.println("Less than 100 is " + a);
        } else if (b < 100) {
            System.out.println("Less than 100 is " + b);
        }
    }


    static void myMethod2() {
        //task2
        //Write a program to show a greeting message in the console if time is known and than change time

        int time = 8;

        if (time < 12) {
            System.out.println("Good morning! " + "First part is done :) ");
            System.out.println("The time is " + time);
        }
        if (13 < time && time < 19) {
            System.out.println("Good afternoon!" + "First part is done :) ");
            System.out.println("The time is " + time);
        }
        if (20 < time && time < 24) {
            System.out.println("Good evening!" + "First part is done :) ");
            System.out.println("The time is " + time);
        }

        {
            System.out.println("The second part: ");
        }

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the time using 24-hour clock");
        int hours = input.nextInt();

        if (hours <= 12 && 1 < hours) {
            System.out.println("Good morning!");
        }
        if (13 <= hours && hours <= 19) {
            System.out.println("Good afternoon!");
        }
        if (20 <= hours && hours <= 24) {
            System.out.println("Good evening!");
        }
        if (hours >= 25 || hours <= 0) {
            System.out.println("Incorrect time");
        }
    }

    static void myMethod3() {
        //task 3
        //Write a program to format and print out the value of the date

        Scanner input = new Scanner(System.in);
        System.out.println(" Please enter day");
        int day = input.nextInt();
        System.out.println("Day is " + day);

        if (day <= 0 || day >= 32) {
            System.out.println("Incorrect day! " + "Try one more time");
            return;
        }

        System.out.println("Please enter month");
        int month = input.nextInt();
        System.out.println("Month is " + month);
        if (month <= 0 || month >= 13) {
            System.out.println("Incorrect month! " + "Try one more time");
            return;
        }

        System.out.println("Please enter year");
        int year = input.nextInt();
        System.out.println("Year is " + year);
        if (year < 1800) {
            System.out.println("Error!" + "Try one more time");
            return;
        }

        Scanner input2 = new Scanner(System.in);
        System.out.println("Please select the date formatting");
        System.out.println("1 - YYYY/MM/DD");
        System.out.println("2 - YYYY.MM.DD");
        int format = input.nextInt();

        if (format == 1) {
            System.out.println("Your date is  " + year + '/' + month + '/' + day);
        }

        if (format == 2) {
            System.out.println("Your date is  " + year + '.' + month + '.' + day);
        }
    }

    static void myMethod4() {
        //task4
        //Write a program where calculation of month will be performed if day number of the year is given.

        //!!! In future I need to find a shorter way :D

        System.out.println("Please enter the days number ");

        Scanner input = new Scanner(System.in);
        int days = input.nextInt();
        System.out.println("The day number is " + days);
        int jan=31,feb=28,mar=31,apr=30, may=31,jun=30,jul=31,aug=31,sep=30,oct=31,nov=30,dec=31;

        if (days>= 1 && days<=jan) {
            System.out.println("It is January");
        }
        if (days >= jan+1 && days <= (jan+feb)) {
            System.out.println("It is February");
        }
        if (days >= (jan+feb+1) && days <= (jan+feb+mar)) {
            System.out.println("It is March");
        }
        if (days >= (jan+feb+mar+1) && days <= (jan+feb+mar+apr)){
            System.out.println("It is April");
        }
        if (days >= (jan+feb+mar+apr+1) && days <= (jan+feb+mar+apr+may)){
            System.out.println("It is May");
        }
        if (days >= (jan+feb+mar+apr+may+1) && days <= (jan+feb+mar+apr+may+jun)){
            System.out.println("It is June");
        }
        if (days >= (jan+feb+mar+apr+may+jun+1) && days <= (jan+feb+mar+apr+may+jun+jul)){
            System.out.println("It is June");
        }
        if (days >= (jan+feb+mar+apr+may+jun+jul+1) && days <= (jan+feb+mar+apr+may+jun+jul+aug)){
            System.out.println("It is August");
        }
        if (days >= (jan+feb+mar+apr+may+jun+jul+aug+1) && days <= (jan+feb+mar+apr+may+jun+jul+aug+sep)){
            System.out.println("It is September");
        }
        if (days >= (jan+feb+mar+apr+may+jun+jul+aug+sep+1) && days <= (jan+feb+mar+apr+may+jun+jul+aug+sep+oct)){
            System.out.println("It is October");
        }
        if (days >= (jan+feb+mar+apr+may+jun+jul+aug+sep+oct+1) && days <= (jan+feb+mar+apr+may+jun+jul+aug+sep+oct+nov)){
            System.out.println("It is November");
        }
        if (days >= (jan+feb+mar+apr+may+jun+jul+aug+sep+oct+nov+1) && days <= (jan+feb+mar+apr+may+jun+jul+aug+sep+oct+nov+dec)){
            System.out.println("It is December");
        }
        if (days <= 0 || days >= 365) {
            System.out.println("Out of calendar :))) Please enter days number between 1 - 365");
        }
    }
    static void myMethod5(){
        //task5
        //Write a program where salary is calculated

        short workingHoursInDay=10;
        System.out.println("Your working hours in a day is " +workingHoursInDay);

        if(workingHoursInDay<=0 || workingHoursInDay>=25){
            System.out.println("Error");return;
        }
        if (workingHoursInDay<=8){
            System.out.println("The hourly rate is 10eur/h;");
            System.out.println(" You will get "+ (workingHoursInDay*10)+"EUR");
        }
        if (workingHoursInDay>8){
            System.out.println("The salary is 80 eur plus 15 eur for each extra hour;");
            System.out.println("You will get " +(80+(workingHoursInDay-8)*15)+"EUR");
        }

        System.out.println("Enter your working hours and I will calculate your salary :) ");
        Scanner input = new Scanner(System.in);
        int workingHoursInDay2=input.nextInt();
        System.out.println("Working hours is ");

        if(workingHoursInDay2<=0 || workingHoursInDay2>=25){
            System.out.println("Error");return;
        }
        if (workingHoursInDay2<=8){
            System.out.println("The hourly rate is 10eur/h;");
            System.out.println(" You will get "+ (workingHoursInDay2*10)+"EUR");
        }
        if (workingHoursInDay2>8){
            System.out.println("The salary is 80 eur plus 15 eur for each extra hour;");
            System.out.println("You will get " +(80+(workingHoursInDay2-8)*15)+"EUR");
        }
        };
        }