package PO4_Froggy;

import java.util.Iterator;

public class Lake implements Iterable<Integer>{
    public int[] stoneNumber;

    public Lake(int[] stoneNumber){
        this.stoneNumber = stoneNumber;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>(){
            private int index = 0;
            private int lastEvenIndex = stoneNumber.length %2 == 0 ? stoneNumber.length - 2 : stoneNumber.length - 1;
            @Override
            public boolean hasNext(){
                return this.index < stoneNumber.length;
            }

            @Override
            public Integer next(){
                if(this.index == lastEvenIndex){
                    int element = stoneNumber[lastEvenIndex];
                    this.index = 1;
                    return element;
                }
                int element = stoneNumber[index];
                this.index += 2;
                return element;
            }
        };

    }
}
