package Youtube.BahadirSevim.For;

import java.util.Scanner;

public class daxilOlanEdedinCutluyu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1 ci ededi daxil edin: ");
        int say1 = sc.nextInt();
        System.out.println("2 ci ededi daxil edin: ");
        int say2 = sc.nextInt();
        for (int i = say1; i <= say2; i++) {
            if (i % 2 == 0){
                System.out.println("cut ededler: " + i);
                System.out.println("-------------------");
            }else if (i%2==1){// i%2!=0 kimide yaza bilerik
                System.out.println("tek ededler: "+i);
                System.out.println("------------------");
            }


        }
    }
}