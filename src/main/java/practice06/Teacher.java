package practice06;

public class Teacher extends Person{
    private int klass;

    public Teacher(String name, int age) {
        super(name, age);
    }
    public Teacher(String name, int age, int klass) {
        super(name, age);
        this.klass = klass;
    }

    @Override
    public String introduce(){
        String last = klass == 0 ? " I teach No Class." : String.format(" I teach Class %d.",klass);
        return String.format("%s I am a Teacher.%s",super.introduce(),last);
    }

    public int getKlass() {
        return klass;
    }

    public void setKlass(int klass) {
        this.klass = klass;
    }
}
