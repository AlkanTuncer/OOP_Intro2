package day030_1104;

public class Araba {  // Nesneyi temsil eden bir çizim gibi düşün. Hafızada yer tutmaz. Ne zaman new operatörü ile MainApp içinde oluşturursak nesne hayata geçer.

    private String renk;
    private String marka;
    private String model;
    private int modelYili;
    private double silindirHacmi;




    public int getModelYili(){
        return this.modelYili;
    }

    public void setModelYili(int modelYili){
        if (modelYili>0){
            this.modelYili=modelYili;
        }
    }


}
