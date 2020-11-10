package bang;

public class Student {
    private int a = 111;
    public static int b = 111;
    protected String name ;
    public static String ccollege="BBDIT";
    static void change(){
        ccollege="CODEGYM";

    }
    void display(){
        System.out.println( " "+name+ " " + ccollege);
    }
}
