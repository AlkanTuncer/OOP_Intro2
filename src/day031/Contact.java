package day031;

import java.util.Scanner;

public class Contact {

    private String name;              // name -> Member/Instant Variable denir. Initialize edilmek zorunda değiller.
    private String phoneNumber;
    private String emailAddress;

    public Contact(String name,String phoneNumber,String emailAddress){
        this.name=name;
        this.phoneNumber=phoneNumber;
        this.emailAddress=emailAddress;
    }

    public Contact(){

    }


    public void setName(String name){   // set --> Okuma - Read
        this.name=name;
    }
    public String getName() {           // get --> Yazma - Write
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmailAddress() {
        return emailAddress;
    }
    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    // NESNENİN DAVRANIŞLARI
    public void sendSMS(){
        System.out.println(this.phoneNumber+" numarasına SMS gönderiliyor.");
    }
    public void sendEmail(){
        System.out.println(this.emailAddress+" adresine E-Mail gönderiliyor.");
    }
    public void call(){
        System.out.println(this.name+" isimli kişi aranıyor.");
    }


    public void showInfo(){
        System.out.println(this.getName());
        System.out.println(this.getPhoneNumber());
        System.out.println(this.getEmailAddress());
    }


    public void inputFromKeyboard(){
        Scanner input=new Scanner(System.in);

        System.out.print("İsim : ");
        this.setName(input.nextLine());
        System.out.print("E-Mail Adresi : ");
        this.setEmailAddress(input.nextLine());
        System.out.print("Telefon No : ");
        this.setPhoneNumber(input.nextLine());
    }

}
