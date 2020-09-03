package obj;

class Student{
    private int age;
    private String name;
    public Student(){}
    public Student(String name,int age){
        this.name=name;
        this.age=age;
    }
    public String toString(){
        return name+""+age;
    }
}

public class TestStudent {
    public static void main(String[] args) {
        Student tom = new Student("tom", 18);
        //System.out.println(tom+""+100);
        //System.out.println(100+""+tom);
        System.out.println(""+100+tom);
       // System.out.println(tom+100+""); 错误
    }
}
