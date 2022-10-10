package HomeworkSeven;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;


public class TaskSeven {
    public static void main(String[] args) {
        Integer[] array = {2, 2, 2, 1, 2, 132, 234, 23, 21, 1, 1};
        System.out.println(getElementsOfArray(array));
    }

    public static <K> Map<K, Integer> getElementsOfArray(K[] ks) {
        Map<K, Integer> map = new HashMap<>();
        for (K k : ks) {
            map.compute(k, new BiFunction<K, Integer, Integer>() {
                        @Override
                        public Integer apply(K k, Integer count) {
                            if (count == null) {
                                return count = 1;
                            } else
                                return count += 1;
                        }
                    }
            );
        }
        return map;
    }
}