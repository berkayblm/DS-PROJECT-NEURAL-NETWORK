public class Flower {

    private int	calyculusLength; // çanak yaprak uzunluğu
    private int calyculusWidth;  // çanak yaprak genişliği
    private int petalLength;    // taç yaprak uzunluğu
    private int petalWidth;    // taç yaprak genişliği

    public Flower(int calyculusLength, int calyculusWidth, int petalLength, int petalWidth) {
        this.calyculusLength = calyculusLength;
        this.calyculusWidth = calyculusWidth;
        this.petalLength = petalLength;
        this.petalWidth = petalWidth;
    }

    public Flower() {
    }

    public int getCalyculusLength() {
        return calyculusLength;
    }

    public void setCalyculusLength(int calyculusLength) {
        this.calyculusLength = calyculusLength;
    }

    public int getCalyculusWidth() {
        return calyculusWidth;
    }

    public void setCalyculusWidth(int calyculusWidth) {
        this.calyculusWidth = calyculusWidth;
    }

    public int getPetalLength() {
        return petalLength;
    }

    public void setPetalLength(int petalLength) {
        this.petalLength = petalLength;
    }

    public int getPetalWidth() {
        return petalWidth;
    }

    public void setPetalWidth(int petalWidth) {
        this.petalWidth = petalWidth;
    }

    @Override
    public String toString() {
        return "Flower{" +
                "calyculusLength=" + calyculusLength +
                ", calyculusWidth=" + calyculusWidth +
                ", petalLength=" + petalLength +
                ", petalWidth=" + petalWidth +
                '}';
    }
}


