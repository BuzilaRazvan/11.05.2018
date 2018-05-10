public class Lab4Ex6 {
    public static void main(String[] args) {
        double sir[] = {54, 100, 2, 5, 6, 874, 2, 4};
        double max = sir[0];
        double min = sir[0];
        int i;
        int sum = 0;
        for (i = 0; i < sir.length; i++) {
            if (sir[i] > max) {
                max = sir[i];
            }

        }
        System.out.println("The largest numver is " + max);

        for (i = 0; i < sir.length; i++) {
            if (sir[i] < min)

                min = sir[i];
                System.out.println("The smalest numver is " + min);


            {
                for (i = 0; i<sir.length; i++){
                    sum+=sir[i];}{
                    System.out.println("The sum of number is " + sum);
                }
        double sir2 [] = {sir.length*sir.length}  ;
                System.out.println(sir2);
            }

        }
    }
}
