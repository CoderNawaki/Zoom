public class CaffeMocha extends Coffee {
    void addMilk(){
        System.out.println("CafeMocha");
    }
    public static void main(String[] args) {
        Coffee co = new Coffee();
        
        CaffeMocha cm = (CaffeMocha)co;
       
    }
}

class Coffee{
   
    void drip(){
        System.out.println("Coffee");
    }
}
