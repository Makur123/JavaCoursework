// Driver Class
class Geeks {
  int a;
  int b;
  float d;
  int e;
    // Constructor
    Geeks()
    {
        System.out.println("Constructor Called");
    }

    // Constructor
    Geeks(int a, int b)
    {
        this.a = a;
        this.b = b;
    }
    Geeks(int a, int b,float d,int e)
    {
        this.a = a;
        this.b = b;
        this.d = d;
        this.e = e;
    }
    void print(){
        System.out.println(a + "\t" + b + "\t" + d + "\t" + e);
    }

    // main function
    public static void main(String[] args)
    {
        Geeks cons2 = new Geeks(10,20,(float) 20.3,30);
        cons2.print();
        Geeks cons = new Geeks(40,90);
        cons.print();
    }
}

