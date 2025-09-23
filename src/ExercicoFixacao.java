import java.util.Locale;

public class ExercicoFixacao {
    public static void main(String[] args) {
        String product1 ="Computer";
        String product2 ="Office Desk";

        int age =30;
        int code =5290;
        char gender = 'F';

        double price1 = 2100.0;
        double price2 = 650.5;
        double measure = 53.234567;

        System.out.printf("" +
                "Products:%n" +
                "%s, which price is %.2f%n" +
                "%s, which price is %.2f%n" +
                "" +
                "Record: 30 years old, code %d and gender: %s%n" +
                "" +
                "Measue with eight decimal places : %f%n" +
                "Rouded (three decimal places): %.3f%n", product1,price1,product2,price2,code,gender,measure,measure
                );
        System.out.printf("US decimal point",Locale.US,"%.2f%n",measure);
    }
}