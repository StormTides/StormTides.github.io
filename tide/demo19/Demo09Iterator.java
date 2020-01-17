package com.tide.demo19;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Demo09Iterator {
    public static void main(String[] args) {
        Collection<String> coll=new ArrayList<>();
        coll.add("迪丽热巴");
        coll.add("古力娜扎");
        coll.add("玛尔扎哈");
        coll.add("姚明");
        coll.add("科比");

        Iterator<String> it = coll.iterator();

        while (it.hasNext()) {
            String s=it.next();
            System.out.println(s);
        }
        System.out.println("=================================================");
        for (Iterator<String> it2 = coll.iterator();it2.hasNext();) {
            String s=it2.next();
            System.out.println(s);
        }
    }
}
