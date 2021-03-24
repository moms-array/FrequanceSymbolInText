import java.io.*;
import java.sql.BatchUpdateException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class FrequanceSymbolIntText {

    public static Map frequanceSymbolIntText(String fileWay) {
        Map<Character,Integer> map = new TreeMap<>();
        try {
            FileInputStream file = new FileInputStream(fileWay);
            while (file.available() > 0) {
                int one  = file.read();
                char a = (char) one;
                if(map.containsKey(a)){
                    map.put(a,map.get(a)+1);
                }
                else
                    map.put(a,1);
            }

        } catch (FileNotFoundException e) {
            System.out.println(e);
        }catch (IOException e){
            System.out.println(e);
        }
        return map;
    }
}
