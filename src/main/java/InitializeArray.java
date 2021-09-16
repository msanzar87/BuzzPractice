public class InitializeArray {

    //Declare/Initialize an array to the size of num containing only the value of num.
    public int[] initArr(int num) {
        //create an array the size of num
        //num = 3
        int[] arr = new int[num];
        //arr = {0,0,0};
        //every value within the array should = num
        for (int i = 0; i < num; i++) {
            //iterate through array
            arr[i] = num;
            //within each iteration of the array you will assign that value to equal num

        }
        return arr;
    }


    //Check test cases to figure out array size and values being stored.  Hint: use a for loop to fill the values
    public int[] initArrRandom(int num) {


        return null;
    }

}
