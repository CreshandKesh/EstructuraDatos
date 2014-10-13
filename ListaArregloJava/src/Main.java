package com.pythonteam.primer;

public class Main {

    public static void main(String[] args) {

        Lista l = new Lista ();
        l.m_añadirElemento (3);
        l.m_añadirElemento (2);
        l.m_añadirElemento (5);
        l.m_añadirElemento (3);
        System.out.println (l.m_imprimir ());
        l.m_eliminar (2);
        System.out.println (l.m_imprimir ());
    }
}
