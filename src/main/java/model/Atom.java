package model;

public class Atom {
    private String word;
    private Long number;
    private AtomType type;


    public Atom(String word) {
        this.word = word;
        this.number = null;
        this.type = AtomType.Word;
    }

    public Atom(Long number) {
        this.word = null;
        this.number = number;
        this.type = AtomType.Number;
    }
    public Atom(int number) {
        this.word = null;
        this.number = (long) number;
        this.type = AtomType.Number;
    }

    public Long getNumber() {
        if (type == AtomType.Number) {
        return number;
        } else {
            return 0L;
        }
    }

    public void setNumber(Long number) {
        if (this.type != AtomType.Word) {
            this.type = AtomType.Number;
            this.number = number;
        }
    }

    public void setNumber(int number) {
        if (this.type != AtomType.Word) {
            this.type = AtomType.Number;
            this.number = (long) number;
        }
    }

    public String getWord() {
        if (this.type == AtomType.Word) {
        return word;
        } else {
            return number.toString();
        }
    }

    public void setWord(String word) {
        if (this.type != AtomType.Number) {
            this.type = AtomType.Word;
            this.word = word;
        }
    }

    public AtomType getType() {
        return this.type;
    }

}
