package metier;

import dao.IDao;

public class MetierImpl implements IMetier{
    IDao dao;
    @Override
    public double calcul() {
        double temp = dao.getData();
        return temp*100/Math.random()*15;
    }

    public void setDao(IDao dao) {
        this.dao = dao;
    }
}
