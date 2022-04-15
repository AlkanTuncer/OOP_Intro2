package day034_OOPMiniTekrar1504;

public class MainApp {
    public static void main(String[] args) {

        Personel p1 = new Personel();

        System.out.println("Adı-Soyadı : " + p1.getAdSoyad());
        System.out.println("Maaş : " + p1.getMaas());

        p1.setAdSoyad("İsmet Durmuş");
        p1.setSicilNo("00005");
        p1.setMaas(5400.53);
        p1.basla();
        p1.molaVer();
        p1.bitir();

        System.out.println("Adı-Soyadı : " + p1.getAdSoyad());
        System.out.println("Maaş : " + p1.getMaas());

        Personel p53 = new Personel("Alkan Tuncer", "00053", 5353.53);

        new Personel();
        System.out.println();

        Mudur mudur=new Mudur();      // İki mesaj alırız. Çünkü Mudur sınıfının ata sınıfı olan Personel'in parametresiz constructor'ıda çalışır.

        Mudur m1=new Mudur("AT","53",53.53,"Görev53",true,53);


        System.out.println();

        // ŞEKİL3B

        Sekil3B sekil1=new Sekil3B(10,5,4);
        Kutu kutu1=new Kutu();

        System.out.println(sekil1);

        Kutu kutu2=new Kutu(12,10,30,"Siyah",10);
        System.out.println(kutu2);


    }
}