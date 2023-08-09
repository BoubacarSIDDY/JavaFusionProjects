package com.isi.dao;

public class DaoImpl implements IDao{
    @Override
    public double getData() {
        System.out.println("Version BD");
        return Math.random() * 40;
    }
}
