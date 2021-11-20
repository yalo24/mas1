package com.company;

import java.util.Random;

public class Chel {
    public String name;
    int age;
    public String rod;
    public String prof;
    public Chel mother;
    public Chel father;
    public Pet[] pets;

    Chel(String name, int age, String rod, String prof, Chel mother, Chel father, Pet[] pets) {
        this.name = name;
        this.age = age;
        this.rod = rod;
        this.prof = prof;
        this.pets = pets;
        this.mother = mother;
        this.father = father;
    }

    Chel(String name, int age, String rod, String prof, Pet[] pets) {
        this.name = name;
        this.age = age;
        this.rod = rod;
        this.prof = prof;
        this.pets = pets;
    }

    void rod() {
        System.out.println("Род " + rod);
    }

    void prof() {
        System.out.println("Деятельность " + prof);
    }

}


