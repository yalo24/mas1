package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Person person = new Person();
        Person person1 = new Person("Вася", 23);
        person1.move();
        person1.talk();
        person.move();
        person.talk();
    }
}

    /*    BaseConverter faring = new Faring(20);
        BaseConverter kelv= new Kelv(40);
        kelv.convert();
        faring.convert();
        System.out.println("");
    }
}*/







