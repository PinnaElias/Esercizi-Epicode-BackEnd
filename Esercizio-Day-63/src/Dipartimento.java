public class Dipartimento {

    private String settore;

    public Dipartimento(String settore) {
        if ((!settore.equals("PRODUZIONE")) && (!settore.equals("AMMINISTRAZIONE")) && (!settore.equals("VENDITE"))) {
            throw new IllegalArgumentException("Nome non valido.");
        } else {
            this.settore = settore;
        }
    }
    }
