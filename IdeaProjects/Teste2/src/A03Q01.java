
import java.util.Scanner;
import java.lang.invoke.SwitchPoint;

public class A03Q01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double Numero01,Numero02;
        int Operacao;

        System.out.println("Pressione o primeiro número da operação");
        Numero01 = scan.nextDouble();

        System.out.println("Pressione o segundo número da operação");
        Numero02 = scan.nextDouble();

        System.out.println("Digite o código da Operação");
        System.out.println("\n" +
                "1 para operação SOMA\n" +
                "\n" +
                "2 para operação SUBTRAÇÃO\n" +
                "\n" +
                "3 para operação MULTIPLICAÇÃO\n" +
                "\n" +
                "4 para operação DIVISÃO");

        Operacao = scan.nextInt();

        switch(Operacao){
            case 1:
        }




        System.out.println(Numero01);
        System.out.println(Numero02);
        System.out.println(Operacao);

    }


}
