package lab;

public class base {
    abstract static class vehicle{
        int wheel;
        String  Companyname;
        String model;
        vehicle(String Companyname,String model){
            this.Companyname=Companyname;
            this.model=model;
        }
        abstract public  void wheel();
        abstract public void Companyname();
        abstract public void model();
    }
    static class car extends vehicle{
        int wheel=4;
        car( String Companyname, String engine) {
            super( Companyname, engine);
        }

        @Override
        public void wheel() {
            System.out.println("I have "+wheel+" wheels");
        }

        @Override
        public void Companyname() {
            System.out.println("I am "+Companyname);
        }

        @Override
        public void model() {
            System.out.println("My model is "+model);
        }
    }
    static class bike extends vehicle{
        int wheel=2;

        bike(String Companyname, String model) {
            super(Companyname, model);
        }

        @Override
        public void wheel() {
            System.out.println("I have "+wheel+" wheels");
        }

        @Override
        public void Companyname() {
            System.out.println("I am "+Companyname);
        }

        @Override
        public void model() {
            System.out.println("My model is "+ model);
        }
    }

    public static void main(String[] args) {
        car c1=new car("Maruti","dezire");
        c1.Companyname();
        c1.wheel();
        c1.model();
        bike b=new bike("tvs","plussor 125");
        b.Companyname();
        b.wheel();
        b.model();



    }
}
