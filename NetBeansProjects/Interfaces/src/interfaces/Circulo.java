/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

/**
 *
 * @author victo
 */
public class Circulo implements AreaCalculavel{
    
    int raio;

    public Circulo(int raio) {
        this.raio = raio;
    }
    

    @Override
    public double calculaArea() {
        
        return (this.raio *this.raio)* Math.PI;
    }
    
    
    
}
