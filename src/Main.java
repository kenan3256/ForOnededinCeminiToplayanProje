import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Scanner sc=new Scanner (System.in);

        int i =0;
        int eded;
        for(int j=0; j<10;j++){
            System.out.println((j+1)+". bir eded yazin: ");
            eded=sc.nextInt();
            i+= eded;

        }
        System.out.println("cemi: "+i);



    }
}