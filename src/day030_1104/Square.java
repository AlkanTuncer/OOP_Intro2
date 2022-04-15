package day030_1104;

public class Square {

    private int sideLength;

    public int getSideLength() {
        return sideLength;
    }

    public void setSideLength(int sideLength) {
        this.sideLength = sideLength;
    }

    // ÇEVRE HESABI İÇİN
    public int countPerimeter(){
        return 4*sideLength;
    }

    // ALAN HESABI İÇİN
    public int countArea(){
        return sideLength*sideLength;
    }

    public void showInfos(){
        System.out.println("Alan = "+this.countArea());
        System.out.println("Çevre = "+countPerimeter());
    }

}
