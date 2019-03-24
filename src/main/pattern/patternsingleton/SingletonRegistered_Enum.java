import com.sun.org.apache.bcel.internal.generic.INSTANCEOF;

/**
 * 2019/3/23
 * 创建人￥Jack
 */
public enum SingletonRegistered_Enum {

    INSTANCE;
   private Object data;

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public static SingletonRegistered_Enum getInstance(){
        return INSTANCE;
    }
}
