package learneffectivejava.chapter11.item83;

/**
 * Create by peng on 2020/9/25.
 */
public class Initialization {

    //正常初始化
    private final FieldType field1 = computeFieldValue();

    //同步化初始化
    private FieldType field2;
    private synchronized FieldType getField2() {
        if (field2 == null)
            field2 = computeFieldValue();
        return field2;
    }

    //静态变量初始化
    private static class FieldHolder {
        static final FieldType field = computeFieldValue();
    }
    private static FieldType getField() {
        return FieldHolder.field;
    }

    //双重检查初始化
    private volatile FieldType field4;
    private FieldType getField4() {
        FieldType result = field4;
        if (result == null)
            synchronized (this) {
                if (result == null)
                    field4 = computeFieldValue();
                result = field4;
            }
        return result;
    }

    //单步检查初始化，可能会导致重复初始化的问题
    private volatile FieldType field5;
    private FieldType getField5(){
        FieldType result = field5;
        if(result == null)
            field5 = result = computeFieldValue();
        return result;
    }

    private static FieldType computeFieldValue() {
        return new FieldType();
    }
}
