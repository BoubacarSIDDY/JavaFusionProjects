package com.isi.metier;

import com.isi.dao.IDao;
import org.springframework.stereotype.Component;

@Component("metier")
public class MetierImpl implements IMetier{
    // couplage faible

    IDao dao;
    public MetierImpl(IDao dao){
        this.dao = dao;
    }
    @Override
    public double calcul() {
        double temp = dao.getData();
        return (temp * 5) / Math.random() * 2;
    }

}
