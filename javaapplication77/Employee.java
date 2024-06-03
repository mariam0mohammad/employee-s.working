package javaapplication77;

public class Employee {
    private int empNo ;
    private String name ;
    private double payRatePerHour ;
    private int yearOfBirth ;
    private String phone ;
    private Timecard [] timecard = new Timecard [4];

    public int getEmpNo() {
        return empNo;
    }

    public void setEmpNo(int empNo) {
        this.empNo = empNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPayRatePerHour() {
        return payRatePerHour;
    }

    public void setPayRatePerHour(double payRatePerHour) {
        this.payRatePerHour = payRatePerHour;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Timecard[] getTimecard() {
        return timecard;
    }

    public void setTimecard(Timecard[] timecard) {
        this.timecard = timecard;
    }
    
    public double totalPayment (){
        double a = 0 ;
        double t =0 ;
        for (int j = 0; j < 4; j++) {
            for (int k = 0; k < 5; k++) {
               a = getTimecard()[j].getArr2()[k];
               t+=a;
            }
        }
        return  t * payRatePerHour;
    }
    
    public Employee(int empNo, String name, double payRatePerHour, int yearOfBirth, String phone) {
        this.empNo = empNo;
        this.name = name;
        this.payRatePerHour = payRatePerHour;
        this.yearOfBirth = yearOfBirth;
        this.phone = phone;
    }
    
    public Employee (Timecard t1 , Timecard t2 , Timecard t3 ,Timecard t4 , int empNo, String name, double payRatePerHour, int yearOfBirth, String phone ){
       timecard[0]=t1;
       timecard[1]=t2;
       timecard[2]=t3;
       timecard[3]=t4;
       this.empNo = empNo;
       this.name = name;
       this.payRatePerHour = payRatePerHour;
       this.yearOfBirth = yearOfBirth;
       this.phone = phone;
    }
}