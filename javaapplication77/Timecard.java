package javaapplication77;

public class Timecard {
    private String weekEndingDate;
    private int [] arr2 = new int [5];

    public String getWeekEndingDate() {
        return weekEndingDate;
    }

    public void setWeekEndingDate(String weekEndingDate) {
        this.weekEndingDate = weekEndingDate;
    }

    public int [] getArr2() {
        return arr2;
    }

    public void setArr2(int[] arr) {
        this.arr2 = arr2;
    }

    public Timecard(String weekEndingDate) {
        this.weekEndingDate = weekEndingDate;
    }
      
    public Timecard(int n1,int n2,int n3,int n4,int n5,String weekEndingDate ) {
        arr2[0]=n1;
        arr2[1]=n2;
        arr2[2]=n3;
        arr2[3]=n4;
        arr2[4]=n5;
        this.weekEndingDate = weekEndingDate;
    }
    
}
