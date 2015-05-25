package net.dev_bay.simplerecursion;

public class MainJava {
    public static void main(String[] args) {
        System.out.println(getPrintableRangeSimple(1, 10));
        System.out.println(getPrintableRangeTail(1, 10, ""));
    }

    private static String getPrintableRangeSimple(int from, int to) {
        if(from<=to) {
            return from +" " + getPrintableRangeSimple(from + 1, to);
        }
        else{
            return "";
        }
    }

    private static String getPrintableRangeTail(int from, int to, String acc) {
        if(from<=to) {
            return getPrintableRangeTail(from + 1, to, acc +" "+ from);
        }
        else{
            return acc.trim();
        }
    }
}
