package Youtube.BahadirSevim.For;

import java.util.Scanner;

public class ForOnededinCeminiToplayanProje {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
                int cemi =0;// bu bizm butun ededlerin cemini saxlayan deyisendir
                int eded;//Scanner ile yazacagimiz ededlerin tipini ve referansini teyin edirik
                for(int j=0; j<10;j++){ // burada bir loop(dongu) yaradiriq ki asagida yazdigimiz kodu 10 defe
                    // cagira bilek
                    System.out.println((j+1)+". bir eded yazin: ");
                    eded=sc.nextInt();//yuxarida teyin edtdiyimiz "eded" deyisenini deyerini istifadeciden isteyirik
                    cemi+= eded;// bu (cemi=cemi+eded) yeni biz herdefe bir eded yazdiqda "cemi" deyiseninin icine
                    // elave olunsun
                }
                System.out.println("cemi: "+cemi);

    }
}
