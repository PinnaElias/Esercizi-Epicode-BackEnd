public class es1 {

    public Boolean stringaPD (String PD) {

        if (PD.length() % 2 == 0) {
            System.out.println("è divisibile per 2: ");
            return true;
        }   else {
            System.out.println("è divisibile per 2: ");
            return false;
        }
    }

    public boolean annoBisestile (int year){
        if ((year % 4 == 0) || (year % 400 == 0)) {
            System.out.println("Anno bisestile:");
            return true;
        } else {
            System.out.println("Anno bisestile:");
            return false;
        }
    }
}
