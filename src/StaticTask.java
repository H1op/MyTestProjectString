public class StaticTask {
        public static void main(String[] args) {
            A b = new B();
        }

        public static class A{
            public A(){
                System.out.println("Constructor A");
            }

            static {
                System.out.println("Static block A");
            }

            {
                System.out.println("Code Block A");
            }
        }

        public static class B extends A{
            public B(){
                System.out.println("Constructor B");
            }

            static {
                System.out.println("Static block B");
            }

            {
                System.out.println("Code Block B");
            }

        }
    }

