import java.util.Scanner;

public class Main {
    public static void  main(String[] args) {
        int km , age , tripType;
        double amount , discount ,total=0,gdbi;
        Scanner input = new Scanner(System.in);
        System.out.print("Mesafeyi km türünden giriniz: ");
        km = input.nextInt();

        System.out.print("Yaşınızı Giriniz: ");
        age = input.nextInt();

        System.out.print("Yolculuk tipinizi giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ): ");
        tripType = input.nextInt();

        amount = km *0.10;

        if (km>0 && age>0 && (tripType ==1 || tripType==2)){
            if (age<12){
                if (tripType==1){
                    discount =amount * 0.50;
                    amount -= discount;
                    total = amount;

                } else if (tripType == 2) {
                    discount =amount * 0.50;
                    amount -= discount;
                    gdbi = amount * 0.20;
                    total =(amount -gdbi)*2;
                }
            }
            else if (age>=12 && age<=24){
                if (tripType==1){
                    discount =amount * 0.10;
                    amount -= discount;
                    total =amount;

                } else if (tripType == 2) {
                    discount =amount * 0.10;
                    amount -= discount;
                    gdbi = amount * 0.20;
                    total =(amount -gdbi)*2;
                }
            }
            else if (age>65){
                if (tripType==1){
                    discount =amount * 0.30;
                    amount -= discount;
                    total = amount;

                } else if (tripType == 2) {
                    discount =amount * 0.30;
                    amount -= discount;
                    gdbi = amount * 0.20;
                    total =(amount -gdbi)*2;
                }
            }
            else{
                total = amount;
            }
            System.out.println("Toplam tutar : " + total  + " TL");
        }
        else {
            System.out.println("Hatalı Veri Girdiniz !");
        }




    }
}
