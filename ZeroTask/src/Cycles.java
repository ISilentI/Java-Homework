public class Cycles {

    public static void main(String[] args){
        int array [] = new int [] { 1, 2, 3, 4, 5};
        int i, j = 0, k = 0;

        int sum1 = 0, sum2 = 0, sum3 = 0;

        for ( i = 0; i < array.length; i++){
            sum1 += array[i];
        }
        System.out.println(sum1);

        while (j < 3){
            sum2 += array[j];
            j++;
        }
        System.out.println(sum2);

        do{
            sum3 += array[k];
            k++;
        } while (k < 3);
        System.out.println(sum3);
    }
}
