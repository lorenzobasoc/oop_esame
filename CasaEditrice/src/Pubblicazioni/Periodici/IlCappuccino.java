package Pubblicazioni.Periodici;

import Pubblicazioni.Pubblicazione;
import Pubblicazioni.Tipo;

public class IlCappuccino implements Pubblicazione{
    private double costoAnnuale;
    private boolean soloOnline;

    public IlCappuccino(boolean soloOnline, Tipo tipo) {
        costoAnnuale = 50;
    }

    @Override
    public double costoTotale() {
        if (soloOnline){
            return costoAnnuale;
        } else {
            return costoAnnuale + 30;
        }
    }
    
}
