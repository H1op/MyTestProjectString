class BlockTest2  {
    public static void main(String args [ ] )  {
        int x, y;

        y = 20;

        // целевой модуль этого цикла - блок
        for (x = 0; x<10; x++)  {
            System.out.println("Значение x: " + x);
            System.out.println("Значение x: " + y);
            y = y - 2;
        }
    }
}