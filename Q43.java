
import java.util.Scanner;
class OneBHK{
    protected double roomArea;
    protected double hallArea;
    protected double price;
    OneBHK(){
        roomArea=0;
        hallArea=0;
        price=0;
    }

    OneBHK(double roomArea,double hallArea,double price){
        this.roomArea=roomArea;
        this.hallArea=hallArea;
        this.price=price;
    }
    double getRoomArea(){
        return roomArea;
    }

    double getHallArea(){
        return hallArea;
    }

    double getPrice(){
        return price;
    }

    void show(){
        System.out.println("Room Area = "+roomArea+"\n"+"Hall Area = "+hallArea+"\n"+"Price = "+price);
    }
}
class TwoBHK extends OneBHK{
    private double room2Area;


    TwoBHK(double roomArea,double room2Area,double hallArea,double price){
        super(roomArea,hallArea,price);//super constract are use to call the construtor of super class
        this.roomArea=roomArea;
        this.room2Area=room2Area;
        this.hallArea=hallArea;
        this.price=price;
    }

    double getRoom2Area(){
        return room2Area;
    }
   
    void show(){
        super.show();//super keyword use to access the overrhidden methos 
        System.out.println("Room two Area = "+room2Area);
    }
}
class Q43{
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        TwoBHK arrToStoreFlat[]=new TwoBHK[3];
        double totalFlatRrice=0;
        for(int i=0;i<arrToStoreFlat.length;i++){
        System.out.println("Enter the "+(i+1)+" Two BHK FLAT Deatails");
            double room1Area=sc.nextDouble();
            double room2Area=sc.nextDouble();
            double hallArea=sc.nextDouble();
            double price=sc.nextDouble();
       TwoBHK o1=new TwoBHK(room1Area,room2Area,hallArea,price);
       arrToStoreFlat[i]=o1;
        }
      for(TwoBHK a : arrToStoreFlat){
        //  System.out.println(a.getRoomArea()+"\n"+a.getRoom2Area()+"\n"+a.getHallArea()+"\n"+a.getPrice());
        totalFlatRrice=totalFlatRrice+a.getPrice();
      }   
     System.out.println("Total Amount of all Flat "+totalFlatRrice);    
    }
}