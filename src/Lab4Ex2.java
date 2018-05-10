public class Lab4Ex2 {
    public static void main(String[] args) {
double grade [] = {10,5,8,1,3};
int i,sum,average;
sum=0;
for (i=0; i<grade.length; i++)
{
    sum+=grade[i]; }
    average=sum/grade.length;
        System.out.println(average);
    }
}

