public class rettangolo {

    public String perimetro (int base, int altezza) {

        int per = (base + altezza) * 2;
        String res = "Il perimetro del tuo rettangolo è: ";
        String cm = " cm";
        return res + per + cm;
    }

    public String area (int base, int altezza) {

        int a = (base * altezza);
        String res = "L'area del tuo rettangolo è: ";
        String cm = " cm quadrati";
        return res + a + cm;
    }

    public  String doppioRettangolo (int b1, int a1, int b2, int a2){
        int per1 = (b1 + a1) * 2;
        int per2 = (a2 + b2) * 2;
        int ar1 = (a1*b1);
        int ar2 = (b2*a2);
        int sumP = per1 + per2;
        int sumA = ar1 + ar2;

        String one = "La prima area è: ";
        String two = "Il pimo perimetro è: ";
        String three = "La seconda area è: ";
        String four = "Il secondo perimetro è: ";
        String five = "La somma delle tue aree è: ";
        String six = "La somma dei tuoi perimetri è ";


        System.out.println(one + ar1);
        System.out.println(two + per1);
        System.out.println(three + ar2);
        System.out.println(four + per2);
        System.out.println(five + sumA);
        System.out.println(six + sumP);

        return "operazione eseguita con successo";
    }
}
