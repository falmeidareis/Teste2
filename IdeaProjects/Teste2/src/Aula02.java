import java.util.Scanner;

public class Aula02 {
    public static void main(String[] args) {
    System.out.println("Insira a temperatura em ºF");
    Scanner scan = new Scanner(System.in);
    double TemperaturaFar,TemperaturaCel;

    TemperaturaFar = scan.nextDouble();
    TemperaturaCel = (TemperaturaFar-32)*(5.0/9);

        System.out.println(TemperaturaFar);
        System.out.println(TemperaturaCel);

    }


}
