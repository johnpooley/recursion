package model;

public class Atom {
    private String word;
    private Long number;
    private AtomType type;


    public Atom(String word) {
        this.word = word;
        this.number = null;
        this.type = AtomType.WORD;
    }

    public Atom(Long number) {
        this.word = null;
        this.number = number;
        this.type = AtomType.NUMBER;
    }
    public Atom(int number) {
        this.word = null;
        this.number = (long) number;
        this.type = AtomType.NUMBER;
    }

    public Long getNumber() {
        if (type == AtomType.NUMBER) {
        return number;
        }
        return 0L;
    }

    public void setNumber(Long number) {
        if (this.type != AtomType.WORD) {
            this.type = AtomType.NUMBER;
            this.number = number;
        }
    }

    public void setNumber(int number) {
        if (this.type != AtomType.WORD) {
            this.type = AtomType.NUMBER;
            this.number = (long) number;
        }
    }

    public String getWord() {
        if (this.type == AtomType.WORD) {
        return word;
        }
        return number.toString();
    }

    public void setWord(String word) {
        if (this.type != AtomType.NUMBER) {
            this.type = AtomType.WORD;
            this.word = word;
        }
    }

    public AtomType getType() {
        return this.type;
    }

}
