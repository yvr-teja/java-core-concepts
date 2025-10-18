package constructor;

class Contructor {
    int x;
    Contructor()
    {
        x=5;
    }

    public static void main(String[] args) {
        Contructor contructor =new Contructor();
        System.out.println(contructor.x);
    }
}
