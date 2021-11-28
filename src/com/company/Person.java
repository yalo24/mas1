package com.company;

public class Person {
    public String fullname;
        int age;


        Person(String name, int age) {
            this.fullname = name;
            this.age = age;
                   }

        Person() {

        }

        void move() {
            System.out.println(fullname);
        }

        void talk() {
            System.out.println("Говорит");
        }

    }
