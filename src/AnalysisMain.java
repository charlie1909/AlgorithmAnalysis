import com.sun.xml.internal.bind.v2.model.annotation.Quick;

import java.util.ArrayList;
import java.util.List;

public class AnalysisMain {

    public static void main(String[] args){
        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(2);
        list.add(6);
        list.add(3);
        list.add(1);

        long start = System.nanoTime();
        BubbleSort bubblesort = new BubbleSort();
        bubblesort.run(list);
        long end = System.nanoTime();

        for(int i = 0; i < list.size(); i++){
            System.out.print(list.get(i) + " ");
        }
        System.out.println("");
        System.out.println("The algorithm ran in " + (end - start) + "nanoseconds");

        long start2 = System.nanoTime();
        QuickSort quickSort = new QuickSort();
        quickSort.run(list);
        long end2 = System.nanoTime();

        for(int i = 0; i < list.size(); i++){
            System.out.print(list.get(i) + " ");
        }
        System.out.println("");
        System.out.println("The algorithm ran in " + (end2 - start2) + "nanoseconds");
    }
}
