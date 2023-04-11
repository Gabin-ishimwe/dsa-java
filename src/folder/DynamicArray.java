package folder;

import java.util.ArrayList;
import java.util.Objects;

public class DynamicArray {

    int size;
    Object name;
    public void arrayImpl() {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(1);
        arrayList.add(1);
        arrayList.add(1);
        arrayList.add(1);
        arrayList.add(1);
        arrayList.add(1);
        arrayList.add(1);
        arrayList.add(1);
        arrayList.add(1);
        arrayList.add(1);
        arrayList.add(1);
        arrayList.add(1);
        arrayList.add(1);
        arrayList.add(1);
        arrayList.add(1);
        arrayList.add(1);
        arrayList.add(0, 10);
        System.out.println(arrayList);
    }
}
