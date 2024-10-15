package Stepan.collections_codingTasks;

import java.util.Map;
import java.util.TreeMap;

public class JCIQ_41_TimeSeries {
    /*
        Time Series

        Create a method that will return the summation of the given time series.
        A time series will be a Map holding a time/value pair.
        Given two time series combine them together.
        When a time is matched in both series the values are combined

            parameter: Map<Integer, Double>
            return: Map<Integer, Double>

        Ex:
            input:
                 series A: {1=1.0, 2=1.5, 3=2.0}
                 series B: {2=1.0, 3=2.5, 5=1.0}
            output:
                 {1=1.0, 2=2.5, 3=4.5, 5=1.0}
     */

    public static void main(String[] args) {

        Map<Integer, Double> seriesA = Map.of(
                1, 1.0,
                2, 1.5,
                3, 2.0
        );

        Map<Integer, Double> seriesB = Map.of(
                2, 1.0,
                3, 2.5,
                5, 1.0
        );

        System.out.println(mapMerge(seriesA, seriesB)); // output: {1=1.0, 2=2.5, 3=4.5, 5=1.0}

    }

    public static Map<Integer, Double> mapMerge(Map<Integer, Double> map1, Map<Integer, Double> map2){

        Map<Integer, Double> mergedMap = new TreeMap<>(map1);   // sorts keys in the map.

        for( Map.Entry<Integer, Double> each : map2.entrySet() ){

            mergedMap.put(each.getKey(), mergedMap.getOrDefault(each.getKey(), 0.0)+each.getValue());
            // merges with the second map updating each key's value if the same key exists, if no then just add.
        }

        return mergedMap;   // returns the merged map.

    }

}
