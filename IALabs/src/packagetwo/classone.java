package packagetwo;
import packageone.*;

public class classone {
    public static void main(String[] args) {
        //info o1=new info(); error because its not declared public
        mymethods ob=new mymethods(1, "abc");
        System.out.println(ob.toString());

        classA.show();

        classB.main(new String[]{"abc", "def"});

        classB.main();

    }
}
