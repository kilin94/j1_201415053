package com.sd.sort.v2;

public class IntegerComparator implements Comparator {
    public IntegerComparator() {}
    public int compare(Object o1, Object o2) {
        return (Integer)o1 - (Integer)o2;  //obj로 넘어가니까 캐스팅
    }
}