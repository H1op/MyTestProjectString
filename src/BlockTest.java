class BlockTest   {
    public static void main(String[] args) {
        int x, y;

        y = 20;

        // целевой модуль этого цикла - блок
        for (x = 0; x<10; x++)  {
            System.out.println("Знaчeниe х: " + x);
            System.out.println("Знaчeниe у: " + y);
            y = y - 2;
        }
    }
}


