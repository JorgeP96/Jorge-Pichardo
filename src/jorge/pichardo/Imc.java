/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jorge.pichardo;

/**
 *
 * @author Jorge Pichardo
 */
public class Imc {
    
    public float calcularImc(Usuario u){
        float resultado = u.peso/(u.altura*u.altura);
        return resultado;
    }
}
