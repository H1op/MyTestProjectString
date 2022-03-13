class Base {
    public static void go() {
        System.out.println("метод из Base");
    }
}

class Sub extends Base {
    public static void go() {
        System.out.println("метод из Sub");
    }
}

public class StaticObj {
    public static void main(String[] args) {
        Base ob = new Sub();
        ob.go();
        Base.go();
        Sub.go();
    }
}
