package com.company;

public class Faring extends BaseConverter {



    Faring( int znac) {
        super(znac);
       }
@Override
        public  void convert (){
            System.out.println(znac+32);
        }

    }
