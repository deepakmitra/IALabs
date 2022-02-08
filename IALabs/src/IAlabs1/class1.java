package IAlabs1;

class sample
{
    private int x;

    public void setx(int tx)
    {
        x=tx;
    }
    public int getx()
    {
        return(x);
    }
}

public class class1 {
    public static sample modify(sample tob)
    {
        System.out.println("\n Hashcode of tob =" + tob.hashCode());
        tob.setx(300);

        sample ob=new sample();
        System.out.println("\n Hasjcode of ob inside modify : " + ob.hashCode());
        ob.setx(1000);
        return(ob);

    }
    public static void main(String[] args) {
        sample ob=new sample();
        ob.setx(10);
        System.out.println("\n ob x = " + ob.getx());

        sample ob2=ob; //shallow copy, ob2 is just a reference
        System.out.println("\n ob2 x = " + ob2.getx());

        System.out.println("\n Hashcode of ob =" + ob.hashCode());
        System.out.println("\n Hashcode of ob2 =" + ob2.hashCode());

        ob2.setx(100);
        System.out.println("\n ob x = " + ob.getx());
        System.out.println("\n ob2 x = " + ob2.getx());

        sample ob3=new sample(); //ob is an object
        System.out.println("\n Hashcode of ob =" + ob.hashCode());
        System.out.println("\n Hashcode of ob3 =" + ob3.hashCode());
        ob3=ob;
        System.out.println("\n Hashcode of ob =" + ob.hashCode());
        System.out.println("\n Hashcode of ob3 =" + ob3.hashCode());
        System.out.println("\n ob x = " + ob.getx());
        System.out.println("\n ob3 x = " + ob3.getx());

        ob3.setx(200);
        System.out.println("\n Hashcode of ob =" + ob.hashCode());
        System.out.println("\n Hashcode of ob3 =" + ob3.hashCode());
        System.out.println("\n ob x = " + ob.getx());
        System.out.println("\n ob3 x = " + ob3.getx());

        sample ob4=modify(ob);
        System.out.println("\n Hashcode of ob =" + ob.hashCode());
        System.out.println("\n ob x = " + ob.getx());
        System.out.println("\n Hashcode of ob4 =" + ob4.hashCode());
        System.out.println("\n ob4 x =" + ob4.getx());

        int x=25; //value type
        Object o=new Object();
        o=x; // value type is converted to reference type (Boxing)
        System.out.println("\n x = " +x);
        System.out.println("\n o = " + o);

        int y=(int)o; //converting referencetype to value type (Unboxing)
        System.out.println("\n y = " +y);
        System.out.println("\n o = " + o);
    }
}
