package day032;

public class Point3D extends Point{      // extends --> keyword'u ile ata sınıfından bilgileri buraya alıyoruz.
                                         // oluşturdugumuz Point classını kalıtım yoluyla buraya atadık.
    private int z;

    public Point3D(int x, int y, int z){
        super(x,y);                          // super --> keyword'u Ata sınıfın Constructor'ını çağırdı.
        this.z=z;                            // Point class'ındaki parametreli constructor'ı buraya cagırdık. x ve y ordan geldi.
    }

    public Point3D(){
    }

    public int getZ() {
        return z;
    }
    public void setZ(int z) {
        this.z = z;
    }
}
