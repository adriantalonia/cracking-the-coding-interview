package algoexpert.easy._01_two_sum;

class Program {
    public static int[] twoNumberSum(int[] array, int targetSum) {
        // Write your code here.
        int x = 0;
        int y = 0;
        boolean change = false;

        for(int i = 0; i < array.length; i++){
            for(int j = i+1; j<  array.length; j++){
                if(array[i]+array[j] == targetSum){
                    x = array[i];
                    y = array[j];
                    change = true;
                    break;
                }
            }
            if(change) break;
        }

        return change ? new int[]{x,y} : new int[]{};
    }
}

class ProgramTest {
    //@Test
    public static void main(String[] args){
        int[] output = Program.twoNumberSum(new int[] {3, 5, -4, 8, 11, 1, -1, 6}, 10);
        if(output.length == 2) System.out.println("2");;
        if(contains(output, -1)) System.out.println("-1");;
        if(contains(output, 11)) System.out.println("11");;
    }

    public static boolean contains(int[] output, int val) {
        for (var el : output) {
            if (el == val) return true;
        }
        return false;
    }
}
