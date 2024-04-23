package Es3;

import java.util.HashMap;
import java.util.Set;

public class rubrica {

        private HashMap<String, String> rubrica;

        public void inserisciContatto(String nome, String numero) {
            rubrica.put(nome, numero);
        }

        public void eliminaContatto(String nome, String numero) {
            rubrica.remove(nome);
        }

        public void cercaPerNome(String nome) {
            rubrica.get(nome);
        }

        public String cercaPerTelefono(String numero) {
            Set<String> nomi = rubrica.keySet();

            for (String nome:nomi) {
                String numeroTelefono = rubrica.get(nome);
                if(numeroTelefono.equals(numero)) {
                    return nome;
                }
            }
            return null;
        }

    }


