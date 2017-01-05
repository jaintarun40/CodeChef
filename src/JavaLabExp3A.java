/**
 * Created by USER on 26-08-2016.
 */
class Abc
{
    void display()
    {
        System.out.println("Hello Abc");
    }
}
class Pqr extends Abc
{
    void display()
    {
        System.out.println("Hello Pqr");
    }

    public static void main(String[] args) {
        Abc a=new Abc();
        a.display();
        Abc b=new Pqr();
        b.display();
    }
}

