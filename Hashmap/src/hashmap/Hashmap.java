/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hashmap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.HashMap;
import java.util.Map;
/**
 *
 * @author James
 */
public class Hashmap {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        List<LinkedList> array = new ArrayList<LinkedList>();
        LinkedList List1 = new LinkedList();
        array.add(List1);
        
        HashMap<String,Integer> map = new HashMap();
        //key -> string and value is interger
        map.put("hi",1);
        map.put("hi",2);
        map.remove("hi");
        System.out.println(map.get("hi"));
    }
    
}
