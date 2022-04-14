package day032;

public class AaMainApp {
    public static void main(String[] args) {

        // Task.txt 1 from TasksFile
        Point p1=new Point(5,7);

        Point p2=new Point();
        p2.setX(3);
        p2.setY(11);

        p1.setX(8);  // Burada set ile x değerini değiştirebiliriz. Parametresiz constructor'ı bu yüzden tanımlarız.
                     // Farklı bir nesne oluşturmak yerine set ile atamak daha uygun.

        Point p3=new Point(); // p3 nesnesine değer atamadan Point classında parametresiz constructor'a this(..,..) ile değer atadık.

        System.out.println("("+p1.getX()+","+p1.getY()+")");
        System.out.println("("+p2.getX()+","+p2.getY()+")");
        System.out.println("("+p3.getX()+","+p3.getY()+")");


        Point[] noktalar=new Point[100];   // İçerisi null olan 100 farklı nokta oluşturuldu. (null,null)
        for (int i = 0; i < 100; i++) {
            noktalar[i]=new Point();
        }


        Point3D p9=new Point3D(3,5,9);

        System.out.println();

        // HAYVAN NESNESİ

        Hayvan hy1=new Hayvan();
        Hayvan hy2=new Hayvan(10,45.3,"Aslan");
        System.out.println();
        Hayvan hy3=new Hayvan("Köpek");

        System.out.println();

        HayvanAslan asl1=new HayvanAslan();   // Ata sınıfı olan Hayvan sınıfının boş constructor'ı ilk calışır. 

    }
}
