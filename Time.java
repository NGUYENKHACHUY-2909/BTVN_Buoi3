package BTVN_Buoi3;

public class Time {
    private int hourse;
    private int minute;
    private int second;

    //time()
    public  Time(int hourse, int minute, int second){
        this.hourse = hourse;
        this.minute = minute;
        this.second = second;
    }

    // void setTime()
    public void setTime(int hourse,int minute, int second){
        this.hourse = hourse;
        this.minute = minute;
        this.second = second;
    }
    //toString()
    public String toString(){
        return String.format("%s",hourse<10? "0"+hourse:hourse) + ":"+String.format("%s",minute<10? "0"+minute:""+minute)+":"+String.format("%s",second<10? "0"+second:""+second);
    }

    // nextSecond
    public void nextSecond(){
        this.second= second+1;
    }
    public void previousSecond(){
        this.second = second-1;
    }
    //setter
    public void setHourse(int hourse){
        this.hourse = hourse;
    }
    public void setMinute(int minute){
        this.minute = minute;
    }
    public void setSecond(int second){
        this.second = second;
    }

    //getter
    public int getHourse(){
        return hourse;
    }
    public int getMinute(){
        return minute;
    }
    public int getSecond(){
        return second;
    }
}
