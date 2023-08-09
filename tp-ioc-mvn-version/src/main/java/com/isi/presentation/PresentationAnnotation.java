package com.isi.presentation;

import com.isi.metier.IMetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PresentationAnnotation {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.isi");
        IMetier metier = (IMetier) context.getBean(IMetier.class);
        System.out.println(metier.calcul());
    }
}
