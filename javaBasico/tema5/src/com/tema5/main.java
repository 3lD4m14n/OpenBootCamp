package com.tema5;

public class main {
    public static void main( String[] args ){
        CocheCrud crud = new CocheCrudImpl();

        crud.delete();
        crud.findAll();
        crud.save();
    }
}
