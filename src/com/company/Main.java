package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Pet[] masPets = {
                new Pet("er", 2, "cat"),
                new Pet("vs", 5, "dog")
        };
        Pet[] masPets1 = {
                new Pet("jk", 11, "cat")
        };
        Pet[] masPets2 = {
                new Pet("sn", 3, "fish"),
                new Pet("hdr", 11, "cat"),
                new Pet("asd", 8, "dog")
        };

        Chel ded = new Chel("Nick", 68, "Дед", "Любитель животных", masPets);
        Chel mother = new Chel("Lia", 42, "Мать", "Домохозяйка", masPets1);
        Chel father = new Chel("Pit", 48, "Отец", "Врач", masPets2);
        Chel doter = new Chel("Kat", 15, "Дочь", "Школьник", mother, father, masPets1);
        Chel son = new Chel("Alex", 5, "Сын", "Ребенок", mother, father, masPets1);
        Chel[] chels = {ded, mother, father, doter, son};
        for (int i = 0; i < chels.length; i++) {
            System.out.println();
            System.out.println(chels[i].rod+" "+chels[i].name +" Возраст " +chels[i].age+" "+ chels[i].prof/*" Мать "+chels[i].mother.name+"Отец "+chels[i].father.name*/ );
            for (int j = 0; j < chels[i].pets.length; j++) {
                System.out.println("Питомцы "+"Имя "+chels[i].pets[j].name+" Возраст "+chels[i].pets[j].age+" Тип "+chels[i].pets[j].type);
            }
        }



        /*  System.out.println(ded.rod+" "+ded.name +" Возраст " +ded.age+" "+ ded.prof);*/

    }
}






