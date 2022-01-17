import java.time.LocalDate;
import java.util.List;

import Contraenti.Contraente;
import Pubblicazioni.Pubblicazione;

public class Abbonamento {
    public Contraente abbonato;
    public List<Pubblicazione> pubblicazioni;
    public LocalDate dataStipula;
    
    public Abbonamento(Contraente contraente, List<Pubblicazione> pubblicazioni) {
        this.abbonato = contraente;
        this.pubblicazioni = pubblicazioni;
        this.dataStipula = LocalDate.now();
        DatabaseAbbo.tuttiGliAbbonamenti.add(this);
    }

    public double calcolaCosto(){
        double costo = 0;
        for (Pubblicazione p: pubblicazioni){
            costo += p.costoTotale();
        }
        if (pubblicazioni.size() > 1){
            costo = costo * (100-pubblicazioni.size())/100;
        }
        if (abbonato.quantiIndividui() > 1){
            costo = costo * (100-pubblicazioni.size())/100;
        }
        return costo;
    }
}
