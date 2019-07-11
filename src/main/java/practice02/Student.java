package practice02;

public class Student extends Person{
    private int klass;


    public Student(String name, int age) {
        super(name, age);
    }

    @Override
    public String introduce(){
        return super.introduce();
    }


    public int getKlass() {
        return klass;
    }

    public void setKlass(int klass) {
        this.klass = klass;
    }
}
