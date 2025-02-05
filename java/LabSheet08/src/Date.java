public class Date {
    private int dMonth;
    private int dDay;
    private int dYear;
    Date() {
        this(0,0,0);
    }
    Date(int month,int day,int year) {
        dMonth = month;
        dDay =day;
        dYear = year;
    }
    public void setDate(int month,int day,int year) {
       
        dMonth = month;
        dDay =day;
        dYear = year;
    }
    public int getMonth() {
        return dMonth;
    }
    public int getDay(){
        return dDay;
    }
    public int getYear() {
        return dYear;
    }
    public String toString(){
        return  dMonth + "-" + dDay + "-" + dYear;
    }
}