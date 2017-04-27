package tools;

import java.util.HashMap;

/**
 * Created by Administrator on 2017/4/25.
 */
public class APIUtils {

    private APIUtils(){}

    public static int getPageNew(int pagenew, int pagesize){
        if(pagenew<=1){
            pagenew=0;
        }else{
            pagenew=(pagenew-1)*pagesize;
        }
        return pagenew;
    }

    public static HashMap<String, Object> toMap(String message, boolean result){

        HashMap<String, Object> map = new HashMap<String, Object>();
        map.put("msg", message);
        map.put("success", result);
        return map;
    }

    public static HashMap<String, Object> toMap(String message, boolean result, Object data){
        HashMap<String, Object> map = toMap(message, result);
        map.put("data", data);
        return map;
    }

    public static HashMap<String, Object> toMap(String message, boolean result, HashMap<String, Object>... datas){
        HashMap<String, Object> map = toMap(message, result);
        for(HashMap<String, Object> m : datas){
            if(m != null) {
                map.putAll(m);
            }
        }
        return map;
    }

    public static HashMap<String, Object> toMap(String message, boolean result, Object data, HashMap<String, Object>... datas){
        HashMap<String, Object> map = toMap(message, result);
        map.put("data", data);
        for(HashMap<String, Object> m : datas){
            if(m != null){
                map.putAll(m);
            }
        }
        return map;
    }
}
