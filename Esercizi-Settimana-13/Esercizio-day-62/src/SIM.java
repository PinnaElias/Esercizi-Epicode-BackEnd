import java.util.ArrayList;

public class SIM {

    private String numCell;
    public double credito;
    private ArrayList<String> registro;

    public SIM (String numCell) {
    this.numCell = numCell;
    this.credito = 0.0;
    this.registro = new ArrayList<>();
    }

    public void print (String numCell){
        System.out.println("Numero di telefono: " + numCell);
        System.out.println("Credito disponibile " + credito);

        if (registro.isEmpty()) {
            System.out.println("Nessuna chiamata effettuata");
        } else {
            System.out.println("Chiamate effettuate: " + registro);
        }
    };

}
