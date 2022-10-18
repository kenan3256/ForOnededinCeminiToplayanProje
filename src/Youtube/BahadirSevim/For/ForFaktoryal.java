package Youtube.BahadirSevim.For;

import java.util.Scanner;

public class ForFaktoryal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ededi yaz;n: ");
        int deyer=sc.nextInt();
        int faktoryal=1;
        for(int i=1; i<=deyer; i++){

            faktoryal=faktoryal*i;

        }
        System.out.println("cavab=" +faktoryal);

    }
}
