package org.marcosueda;


import org.marcosueda.SingletonApressado;
import org.marcosueda.SingletonPreguicoso;
import org.marcosueda.SingletonTitularPreguicoso;


public class Teste {

    public static void main(String[] args) {

        // Singleton

        SingletonPreguicoso lazy = SingletonPreguicoso.getInstancia();
        System.out.println(lazy);
        lazy = SingletonPreguicoso.getInstancia();
        System.out.println(lazy);

        SingletonApressado eager = SingletonApressado.getInstancia();
        System.out.println(eager);
        eager = SingletonApressado.getInstancia();
        System.out.println(eager);

        SingletonTitularPreguicoso lazyHolder = SingletonTitularPreguicoso.getInstancia();
        System.out.println(lazyHolder);
        lazyHolder = SingletonTitularPreguicoso.getInstancia();
        System.out.println(lazyHolder);
    }

}
