package learneffectivejava.chapter8.item56;

/**
 * Created by peng on 2020/9/8.
 */
public class DocExamples<E> {
    /**
     * 返回指定位置的元素
     *
     * <p>方法并不会按照线性时间运行，有些应用中，可能会从头到尾尽心过一个查找</>
     * @param index 返回的元素的索引位置，必须是非负数并且小于list的长度
     *
     * @return 指定位置的元素
     * @throws IndexOutOfBoundsException 如果越界
     */
    E get(int index) {
        return null;
    }

    /**
     * Returns true if this collection is empty.
     *
     * @implSpec This implementation returns {@code this.size() == 0}.
     *
     * @return true if this collection is empty
     */
    public boolean isEmpty() {
        return false;
    }

}
