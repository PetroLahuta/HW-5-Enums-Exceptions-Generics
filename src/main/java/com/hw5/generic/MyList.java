package main.java.com.hw5.generic;

import java.util.ArrayList;
import java.util.List;

public class MyList<T extends Number> {
    List<T> list = new ArrayList();

    public MyList() {

        list = new ArrayList<T>();
    }

    public void add(T data) {

        list.add(data);
    }

    public T printMinValue() {
        if (list.size() > 0) {
            int min = 0;
            for (int i = 1; i < list.size(); i++) {
                if (list.get(i).intValue() < list.get(min).intValue()) {
                    min = i;
                }
            }
            return list.get(min);
        }
        return null;

    }

    public T printMaxValue() {
        if (list.size() > 0) {
            int max = 0;
            for (int i = 1; i < list.size(); i++) {
                if (list.get(i).intValue() > list.get(max).intValue()) {
                    max = i;
                }
            }
            return list.get(max);
        }
        return null;
    }
}
