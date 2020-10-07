class Demo
{ 
    public static void main(String[] args) 
    { 
        StringBuilder s1 = new StringBuilder("Java"); 
        String s2 = "Love"; 
        //s1.append(s2); 
        System.out.println(s1.append(s2) ); 
       // s1.substring(4); 
        System.out.println( s1.substring(4)); 
        int foundAt = s1.indexOf("L"); 
        System.out.println(foundAt+""+s1+" "+s2); 
    } 
}