package practice07;

public class Klass {
    private int number;
    private String displayName="Class 2";
    public Klass(int number) {
        this.number = number;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName(){
        return displayName;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
