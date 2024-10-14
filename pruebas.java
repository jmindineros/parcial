import java.util.Scanner;
public class pruebas {

    public static void main(String[] args) {
            Scanner sc = new Scanner (System.in);
                
        int n = 0;
        Double num;
        Double max;

        System.out.println("la cantidad de numeros");
        n=sc.nextInt();
        System.out.println("escriba el numero");
        num=sc.nextDouble();
        max=num;

        for (int i = 1; i < n; i++){

            System.out.println("ingrese el numero");
            num=sc.nextDouble();
            if(num>max){
                max=num;
            }
            
        }
        System.out.println(max);



    }
}