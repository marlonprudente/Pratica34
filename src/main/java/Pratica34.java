    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author a1562339
 */
public class Pratica34 {

    public long mdc(long m, long n) {
        long resultado = 0;
        if (m > n) {
            if (n == 0) {
                return m;
            }
            resultado = m % n;
            if (resultado == 0) {
                return n;
            } else {
                mdc(n, resultado);
            }
        }
        if (m < n) {
            if (m == 0) {
                return n;
            }
            resultado = n % m;
            if (resultado == 0) {
                return m;
            } else {
                mdc(m, resultado);
            }
        }

        return resultado;
    }

    public static long fatorial(int n) {
        long resultado = n;
        if (n == 0) {
            return 1;
        };
        if(n == 1){
            return 1;
        }
        if(n >= 2){
            resultado = resultado*fatorial(n-1);
        }
        return resultado;
    }
}
