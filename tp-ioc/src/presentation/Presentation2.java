package presentation;

import dao.IDao;
import metier.IMetier;

import java.io.File;
import java.lang.reflect.Method;
import java.util.Scanner;

public class Presentation2 {
    public static void main(String[] args) throws Exception{
        /**
         * Injection de dépendance par instanciation dynamique
         */
        Scanner scanner = new Scanner(new File("config.txt"));
        String daoClassName = scanner.nextLine();
        Class cDao = Class.forName(daoClassName);
        IDao dao = (IDao) cDao.newInstance();

        // instanciation de la classe metier
        String metierClassName = scanner.nextLine();
        Class cMetier = Class.forName(metierClassName);
        IMetier metier = (IMetier) cMetier.newInstance();

        // appel de la méthode setDao(IDao) de la MetierImpl dynamiquement:
        Method method = cMetier.getMethod("setDao", IDao.class);

        method.invoke(metier, dao); // execute la méthode (metier.setDao(dao)

        System.out.println("Résultats : " + metier.calcul());
    }
}
