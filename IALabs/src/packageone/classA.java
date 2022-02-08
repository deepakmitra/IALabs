package packageone;
//default accress spcifier is package level

class cl1
{
    int x;
    int y;

    @Override
    public String toString() {
        return "cl1{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}

class info
{
    private int roll;
    private String name;

    public void readata(int roll, String name)
    {
        //this is a reference refering to the current object
        this.roll=roll;
        this.name=name;
    }

    @Override
    public String toString() {
        return "info{" +
                "roll=" + roll +
                ", name='" + name + '\'' +
                '}';
    }
}
public class classA {
    public static void show()
    {
        System.out.println("\n welcome to Java");
    }
    public static void main(String[] args) {
        info ob=new info();
        ob.readata(1, "abcd");
        System.out.println(ob.toString());

        cl1 obj=new cl1();
        obj.x=10;
        obj.y=20;
        System.out.println(obj.toString());
    }
}
