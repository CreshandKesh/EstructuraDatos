package com.pythonteam.primer;

public class Lista
{
    int a_lista[];
    int a_tamLista =0;

    Lista()
    {
        a_lista=new int[0];
    }

   void m_añadirElemento(int p_elemento)
    {
        System.arraycopy (a_lista,0,a_lista=new int[++ a_tamLista],0,a_lista.length-1);
        a_lista[a_tamLista -1]= p_elemento;
    }
    void m_destLista()
    {
        a_lista = new int[0];
        a_tamLista =0;
    }

    void m_eliminar(int p_elemento)
    {
        int v_arrayAux[]=new int[a_lista.length];
        System.arraycopy (a_lista,0,v_arrayAux,0,a_lista.length);
        m_destLista ();
        for (int aV_arrayAux : v_arrayAux)
        {
            if (aV_arrayAux != p_elemento)
            {
                m_añadirElemento (aV_arrayAux);
            }
        }
    }

    String m_imprimir()
    {
        String v_retorno = "";
        for (int enA_lista : a_lista)
        {
            v_retorno += "" + enA_lista;
        }
        return v_retorno;
    }
}
