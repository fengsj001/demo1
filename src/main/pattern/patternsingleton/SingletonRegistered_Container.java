import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 2019/3/23
 * 创建人￥Jack
 */
public class SingletonRegistered_Container {
    private SingletonRegistered_Container(){}
    private static final Map<String, Object> ioc = new ConcurrentHashMap<String, Object>();
    public static Object getBean(String className){
        synchronized (ioc){
            if(!ioc.containsKey(className)){
                Object obj = null;
                try {
                    obj = Class.forName(className).newInstance();
                    ioc.put(className,obj);
                }catch (Exception ex){
                    ex.printStackTrace();
                }
                return obj;
            }else {
                return ioc.get(className);
            }
        }
    }

}
