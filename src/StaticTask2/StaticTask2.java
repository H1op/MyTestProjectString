package StaticTask2;

public class StaticTask2 {
    {
        System.out.println("Logic1 id=" + this.id);
    }

    static {
        System.out.println("static logic");
    }
    private int id = 6;
    public int getId() {
        return id;
    }

    {
        System.out.println("logic2 id=" + getId());
    }

    public StaticTask2(int id) {
        this.id = id;
        System.out.println("конструктор id=" + id);
    }
}
