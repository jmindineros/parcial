import java.util.Scanner;

public class pruebas {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nombre;
        Double media;
        Double basic;
        Double pascal;
        Double fortran;
        System.out.println("ingrese su nombre ");
        nombre=sc.nextLine();
        while(nombre != "***"){
            System.out.println("ingrese nota de basic");
            basic=sc.nextDouble();
            System.out.println("ingrese nota de basic");
            pascal=sc.nextDouble();
            System.out.println("ingrese nota de basic");
            fortran=sc.nextDouble();
            media=(basic + pascal + fortran) / 3;
            System.out.println("el estudiante "+ nombre+" su nota es "+media );
            System.out.println("ingrese su nombre ");
            nombre=sc.nextLine();
        }

    }
}