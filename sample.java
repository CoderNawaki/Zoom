public class sample{
    public static void main(String[] args) {
        Parent parent = new Parent();
        Child child = new Child();

        Parent.message="messageA";
        Child.message="messageB";

        parent.disp();
        child.disp();
    }
}
class Parent{
    static String message;

    public void disp(){
        System.out.println("Parent"+message);
    }
}
class Child extends Parent{
    public  void disp(){
        System.out.println("child"+message);
    }

    @Override
    public String toString() {
        return "Child []"+message;
    }

   
}