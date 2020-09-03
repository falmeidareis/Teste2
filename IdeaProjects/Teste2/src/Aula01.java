public class Aula01 {

    public static void main(String[] args) {

        System.out.println("Q1)\n" +
                "B\n" +
                "\n" +
                "Q2)\n" +
                "MOVER DISCO 1 PARA BASE C\n" +
                "MOVER DISCO 2 PARA BASE B\n" +
                "MOVER DISCO 1 PARA BASE B\n" +
                "MOVER DISCO 3 PARA BASE C\n" +
                "MOVER DISCO 1 PARA BASE A\n" +
                "MOVER DISCO 2 PARA BASE C\n" +
                "MOVER DISCO 1 PARA BASE C\n" +
                "\n" +
                "Q3)\n" +
                "(X) 4you\n" +
                "(X) 23\n" +
                "(X) String\n" +
                "(X) double\n" +
                "(X) nome+sobrenome\n" +
                "\n" +
                "Q4)\n" +
                "a) INT\n" +
                "b) DOUBLE\n" +
                "c) INT\n" +
                "d) DOUBLE\n" +
                "e) STRING\n" +
                "f) STRING\n" +
                "\n" +
                "Q5)");

        double AreaLosango, D, d;

        D = 6.82;
        d = 3.41;
        AreaLosango = D*d*0.5;

        System.out.printf("%.2f",AreaLosango);
        System.out.println("");
        System.out.println(AreaLosango);
        System.out.println("");

        int p1,p2,p3,p4;
        double n1,n2,n3,n4,MediaPonderada;

        p1=2;
        p2=2;
        p3=3;
        p4=3;

        n1=6.5;
        n2=7.8;
        n3=8;
        n4=7.1;

        MediaPonderada=(n1*p1+n2*p2+n3*p3+n4*p4)/(p1+p2+p3+p4);

        System.out.println("Q6)");
        System.out.printf("%.2f",MediaPonderada);
        System.out.println("");
        System.out.println("");

        double r,PerimetroCirculo,AreaCirculo;

        r=6.5;
        PerimetroCirculo=2*Math.PI*r;
        AreaCirculo=Math.PI*Math.pow(r,2);

        System.out.println("Q7)\n"+"a) "+PerimetroCirculo);
        System.out.println("b) "+AreaCirculo);
        System.out.println("");

        double Distancia,Minutos,Segundos,Velocidade;

        Distancia=15;
        Minutos=50;
        Segundos=30;

        Velocidade=Distancia/((Minutos/60+Segundos/3600)*1.6);

        System.out.println("Q8)");
        System.out.println(Velocidade);
        System.out.println("");

        double a,b,c,x1,x2;

        a=2;
        b=4;
        c=-6;

        x1= (-b+Math.sqrt(Math.pow(b,2)-4*a*c))/(2*a);
        x2= (-b-Math.sqrt(Math.pow(b,2)-4*a*c))/(2*a);

        System.out.println("Q9)\n"+"a) x="+x1);
        System.out.println("b) x="+x2);


    }

}
