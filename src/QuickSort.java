import java.util.Collections;
import java.util.List;

public class QuickSort implements Algorithm{

    public void run(List<Integer> toSort){
        quickSort(toSort, 0, toSort.size()-1);
    }

    private void quickSort(List<Integer> toSort, int low, int high){
        if(low<high){
            int pivot = partition(toSort, low, high);

            quickSort(toSort, low, pivot -1);
            quickSort(toSort, pivot +1, low);
        }
    }

    private int partition(List<Integer> toSort, int low, int high){
       // we're using the high index in order to retrieve a value from the listToSort
        int pivot = toSort.get(high);

        int i = (low -1);

        for(int j = low; j <= high - 1; j++){
            if(toSort.get(j)<= pivot){
                i++;
                Collections.swap(toSort, i, j);
            }
        }
        Collections.swap(toSort, i+1, high);
        return (i+1);
    }

    @Override
    public String getAlgorithmName() {
        return "QuickSort";
    }
}
