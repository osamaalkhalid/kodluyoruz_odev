import java.util.*;  

class UserInputDemo   

{  

public static void main(String[] args)  

{  

Scanner sc= new Scanner(System.in);   

System.out.print("ne kadar aldın?");  

int a= sc.nextInt();  

Scanner sc= new Scanner(System.in); 
Scanner scc= new Scanner(System.in);  
System.out.print("hangi malldan aldın? Ve ne kadar?");  

String str= sc.nextLine(); 
int b= scc.nextInt();  


Scanner scs= new Scanner(System.in);  
System.out.print("hangi mall türü?");  

String strb= scs.nextLine(); 

System.Out.print("ne kadar aldın:"+a+"mall:"+str+"ne kadar"+b+"mall türü:"+strb);



}  

}  
