public class Factorial {

    public static void main(String[] args){
        Factorial temp = new Factorial();
        System.out.println("Result: ");
        temp.GetFactorial(5);
    }

    int GetFactorial(int point){
        int result = 1;
        for (int i = 1; i <= point; i++){
            result = result * i;
            System.out.print(result + " ");
        }
        return result;
    }
}
