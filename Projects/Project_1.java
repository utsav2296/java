package Projects;

import java.util.*;

public class Project_1 {
  

public static String[] emp = {"EmpNo", "EmpName", "JoinDate", "DesignationCode", "Department", "Basic", "HRA", "IT"};

public static String[][] empTable = new String[][] {

{"1001", "Ashish", "01/04/2009", "e", "R&D", "20000", "8000", "3000"},

{"1002", "Sushma", "23/08/2012", "c", "PM", "30000", "12000", "9000"},

{"1003", "Rahul", "12/11/2008", "k", "Acct", "10000", "8000", "1000"},

{"1004", "Chahat", "29/01/2013", "r", "FrontDesk", "12000", "6000", "2000"},

{"1005", "Ranjan", "16/07/2005", "m", "Engg", "50000", "20000", "20000"},

{"1006", "Suman", "1/1/2000", "e", "Manufacturing", "23000", "9000", "4400"},

{"1007", "Tanmay", "12/06/2006", "c", "PM", "29000", "12000", "10000"}

};



public static String[] da = {"DesignationCode", "Designation", "DA"};

public static String[][] daTable = new String[][] {

{"e", "Engineer", "20000"},

{"c", "Consultant", "32000"},

{"k", "Clerk", "12000"},

{"r", "Receptionist", "15000"},

{"m", "Manager", "40000"}

};



public static void main(String[] args) {

Scanner scan = new Scanner(System.in);

System.out.println("Enter Employee ID: ");

String id= scan.nextLine();

boolean temp=false;

int temp1=0;

for (int i=0;i<7;i++)

{

if(id.equals(empTable[i][0]))

{

temp=true;

temp1=i;

}

}

if(!temp)

{

System.out.println("There is no employee with employee id: "+id);

}

else

{

String code=empTable[temp1][3];

String name=empTable[temp1][1];

String department=empTable[temp1][4];

String no=empTable[temp1][0];

int basic, hra, it, da,salary=0;

String deg="";

switch(code){  

  case "e":  

  basic=Integer.parseInt(empTable[temp1][5]);

  hra=Integer.parseInt(empTable[temp1][6]);

  it=Integer.parseInt(empTable[temp1][7]);

  da=20000;

  salary= basic+hra-it+da;

  deg="Engineer";

  break;  

   

  case "c": 

  basic=Integer.parseInt(empTable[temp1][5]);

  hra=Integer.parseInt(empTable[temp1][6]);

  it=Integer.parseInt(empTable[temp1][7]);

  da=32000;

  salary= basic+hra-it+da;

  deg="Consultant";

  break;  

   

  case "k": 

  basic=Integer.parseInt(empTable[temp1][5]);

  hra=Integer.parseInt(empTable[temp1][6]);

  it=Integer.parseInt(empTable[temp1][7]);

  da=12000;

  salary= basic+hra-it+da;

  deg="Clerk";

  break;  

   

  case "r":  

  basic=Integer.parseInt(empTable[temp1][5]);

  hra=Integer.parseInt(empTable[temp1][6]);

  it=Integer.parseInt(empTable[temp1][7]);

  da=15000;

  salary= basic+hra-it+da;

  deg="Receptionist";

  break; 

   

  case "m": 

  basic=Integer.parseInt(empTable[temp1][5]);

  hra=Integer.parseInt(empTable[temp1][6]);

  it=Integer.parseInt(empTable[temp1][7]);

  da=40000;

  salary= basic+hra-it+da;

  deg="Manager";

  break;  

  }  



System.out.printf("%-10s%-10s%-15s%-15s%-10s\n", "Emp No.", "Emp Name", "Department", "Designation", "Salary");

System.out.println();

System.out.printf("%-10s%-10s%-15s%-15s%-10s", no, name, department, deg, salary);

}

scan.close();



}



}