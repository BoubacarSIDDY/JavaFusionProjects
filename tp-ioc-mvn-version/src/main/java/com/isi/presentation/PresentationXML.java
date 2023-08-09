package com.isi.presentation;

import com.isi.metier.IMetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PresentationXML {
    public static void main(String[] args) throws Exception {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        //System.out.print(context);
        IMetier metier = (IMetier) context.getBean("metier");
        System.out.println("Résultats : " + metier.calcul());
    }
}
