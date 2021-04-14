package Class_9.chapter_1;

public class Practise_5 {
    void distance(double km) {
        double m = km * 1000;
        System.out.println(km + " km in meters are " + m);
    }

    void time(double hrs) {
        double min = hrs * 60;
        System.out.println(hrs + " hrs in mins are " + min);
    }

    void amount(double rupees) {
        double paisa = rupees * 100;
        System.out.println("₹ " + rupees + " in paisa are " + paisa);
    }
}
