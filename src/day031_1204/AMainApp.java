package day031_1204;

import java.util.Scanner;

public class AMainApp {
    public static void main(String[] args) {

        // CONSTRUCTOR : Kurucu Metot
        // Parametresi olmayan kurucu metot varsayılan olarak vardır. Örn: Contact()
        // Kendi parametrelerimizi tanımladık. Contact class'ında. Contact () kayboldu yazdıgımız geçerli oldu.
        // iki metot overload edilirse ikiside kullanılabilir.

        Contact kisi2=new Contact();
        kisi2.setName("Alkan Tuncer");
        kisi2.setPhoneNumber("+905535305353");
        kisi2.setEmailAddress("lazkopat53@hotmail.com");

        Contact kisi=new Contact("Dante Jugking","535353","jugking53@hotmail.com");  // Contact() --> Constructor

        System.out.println(kisi.getName());
        System.out.println(kisi.getPhoneNumber());
        System.out.println(kisi.getEmailAddress());
        System.out.println();

        kisi.sendSMS();
        kisi.sendEmail();
        kisi.call();

        System.out.println();

        new Contact("Kylian Mbappe","07","mbappe07@gmail.com");
     // Bu nesnenin referansı yok. Tanımlanmış bir değişken yok. Hafızada oluşur ama sonrasında erişim yapamayız bir işlem yapılmaz.
     // En sondaki ; silip . yazarsak nesnenin özelliklerine ve davranışlarına erişebiliriz.
        new Contact("Övünç Demir","05585805858","ironpride@windowslive.com").sendEmail();


        // Klavyeden girdi alıp SET ve GET ile nesnemize tanımlayıp yazdırabiliriz.
        Scanner input=new Scanner(System.in);

        Contact kisi53=new Contact();

        System.out.print("İsim : ");
        kisi53.setName(input.nextLine());
        System.out.print("E-Mail Adresi : ");
        kisi53.setEmailAddress(input.nextLine());
        System.out.print("Telefon No : ");
        kisi53.setPhoneNumber(input.nextLine());

        System.out.println(kisi53.getName());
        System.out.println(kisi53.getPhoneNumber());
        System.out.println(kisi53.getEmailAddress());

        kisi53.call();
        kisi53.sendEmail();
        kisi53.sendSMS();

        kisi53.showInfo();

        // Scanner'ı Contact nesnesine metot olarak tanımladık.
        Contact kisi99=new Contact();
        kisi99.inputFromKeyboard();
        kisi99.showInfo();
        kisi99.call();
    }
}
