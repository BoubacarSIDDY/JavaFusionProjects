package com.isi.ext;

import com.isi.dao.IDao;

public class DaoImplVC implements IDao {
    @Override
    public double getData() {
        System.out.println("Version capteurs");
        return 40;
    }
}
