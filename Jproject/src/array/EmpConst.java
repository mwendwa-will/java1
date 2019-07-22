package array;

public class EmpConst {
String fname,sname,email;
String phone;
    int duration;
double salary;

    public EmpConst(String fname, String sname, String email, String phone, int duration, double salary) {
        this.fname = fname;
        this.sname = sname;
        this.email = email;
        this.phone=phone;
        this.duration = duration;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return fname+sname+email+phone+duration+salary;
    }
}
