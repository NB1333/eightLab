package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Compare {
    public List<Circle> compare(List<Circle> listData) {

        List<Circle> list = new ArrayList<Circle>(listData);

        Comparator<Circle> radiusComparator = (c1, c2) -> (int) (c1.getRadius() - c2.getRadius());
        list.sort(radiusComparator);

        return list;
    }
}
