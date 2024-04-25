package Es3;

import java.util.HashMap;
import java.util.Set;

public class rubrica {

    private HashMap<String, String> rubrica;

    public rubrica() {
        this.rubrica = new HashMap<>();
    }


    public void inserisciContatto(String nome, String numero) {
        try {
            rubrica.put(nome, numero);
        } catch (NullPointerException e) {
            System.out.println("null");
        }

    }

    public void eliminaContatto(String nome, String numero) {
        rubrica.remove(nome);
    }

    public String cercaPerNome(String nome) {
        return rubrica.getOrDefault(nome, "nome non trovato");
    }

    public String cercaPerTelefono(String numero) {
        Set<String> nomi = rubrica.keySet();

        for (String nome : nomi) {
            String numeroTelefono = rubrica.get(nome);
            if (numeroTelefono.equals(numero)) {
                return nome;
            }
        }
        return null;
    }

}


