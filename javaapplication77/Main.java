package javaapplication77;

public class Main{

private static void printInfo(Employee [] arr1){
     int h = 0 , d=0 ; 
     System.out.println("Employee Number   Week   Total Days/hours   weekly Payment");
     for (int i = 0; i < arr1.length ; i++) {
         for (int j = 0; j < 4; j++) {
             for (int k = 0; k < 5; k++) {
                    int a = arr1[i].getTimecard()[j].getArr2()[k];
                    if(a>0){
                    h+=a;
                    d++;
             }
         }
             System.out.println(arr1[i].getEmpNo()  +"          "+ (j+1) +"        "+ d + "/" + h +"            " + h*arr1[i].getPayRatePerHour());
             
     }
 } 
     System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
 }
 private static void printAbsents(Employee [] arr1 , int m){
     int ab = 0 ;
     for (int i = 0; i < arr1.length ; i++) {
             for (int k = 0; k < 5; k++) {
                   int a = arr1[i].getTimecard()[m].getArr2()[k];
                   if (a==0)
                       ab++;
             }
             if (ab >= 2){
             System.out.println(arr1[i].getName() + " is Absent ");
             
             }
     }
     System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
 }
 
 public static void sortEmps(Object [] o){
      Employee [] emp = (Employee []) o ;
      for (int i = 0 ; i< emp.length ; i++) {
          for (int j = 0 ; j < emp.length-1 ; j++) {
             if(emp[j].totalPayment() > emp[j+1].totalPayment())
             {
             Employee temp = emp[j];
             emp[j]= emp[j+1];
             emp[j+1]= temp;
             }
          } 
      }
      for (int l = 0 ; l< emp.length ; l++) {
          System.out.println("Name = " + emp[l].getName());
      }
      System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
 }
    public static void main(String[] args) {
        Employee[] arr1 =new Employee [4];
         arr1 [0]= new Employee ( new Timecard(1,0,2,5,2,"18/11/1982")
                ,new Timecard(4,0,0,8,2,"4/11/2007")
                ,new Timecard(5,5,0,7,0,"1/5/2001") 
                ,new Timecard(1,0,2,5,2,"21/7/2003"),
                202011265 , "Mariam" , 25.0 , 2002 ,"092511116");
        
          arr1 [1]= new Employee ( new Timecard(7,7,8,8,0,"17/12/2002")
                ,new Timecard(7,7,8,8,0,"15/11/1999")
                ,new Timecard(7,7,8,8,0,"22/4/2020") 
                ,new Timecard(0,0,0,0,0,"30/5/2006"),
                202165437 , "Sadeeq" , 30.0 , 1968 , "0592502585");
          
            arr1 [2]= new Employee (new Timecard(5,6,9,6,5,"20/11/2020")
                ,new Timecard(0,0,0,0,0,"23/5/2013")
                ,new Timecard(2,2,2,2,0,"19/4/2004") 
                ,new Timecard(0,0,0,0,0,"10/4/2002"),
                202011973 , "Mohammad " , 50.0 , 2000 , "0598345678" );
            
             arr1 [3]= new Employee (new Timecard(5,4,5,4,3,"17/5/1950")
                ,new Timecard(3,6,3,2,4,"21/6/2009")
                ,new Timecard(3,0,2,1,6,"30/7/2020") 
                ,new Timecard(4,6,3,4,1,"10/4/2018"),
                202010345 , "Shahd " , 70 , 2002 , "0597777177" );

             printInfo(arr1);
             printAbsents(arr1,2);
             sortEmps(arr1);
    }
    
    }
    

