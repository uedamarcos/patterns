package org.marcosueda;



public class SingletonTitularPreguicoso {

    private static class InstanceHolder {
        public static SingletonTitularPreguicoso instancia = new SingletonTitularPreguicoso();
    }

    private SingletonTitularPreguicoso() {
        super();
    }

    public static SingletonTitularPreguicoso getInstancia() {
        return InstanceHolder.instancia;
    }
}