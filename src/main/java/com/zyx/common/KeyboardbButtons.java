package com.zyx.common;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author yanxinzhang
 * @Title: ${file_name}
 * @Package ${package_name}
 * @Description: ${todo}
 * @date 2020/11/9/13:07
 */
public class KeyboardbButtons {
    public static final Map<Integer, String> dataMap;
    static
    {
        dataMap = new ConcurrentHashMap<>();
        dataMap.put(0,"");
        dataMap.put(1,"");
        dataMap.put(2,"abc");
        dataMap.put(3,"def");
        dataMap.put(4,"ghi");
        dataMap.put(5,"jkl");
        dataMap.put(6,"mno");
        dataMap.put(7,"pqrs");
        dataMap.put(8,"tuv");
        dataMap.put(9,"wxyz");
    }


}
