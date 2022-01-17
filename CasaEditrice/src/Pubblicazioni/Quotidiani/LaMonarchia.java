package Pubblicazioni.Quotidiani;

import java.time.LocalDate;

import Pubblicazioni.Pubblicazione;
import Pubblicazioni.Tipo;

public class LaMonarchia implements Pubblicazione{
    private double costo;
    private boolean soloOnline;
    private Tipo tipoDiAbbonamento;
    
    public LaMonarchia(boolean soloOnline, Tipo tipoDiAbbo) {
        this.soloOnline = soloOnline;
        this.tipoDiAbbonamento = tipoDiAbbo;
        costo = costoTotale();
    }

    @Override
    public double costoTotale() {
        if (tipoDiAbbonamento == Tipo.Annuale){
            costo = 150;
        } else {
            costo = 20;
        }
        if (!soloOnline){
            costo += 30;
        }
        return costo;
    }
    
}
