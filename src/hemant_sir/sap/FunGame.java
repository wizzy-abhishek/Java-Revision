package hemant_sir.sap;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class FunGame {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        funGame(list );
    }
    // A bigger output 1 b removes,
    private static void funGame(List<Integer> inputList){
        int startingIndex = 0 ;
        int endIndex = inputList.size() - 1 ;
        while((startingIndex <= inputList.size() - 1) && (endIndex >= 0) ){
            if(Objects.equals(inputList.get(startingIndex), inputList.get(endIndex))){
                System.out.print("0 ");
                startingIndex++ ;
                endIndex-- ;
            }else if(inputList.get(startingIndex) > inputList.get(endIndex)){
                System.out.print("1 ");
                endIndex-- ;
            }else{
                System.out.print("2 ");
                startingIndex++ ;
            }
        }
    }
}
