import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class OperationOnHashMap{
    public static void buildHashMap(){
     HashMap<Integer,String>map=new HashMap<>();
     map.put(1, "Mumbai");
     map.put(2, "Pune");
     map.put(3, "Delhi");
     map.put(4, "Bangalore");
     map.put(5, "Chennai");
     map.put(6, "Kolkata");
     map.put(7, "Hyderabad");
     map.put(8, "Ahmedabad");
     map.put(9, "Jaipur");
     map.put(10, "Lucknow");
    System.out.println(map.containsKey(6));
     System.out.println(map.containsKey(12));
     //traverse by entryse
     //int val:arr
    // for (Map.Entry<Integer, String> entry : map.entrySet()) {
    //         int key = entry.getKey();
    //         String value = entry.getValue();
    //         System.out.println("Key: " + key + ", Value: " + value);
    //     }
        for(Map.Entry<Integer, String> e :map.entrySet()){
            int key = e.getKey();
            String value = e.getValue();
            System.out.println("key ---> "+ key + ", Value ---> " + value);

        }

        // Set<String>keys=map.keySet();
        // for(String key: keys){
        //     System.out.println(key +"--->"+map.get(key));

        // }
//         Set<String> keys = map.keySet();
// for (String key : keys) {
//     System.out.println(key + "--->" + map.get(key));
// }
System.out.println(map.remove(3));
    



    }
    public static void main(String[] args) {
        OperationOnHashMap o = new OperationOnHashMap();
        OperationOnHashMap.buildHashMap();
        
    }
}