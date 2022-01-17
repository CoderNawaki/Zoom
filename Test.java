class Test {

    public static void main(String[] args) {
        Employee emp = new Sales();
        Sales sal = new Sales();

        emp.name="Jaava";
        sal.name="Duke";

        sal.func();
    emp.disp();
    }
}

class Employee {
    String name;

    public void func() {
        System.out.println("func");
    }

    public void disp() {
        System.out.println(name);
    }
}

class Sales extends Employee {
    public void disp() {
        System.out.println(name);
    }
}