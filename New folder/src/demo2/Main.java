package demo2;

public class Main {
    public static void main(String[] args) {
        sumable sum = (int x, int y) -> x + y;
        System.out.println(sum.sum(3, 6));
        System.out.println(sum.sum(1, 9));
        System.out.println(sum.sum(5, 9));
    }
}
