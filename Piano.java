package Instrument;

public class Piano extends Instrument {
    String pianoType;

    public String getPianoType() {
        return this.pianoType;
    }

    public void setPianoType(String pianoType) {
        this.pianoType = pianoType;
    }

    public Piano() {
        super();
        pianoType = "";
    }
    public Piano(String name, double price,String pianoType) {
        super(name,price);
            this.pianoType = pianoType;
       
    }

    public void print() {
        super.print();
        System.out.println("PianoType : " + pianoType);
    }

}
