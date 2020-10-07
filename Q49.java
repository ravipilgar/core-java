interface Taxable{
    double salesTax=0.07;
    double incomeTax=0.105;
   void calcTax();
}

class Employee implements Taxable{
    private int empId;
    private String name;
    private double salary;
     
    Employee(){

    }

    Employee(int empId,String name,double salary){
          this.empId=empId;
          this.name=name;
          this.salary=salary;
    }
   public void calcTax(){
        double Tax=salary*incomeTax;
        System.out.println("Incometax is "+Tax);
   }
}

class Product implements Taxable{
    private int pid;
    private int price;
    private int quantity;

    Product(int pid,int price,int quantity){
        this.pid=pid;
        this.price=price;
        this.quantity=quantity;
    }

    public void calcTax(){
        double ProductTax=price*quantity*salesTax;
       System.out.println("product tax "+ProductTax);
    }
}

class Q49{
    public static void main(String args[]) {
       Taxable s=new Employee(101,"pravin",4000);
        s.calcTax();
        

       Taxable t=new Product(102,2000,2);
       t.calcTax();

    }
}