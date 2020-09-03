package obj;

interface IA{
    void ma();
}
class MyClass implements IA{
    public void ma(){}
    public String toString(){
        return "MyClass toString()";
        }
}
public class TestMyclass {
    public static void main(String[] args) {
        IA ia = new MyClass();
        System.out.println(ia);
    }
}
