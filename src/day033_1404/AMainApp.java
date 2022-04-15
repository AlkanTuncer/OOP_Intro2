package day033_1404;

import java.util.Scanner;

public class AMainApp {
    public static void main(String[] args) {

        Kare kare1=new Kare(5);
        kare1.bilgiGoster();
        kare1.ciz();

        System.out.println();

        Dikdortgen dikdortgen1=new Dikdortgen(5,10);
        dikdortgen1.bilgiGoster();
        System.out.println();
        dikdortgen1.ciz();


        // Bir ata sınıf, kendisinden türetilmiş alt sınıf örneklerine referans olabilir.
        // Şeklini bilmediğimiz durumlarda böle tanımlamalara ihtiyaç olabilir. Aşağıdaki Scannerla yaptıgımız örnekteki gibi mesela.

        Kare kare=new Kare(4);

        Object obj=new Kare(5);   // obj. yapınca Kare sınıfındaki metotlarımızı göremeyiz. getKenar,alanHesapla gibi bunlara erişemeyiz.

        Sekil sekil=new Kare(3);  // sekil. yapınca ise o Kare nesnesinin sadece Şekil sınıfındaki alanHesapla, cevreHesapla, ciz metotlarına erişiriz.



        Scanner input=new Scanner(System.in);

        System.out.println("Geometrik Şekiller");
        System.out.println("1. Kare");
        System.out.println("2. Dikdörtgen");
        System.out.println("3. Daire");
        System.out.print("Seçim : ");
        int secim=input.nextInt();

        Sekil sekil53=null;

        switch (secim){
            case 1:
                System.out.print("Kenar : ");
                sekil53=new Kare(input.nextDouble());
                break;
            case 2:
                System.out.print("Genişlik : ");
                double genislik=input.nextDouble();
                System.out.print("Yükseklik : ");
                double yukseklik=input.nextDouble();
                sekil53=new Dikdortgen(yukseklik,genislik);
                break;
            case 3:
                System.out.print("Yarıçap : ");
                sekil53=new Daire(input.nextDouble());
                break;
            default:
                break;
        }

        sekil53.ciz();
        System.out.println(sekil53);
        System.out.println(sekil53.toString());


    }
}
