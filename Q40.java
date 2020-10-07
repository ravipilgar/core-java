import java.util.*;
class Student{
    private String name;
    private int rollNo;
    private int age;
    private int Score;
     
    Student(){}

   Student(String name,int rollNo,int age,int Score){
            this.name=name;
            this.rollNo=rollNo;
            this.age=age;
            this.Score=Score;
    }

    public int getScore(){
        return Score;
    }

    void ScoreGroup(int Score){
        if(Score<50){
            System.out.println("Grade F");
        }else if(Score>=50 && Score<65 ){
            System.out.println("Grade C");
        }else if(Score>=65 && Score<80 ){
            System.out.println("Grade B");
        }else if(Score>=80 && Score<=100){
            System.out.println("Grade A");
        }
    }
  }

class StudentGradeCheck{
    public static void main(String args[]) {
       Scanner sc=new Scanner(System.in);
     //  Student S=new Student(System.in);
       // S.Student1("pravin",101,24,60);
        
    
          Student a[]=new Student[2];

         // Student a[]={new Student("pravin",101,24,40),new Student("tushar",101,24,80)};
  
         for(int i=0;i<a.length;i++){
             System.out.println("Enter the "+(i+1)+" Students Details");
             String name=sc.next();
             int age=sc.nextInt();
             int rollNo=sc.nextInt();
             int score=sc.nextInt();
            Student S=new Student(name,rollNo,age,score);
            a[i]=S;
         }

          for(Student x : a){
            
                x.ScoreGroup(x.getScore());
          }
    }
}