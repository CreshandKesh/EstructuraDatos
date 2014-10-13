package com.pythonteam.segundo;

public class sumaSuperEntero
{
    String m_sumar (String p_num1, String p_num2)
    {
        String v_retorno = "";
        int v_tamNum1 = p_num1.length () - 1;
        int v_tamNum2 = p_num2.length () - 1;
        int v_numSobrante = 0;
        int v_numASumar1, v_numASumar2;
        int v_suma2Numeros;

        while (v_tamNum1 >= 0 || v_tamNum2 >= 0)
        {
            if (v_tamNum1 >= 0)
                v_numASumar1 = p_num1.charAt (v_tamNum1) - '0';
            else
                v_numASumar1 = 0;
            if (v_tamNum2 >= 0)
                v_numASumar2 = p_num1.charAt (v_tamNum2) - '0';
            else
                v_numASumar2 = 0;

            v_suma2Numeros = v_numASumar1 + v_numASumar2 + v_numSobrante;

            if (v_suma2Numeros >= 10)
            {
                v_numSobrante = 1;
                v_suma2Numeros = v_suma2Numeros - 10;
            } else
            {
                v_numSobrante = 0;
            }

            v_retorno = v_suma2Numeros + v_retorno;
            v_tamNum1--;
            v_tamNum2--;
        }
        if (v_numSobrante > 0)
        {
            v_retorno = v_numSobrante + v_retorno;
        }
        return v_retorno;
    }
}