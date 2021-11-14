package course04;


import java.util.*;

public class MapExample {
    public static Map<String, List<String>> buildMap(List<String> stringList) {
        Map<String, List<String>> result = new LinkedHashMap<>();
        for (String elem : stringList) {
            String key = null;
            if (elem == null || elem.isEmpty()) {
                key = "EMPTY";
            } else {
                key = elem.substring(0, 1).toLowerCase();

            }

            if (!result.containsKey(key)) {
                List<String> value = new ArrayList<>();
                value.add(elem);
                result.put(key, value);
            } else {
                result.get(key).add(elem);

            }
        }
        return result;


    }

    public static void printMap(Map<String, List<String>> map){

        if (map==null){
            return;
        }


        Set<String> keySet=map.keySet();
      Iterator<String> iterator= keySet.iterator();
      while (iterator.hasNext()){
          String currentKey= iterator.next();
          List<String> values= map.get(iterator.next());
          Iterator<String> valueIterator= values.iterator();
          System.out.print(currentKey + "->");
          while (valueIterator.hasNext()){
              System.out.println(valueIterator.next());
              if (valueIterator.hasNext()){
                  System.out.println("," );
              }

          }
      }

    }
}
