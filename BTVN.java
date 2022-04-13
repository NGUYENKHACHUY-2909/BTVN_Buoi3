package BTVN_Buoi3;

public class BTVN {
    public static void main(String[] args){
        Time nowTime = new Time(8, 05, 4);
        System.out.println(nowTime.toString());
        nowTime.setTime(12,16, 40);
        System.out.println(nowTime.toString());
        System.out.println("Hourse: "+nowTime.getHourse());
        System.out.println("Minute: "+nowTime.getMinute());
        System.out.println("Second: "+nowTime.getSecond());
        nowTime.nextSecond();
        System.out.println(nowTime.toString());
        nowTime.setSecond(40);
        nowTime.previousSecond();
        System.out.println(nowTime.toString());
    }
}
