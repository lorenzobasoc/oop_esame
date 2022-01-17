import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import Contraenti.ClientePrivato;
import Pubblicazioni.Pubblicazione;
import Pubblicazioni.Tipo;
import Pubblicazioni.Periodici.IlCappuccino;

public class App {
    public static void main(String[] args) throws Exception {
        List<Pubblicazione> pubblicazioni = new ArrayList<Pubblicazione>();
        pubblicazioni.add(new IlCappuccino(true, Tipo.Mensile));

        Abbonamento abbo = new Abbonamento(new ClientePrivato(), pubblicazioni);
        System.out.println(costoTotaleAbbo(abbo));
    }

    public static double costoTotaleAbbo(Abbonamento abbo){
        return abbo.calcolaCosto();
    }

    public static List<Abbonamento> abbonamentiInScadenzaTra(int giorni){
        List<Abbonamento> list = new ArrayList<Abbonamento>();
        for (Abbonamento a: DatabaseAbbo.tuttiGliAbbonamenti){
            if (a.dataStipula - LocalDate.now()){
                
            }
        }
    }
}
