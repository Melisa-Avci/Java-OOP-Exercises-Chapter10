package test;
import odev2.Time;

public class TestTime {
    public static void main(String[] args) {
        Time t1 = new Time();
        Time t2 = new Time(555550000L);
        Time t3 = new Time(5, 23, 55);

        System.out.println("t1 (Şu anki GMT saati): " + t1.getHour() + ":" + t1.getMinute() + ":" + t1.getSecond());
        System.out.println("t2 (555550000 ms): " + t2.getHour() + ":" + t2.getMinute() + ":" + t2.getSecond());
        System.out.println("t3 (Belirtilen saat): " + t3.getHour() + ":" + t3.getMinute() + ":" + t3.getSecond());
    }
}