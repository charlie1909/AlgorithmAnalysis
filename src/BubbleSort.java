import java.util.Collections;
import java.util.List;

public class BubbleSort implements Algorithm{

    public void run(List<Integer> listToSort){
        int n = listToSort.size();

        for(int i = 0; i < n-1; i++){
            for(int j = 0; j < n-i-1; j++){
                if(listToSort.get(j) > listToSort.get(j+1)){
                    //store value at j into temp variable
                    int temp = listToSort.get(j);
                    //swap int at j+1 to int at j
                    listToSort.set(j, listToSort.get(j+1));
                    //put temp into j+1, this swap j and j+1
                    listToSort.set(j+1, temp);

                    //this directly swaps the values
//                    Collections.swap(listToSort, j, j+1);
                }
            }
        }
    }

    @Override
    public String getAlgorithmName() {
        return "BubbleSort";
    }
}
