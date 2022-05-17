package Projects;

import java.util.*;

public class Pro6 {

public static void main(String[] args)

{

int n;

String str,str1,str3;

Scanner sc = new Scanner(System.in);

List<String> list=new ArrayList<String>();

System.out.println("1. insert ");

System.out.println("2. search ");

System.out.println("3. delete");

System.out.println("4. display");

System.out.println("5. exit ");

System.out.println("enter your choice:");

n = sc.nextInt();

if(n==1)

{

System.out.println("enter element to be inserted: ");

str= sc.next();

list.add(str);

System.out.println("inserted successfully ");

}

if(n==2)

{

System.out.println("enter element to be search: ");

str1= sc.next();

boolean ans = list.contains(str1);

if (ans)

System.out.println("The list contains "+str1);

else

System.out.println("The list does not contains "+str1);

}

if (n==3)

{

System.out.println("enter element to be delete: ");

str3= sc.next();

list.remove(str3);

}

if (n==4)

{

System.out.println(list);

}

if(n==5)

{

System.out.println("exited!!!!!");

System. exit(0);

}

while (n!=5)

{

System.out.println("1. insert ");

System.out.println("2. search ");

System.out.println("3. delete");

System.out.println("4. display");

System.out.println("5. exit ");

System.out.println("enter your choice:");

n = sc.nextInt();

if(n==1)

{

System.out.println("enter element to be inserted: ");

str= sc.next();

list.add(str);

System.out.println("inserted successfully ");

}

if(n==2)

{

System.out.println("enter element to be search: ");

str1= sc.next();

boolean ans = list.contains(str1);

if (ans)

System.out.println("The list contains "+str1);

else

System.out.println("The list does not contains "+str1);

}

if (n==3)

{

System.out.println("enter element to be delete: ");

str3= sc.next();

boolean ans = list.contains(str3);

if (ans)

{

list.remove(str3);

System.out.println("element deleted successfully: ");

}

else{

System.out.println("The list doesnot contains "+str3);

}

}

if (n==4)

{

System.out.println(list);

}

if(n==5)

{

System.out.println("exited!!!!!");

System. exit(0);

}

}

sc.close();

}

}