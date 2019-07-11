package practice07;

public class Teacher extends Person{
    private Klass klass;

    public Teacher(String name, int age) {
        super(name, age);
    }
    public Teacher(String name, int age, Klass klass) {
        super(name, age);
        this.klass = klass;
    }

    @Override
    public String introduce(){
        String last = klass == null ? " I teach No Class." : String.format(" I teach Class %d.",klass.getNumber());
        return String.format("%s I am a Teacher.%s",super.introduce(),last);
        // My name is Tom. I am 21 years old. I am a Teacher. I teach Class 2.
    }

    public String introduceWith(Student student){
        String last = student.getKlass().getNumber() == getKlass().getNumber() ? String.format("I teach %s.",student.getName()) : String.format("I don't teach %s.",student.getName());
        return String.format("%s I am a Teacher. %s",super.introduce(),last);
    }

    public Klass getKlass() {
        return klass;
    }

    public void setKlass(Klass klass) {
        this.klass = klass;
    }
}
