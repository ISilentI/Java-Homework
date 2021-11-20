public class RandomArray {

    public static void main(String[] args){
        int array[] = new int[10];
        int temp = 0;
        for (int i = 0; i < 10; i++){
            array[i] = (int)Math.round(Math.random()*11);
            System.out.println("Num 1: " + array[i]);
        }

        for (int i = 0; i < 10; i++){
            for (int j = 0; j < 10; j++){
                if (array[i] > array[j]){
                    temp = array[j];
                    array[j] = array[i];
                    array[i] = temp;
                }
            }
        }
        for (int i = 0; i < 10; i++){
            System.out.println("Number 1: " + array[i]);
        }
    }
}
