class Employee{
    
     Employee(){
        this(2);
     }

     Employee(int x){
         this(2,3);
         System.out.println(x);
     }

     Employee(int a,int b){
         this("Pravin",101,2000);
        System.out.println(a+" "+b);
    }

    Employee(String b1,int b2,int b3){
        System.out.println(b1+" "+b2+" "+b3);
    }
}
class EmployeeDemo{
    public static void main(String[] args) {
        Employee e =  new Employee();
    }
}