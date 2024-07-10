/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package casa;

/**
 *
 * @author 13826640608
 */
public class Porta {
    
    private boolean aberta;
    private String cor;
    private double dimensaox, dimensaoy, dimensaoz;
    
    public void abre (){
        
        this.aberta=true;
        
    }
    
     public void fecha (){
        
        this.aberta=false;
        
    }
     
      public void pinta (String cor){
        
        this.cor=cor;
        
    }
      
      public boolean estabaerta(){
          
          return this.aberta;
      }


    public String getCor() {
        return cor;
    }


    public double getDimensaox() {
        return dimensaox;
    }

    public void setDimensaox(double dimensaox) {
        this.dimensaox = dimensaox;
    }

    public double getDimensaoy() {
        return dimensaoy;
    }

    public void setDimensaoy(double dimensaoy) {
        this.dimensaoy = dimensaoy;
    }

    public double getDimensaoz() {
        return dimensaoz;
    }

    public void setDimensaoz(double dimensaoz) {
        this.dimensaoz = dimensaoz;
    }
      
      
}
