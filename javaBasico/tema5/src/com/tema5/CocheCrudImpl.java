package com.tema5;

public class CocheCrudImpl implements CocheCrud{
    @Override
    public void delete() {
        System.out.println("delete");
    }

    @Override
    public void save() {
        System.out.println("save");
    }

    @Override
    public void findAll() {
        System.out.println("findAll");
    }
}
