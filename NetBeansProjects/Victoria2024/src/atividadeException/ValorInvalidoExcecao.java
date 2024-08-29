/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividadeException;

/**
 *
 * @author 13826640608
 */
public class ValorInvalidoExcecao extends RuntimeException {
    
    ValorInvalidoExcecao(double valor) {
    super("Valor inválido: "+valor);
}
    
}
