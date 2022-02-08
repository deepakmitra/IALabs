package IAlabs1;

class author
{
    private String fname;
    private String lname;

    public author() {
    }

    public author(String fname, String lname) {
        this.fname = fname;
        this.lname = lname;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    @Override
    public String toString() {
        return "author{" +
                "fname='" + fname + '\'' +
                ", lname='" + lname + '\'' +
                '}';
    }
}
public class demo {
    public static void main(String[] args) {
        author a=new author("abc", "def");
        System.out.println(a.toString());
    }
}
