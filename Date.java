package datelab;

public class Date {

    // private int masV[] = {31,29,31,30,31,30,31,31,30,31,30,31}; //пережиток моей индуской точки
    private static final int masN[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    private int day;
    private int month;
    private int year;

    Date() {
        day = 1;
        month = 1;
        year = 1900;
    }

    Date(int d, int m, int y) {
        day = d;
        month = m;
        year = y;

    }

    Date(Date a) {
        day = a.day;
        month = a.month;
        year = a.year;
    }
    

    public void setDate(int d, int m, int y) {
        day = d;
        month = m;
        year = y;
    }

    public void incDate() {
        day++;
        if (day > masN[month]) {
            month++;
        }
        if (month == 12) {
            year++;
            month = 1;
            day = 1;
        }
    }
    
   

    public void decDate() {
        day--;
        if (day == 0){
        month--;
        day = masN[month];
        }
        if (month == 12 || day == 1) {
            year++;
            month = 1;
            day = 1;
        }
    }

    public void printDate() {

        System.out.println("\n" + day + "." + month + "." + year);
    }
    
    public static int  monthsCount(Date a , Date b){
        
        int dt = a.day - b.day;
        int mt = a.month - b.month;
        if(dt < 0)
            dt = masN[dt]+ dt;
        if(mt < 0)
            mt*=-1;
        mt +=(int)(dt/30);
        return mt
                ;
       
    }

}
