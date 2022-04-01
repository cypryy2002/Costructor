
//Part 1
public class Time {
    int hour,minute,second,month,year;
// 1
     Time(int hour,int minute,int second)
    {
        this.hour=hour;
        this.minute=minute;
        this.second=second;
// 2
    }
     Time(int month,int year)
    {
        this.month=month;
        this.year=year;
    }
// 3
    Time(int hour,int minute,int second,int month,int year)
    {
        this.hour=hour;
        this.minute=minute;
        this.second=second;
        this.month=month;
        this.year=year;
    }
//Part 2
//1
    public int getHour() {
        return hour;
    }
//2
    public int getMinute() {
        return minute;
    }
//3
    public int getSecond() {
        return second;
    }
//4
    public int getMonth() {
        return month;
    }
//5
    public int getYear() {
        return year;
    }
//Part 3
//1
    public void setHour(int hour) {
        if((hour<0)||(hour>24))
         this.hour = 0;
        else
         this.hour = hour;
    }
//2
    public void setMinute(int minute) {
        if((minute<0)||(minute>60))
            this.minute = 0;
        else
            this.minute = minute;
    }
//3
    public void setSecond(int second) {
        if((second<0)||(second>60))
            this.second = 0;
        else
            this.second = second;
    }
//4
    public void setMonth(int month) {
        if((month<0)||(month>12))
            this.month = 0;
        else
            this.month = month;
    }
//5
    public void setYear(int year) {
        if(year<0)
            this.year = 0;
        else
            this.year = year;
    }
//Part4
//1
    public String amPm(int hour){
         if(hour<12)
             return "am";
         else
             return "pm";
    }
//2
    public String season(int month){

        switch(month) {
            case 12:
            case 1:
            case 2:
                return "Winter";
            case 3:
            case 4:
            case 5:
                return "Spring";
            case 6:
            case 7:
            case 8:
                return "Summer";
            case 9:
            case 10:
            case 11:
                return "Autumn";
            default:
                return "No season found";
        }
     }
     //3
     String timeInfo(){
         return this.hour+":"+this.minute+":"+this.second;
     }
     //4
     String date(){
         return this.month +"/"+ this.year;
     }
     //5
     public void tString(){
         System.out.println(this.hour+":"+this.minute+":"+this.second+" - "+this.month +"/"+ this.year);
     }

///////voi nu trebuie sa creati main dar eu am creat sa vad daca functioneaza programul


     public static void main(String[] args) {
      Time obj =new Time(10,22,50,9,21);

      obj.amPm(9);
         System.out.println(obj.season(9));
         System.out.println(obj.timeInfo());
         System.out.println(obj.date());
         obj.tString();


    }
}
