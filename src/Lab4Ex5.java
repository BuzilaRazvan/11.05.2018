public class Lab4Ex5 {
    public static void main(String[] args) {
        int f = 40;
        do {
            double c = 5 / 9d * (f - 32);
            System.out.println("fareheit " + f + " corespunde la celsius: " + c);
            f++;
        } while (f <= 140);
    }
}