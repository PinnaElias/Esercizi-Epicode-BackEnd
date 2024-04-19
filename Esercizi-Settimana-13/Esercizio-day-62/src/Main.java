import java.util.Scanner;

    public class Main {
        public static void main(String[] args) {

            rettangolo ret = new rettangolo();
            Scanner scan = new Scanner(System.in);
            int b = scan.nextInt();
            int a = scan.nextInt();
            System.out.println(ret.perimetro(b,a));
            System.out.println(ret.area(b,a));
            int c = scan.nextInt();
            int d = scan.nextInt();
            System.out.println(ret.doppioRettangolo(b,a,c,d));

            String num = "079 321 4200";
            SIM sim = new SIM(num);
            sim.print(num);
        }
    }
