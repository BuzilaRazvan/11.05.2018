public class Lab4Ex3 {

        public static void main(String[] args) {
            double grade [] = {10,5,8,1,3};
            int i,sum,average0,average;
            sum=0;
            for (i=0; i<grade.length; i++)
            {
                sum+=grade[i]; }

            average=sum/grade.length;
            {
                average0=average/grade.length-1;
            while (average0 == 0)
            {break;}
                System.out.println(average0);

        }
    }


}

