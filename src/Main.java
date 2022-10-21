import java.util.Scanner;

public class Main {
    public static final int CONV=1852;
        public static void main(String[] args) {
            // version 1.0
            double millas, metros;
            Scanner obxScaner = new Scanner(System.in);
            System.out.println("Teclea millas");
            millas = obxScaner.nextDouble(); //leer o meter al objetco scanner

            metros = millas * CONV;

            System.out.println(millas + "millas son" + metros + "metros");
        }
}