package com.isi.metier;

import com.isi.dao.IDao;

public class MetierImpl implements IMetier{
    IDao dao;
    @Override
    public double calcul() {
        double temp = dao.getData();
        return (temp * 5) / Math.random() * 2;
    }

    public void setDao(IDao dao) {
        this.dao = dao;
    }
}
