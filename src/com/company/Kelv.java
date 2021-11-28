package com.company;

public class Kelv extends BaseConverter{
    Kelv( int znac) {
        super(znac);
    }
    @Override
    public  void convert (){
        System.out.println(znac+273);
    }

}
