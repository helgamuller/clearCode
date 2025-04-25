package practice1;

public class MathOperations {
//    public int add(int a, int b) {
//        return a + b;
//    }
//    public int add(int a, int b, int c) {
//        return a + b + c;
//    }
//    public int add(int a, int b, int c, int d) {
//        return a + b + c + d;
//    }

    public int add(int[] array){
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum+=array[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        MathOperations operation = new MathOperations();
        int[] array = {1, 2, 3, 4, 5, 6, 7};

      int result = operation.add(array);
        System.out.println(result);
    }
}