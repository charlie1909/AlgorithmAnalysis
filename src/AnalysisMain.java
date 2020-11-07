import com.sun.xml.internal.bind.v2.model.annotation.Quick;

import java.util.ArrayList;
import java.util.List;

public class AnalysisMain {

    public static void main(String[] args){
        List<Integer> list = new ArrayList<>();
        List<Algorithm> algorithms = new ArrayList<>();
        algorithms.add(new BubbleSort());
        algorithms.add(new QuickSort());

        for(Algorithm algorithm : algorithms){
            long start = System.nanoTime();
            algorithm.run(list);
            long end = System.nanoTime();
            printList(list);
            System.out.println("\nThe algorithm " + algorithm.getAlgorithmName() + " ran in " + (end - start) + "nanoseconds");
            initialiseList(list);
        }

    }

    private static void printList(List<Integer> list) {
        for(int i = 0; i < list.size(); i++){
            System.out.print(list.get(i) + " ");
        }
    }

    private static void initialiseList(List<Integer> list) {
        list.add(5);
        list.add(2);
        list.add(6);
        list.add(52);
        list.add(3);
        list.add(1);
        list.add(73);
        list.add(20);
    }
}
