import java.util.Scanner;
class Product{
    private int pid;
    private int price;
    private int quantity;

    Product(int pid,int price,int quantity){
         this.pid=pid;
         this.price=price;
         this.quantity=quantity;

    }
}

class ProductDemo{
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int a[][]=new int[5][3];

        for(int i=0;i<a.length;i++){
            System.out.println("Enter the "+(i+1)+" Product Details");     
             for(int j=0;j<a[i].length;j++){
                if(j==0){
                 System.out.print("Pid = ");
                 a[i][j]=sc.nextInt();
                }

                if(j==1){
                    System.out.print("Price = ");
                    a[i][j]=sc.nextInt();
                }
                if(j==2){
                    System.out.print("Quantity = ");
                    a[i][j]=sc.nextInt();
                }

             }
        }

    int max=a[0][1];
    int c=0;
    int b=0;
      for(int i=0;i<a.length;i++){
           for(int j=1;j<=1;j++){
                if(a[i][j]>max){
                   max=a[i][j]; 
                    c=i;
                    b=j;
                }
           }
       }
       System.out.println(max);
       System.out.println(a[c][b-1]);
   }
}

