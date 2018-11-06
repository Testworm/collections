package com.apache;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.collections.collection.PredicatedCollection;
import org.apache.commons.collections.collection.SynchronizedCollection;
import org.apache.commons.collections.collection.TransformedCollection;
import org.apache.commons.collections.collection.TypedCollection;
import org.apache.commons.collections.collection.UnmodifiableBoundedCollection;
import org.apache.commons.collections.collection.UnmodifiableCollection;

public class CollectionsUtil {
    public static void main(String[] arg){

        Collection<Integer> collection1 = new ArrayList<Integer>();
        Collection<Integer> collection2 = new ArrayList<Integer>();
        collection1.add(1);
        collection1.add(2);
        collection1.add(3);
        collection1.add(4);
        collection2.add(3);
        collection2.add(4);
        collection2.add(4);
        collection2.add(6);
        // 测试union 方法, 取并集(过滤重复数据)
//        Collection unionRes = CollectionUtils.union(collection1, collection2);
//        // 求交集
//        Collection intersectionRes = CollectionUtils.intersection(collection1, collection2);
//        // disjunction 异或, union - 交集
//        Collection disjunctionRes = CollectionUtils.disjunction(collection1, collection2);
//        // subtract 差集
//        Collection subtractRes = CollectionUtils.subtract(collection1, collection2);
//        // 是否右交集
//        boolean containsAnyRes = CollectionUtils.containsAny(collection1, collection2);
//        // 统计数据出现 的个数; key为值, count为次数
//        Map getCardinalityMapRes = CollectionUtils.getCardinalityMap(collection1);
        // 判断是否属于子集合
        boolean isSubCollectionRes = CollectionUtils.isSubCollection(collection1, collection2);
        // 是否包含高key, 求出元素的个数
        int cardinalityRes = CollectionUtils.cardinality(4, collection2);







        System.out.println(cardinalityRes);
    }


}
