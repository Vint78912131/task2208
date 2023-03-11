import java.util.*;

public class Main {
/*
Формируем WHERE
*/
 public static void main(String[] args) {
     Map<String, String> params = new LinkedHashMap<>();
     params.put("name","Ivanov");
     params.put("country","Ukraine");
     params.put("city","Kiev");
     params.put("age",null);
//     System.out.println(params);
     getQuery(params);

        }

        public static String getQuery(Map<String, String> params) {
     StringBuilder result = new StringBuilder();

            Map<String, String> lhm = new LinkedHashMap<>();
            lhm.putAll(params);
//            for (Map.Entry<String,String> pair : params.entrySet()) {
//                lhm.put(pair.getKey(),pair.getValue());
//            }
//            System.out.println(lhm);

        for (Map.Entry<String,String> pair : lhm.entrySet())
        {
            if (pair.getValue() != null)
            {
                result.append(pair.getKey() +" = '" + pair.getValue()+"' and ");
            }
        }
            result.delete(result.length()-5,result.length());
            System.out.println(result);
            return result.toString();
        }
    }

//    моё решение не прошло валидацию
//правильным оказалось вот это, без метода main и примера
//
//public static String getQuery(Map <String, String> params) {
//        StringBuilder a = new StringBuilder();
//        for (Map.Entry <String, String> pair : params.entrySet()) {
//        if (pair.getValue() != null) {
//        String key= pair.getKey();
//        StringBuilder keyNew = new StringBuilder(key);
//        String value = pair.getValue();
//        StringBuilder valueNew = new StringBuilder(value);
//
//        a.append(" and " + keyNew + " = '" + valueNew + "'");
//        }
//        }
//        a.delete(0, 5);
//        String s = a.toString();
//        return s;