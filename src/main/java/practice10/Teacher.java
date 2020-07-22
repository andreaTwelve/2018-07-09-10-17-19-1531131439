package practice10;

import practice09.Student;

import java.util.LinkedList;

public class Teacher extends Person {
    private LinkedList<Klass> classes = new LinkedList<>();

    public LinkedList<Klass> getClasses() {
        return classes;
    }

    public void setClasses(LinkedList<Klass> classes) {
        this.classes = classes;
    }

    public Teacher(int id, String name, int age) {
        super(id, name, age);
    }

    public Teacher(int id, String name, int age, LinkedList<Klass> classes) {
        super(id, name, age);
        this.classes = classes;
    }

    public String introduce() {
        String str = super.introduce().concat(" I am a Teacher. I teach ");
        if (this.classes.size() > 0) {
            str += "Class";
            for (Klass klass: this.classes) {
                //System.out.println(klass.getNumber());
                if (klass.equals(this.classes.getLast())) {
                    str += " " + klass.getNumber() + ".";
                } else {
                    str += " " + klass.getNumber() + ",";
                }
                //str.concat(String.format("%s", klass.getNumber()));
            }
        } else {
            str += "No Class.";
        }
        return str;
    }

    public String introduceWith(practice10.Student student){
        if (this.classes.size() > 0) {
            for (Klass klass: this.classes) {
                if (student.getKlass().getNumber() == klass.getNumber()) {
                    return super.introduce().concat(String.format(" I am a Teacher. I teach %s.", student.getName()));
                } else {
                    return super.introduce().concat(String.format(" I am a Teacher. I don't teach %s.", student.getName()));
                }
            }
        }
        return null;
    }

    public boolean isTeaching(practice10.Student student) {
        if (this.classes.size() > 0) {
            for (Klass klass: this.classes) {
                if (student.getKlass().getNumber() == klass.getNumber()) {
                    return true;
                } else {
                    return false;
                }
            }
        }
        return false;
    }
}
