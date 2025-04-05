Package code:
 package mathoperations; 
public class Addition{ public int add(int n1,int n2){ 
return n1+n2; 
}
 } 
Main Code: 
import mathoperations.Addition;
 public class Math
{ 
public static void main(String[] args)
{ Addition a=new Addition(); 
int sum=a.add(2,3); 
System.out.println("the sum of the numbers is:"+sum); 
}
 }

