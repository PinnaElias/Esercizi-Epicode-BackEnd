import java.util.stream.Stream;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Stream.Builder<Product> products = Stream.builder();

        products.add(new Product("book", "Ordeal_By_Innocence", 90.0));
        products.add(new Product("book", "Death_On_The_Nile", 110.0));
        products.add(new Product("book", "And_There_were_None", 200.0));
        products.add(new Product("book", "4.50_From_Paddington", 75.0));
        products.add(new Product("book", "Murder_On_The_Orient_Express", 190.0));
        products.add(new Product("book", "Evil_Under_The_Sun", 80.0));


        Stream<Product> builder = products.build();
        builder.forEach(System.out::println);

    }
}
