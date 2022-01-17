public class Apple extends Fruit {
    Apple() {
        System.out.println("Apple");
    }

    Apple(String msg) {
        System.out.println("Apple with msg");
    }

    public static void main(String[] args) {
        Apple apl = new Apple("for health");
        apl.call();
        
    }
    public void call(){
        System.out.println("apl method to call");
    }
}

class Fruit {
    Fruit() {
        System.out.println("Fruit");
    }

    Fruit(String msg) {
        System.out.println("Fruit with msg");
    }
}
