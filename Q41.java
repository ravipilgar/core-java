class CheckThis{

    private int i;
    private int j;
   CheckThis(){
      this(20,30);
      System.out.println("Zero parameter");
   }

   CheckThis(int i,int j){
       int k=i+j;
       System.out.println("Two parameter "+k);
   }
}

class Q41{
    public static void main(String args[]) {
        CheckThis c=new CheckThis();
      
    }
}