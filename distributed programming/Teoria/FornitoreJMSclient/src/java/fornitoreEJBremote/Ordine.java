/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fornitoreEJBremote;

import java.io.Serializable;

/**
 *
 * @author ALDO
 */
public class Ordine implements Serializable{

    private int valoreOrdine;
    private int  quantitaOrdine;

    public Ordine(int valoreOrdine, int quantitaOrdine) {
        this.valoreOrdine = valoreOrdine;
        this.quantitaOrdine = quantitaOrdine;
    }

    @Override
    public String toString() {
        return "ordine{" + "valoreOrdine=" + valoreOrdine + ", quantitaOrdine=" + quantitaOrdine + '}';
    }

    public int getValoreOrdine() {
        return valoreOrdine;
    }

    public void setValoreOrdine(int valoreOrdine) {
        this.valoreOrdine = valoreOrdine;
    }

    public int getQuantitaOrdine() {
        return quantitaOrdine;
    }

    public void setQuantitaOrdine(int quantitaOrdine) {
        this.quantitaOrdine = quantitaOrdine;
    }
    public Ordine() {
    }
    
    
}
