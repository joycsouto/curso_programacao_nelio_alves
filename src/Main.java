import java.util.Locale;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Olá mundo!");
        System.out.println(1+1 );
        double value = 10.35784;
        System.out.println(value);
        System.out.format("%.2f%n", value);
        System.out.format(Locale.US,"%.4f%n", value);
        System.out.println("RESULT" + value);

        int age = 18;
        String name = "Joyce";
        double salary = 1697.7;
        String profession = "Atendente";
        System.out.printf("meu nome é %s tenho %d e ganho %.2f e sou %s",name,age,salary,profession);

    }
}