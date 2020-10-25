package c_linkedlist;

public interface List<E> {
    //找不到元素
    static final int DEFAULT_NOT_FOUND= -1;

    /**
     * @description 元素的数量
     * @param
     * @return
     */
    public int size();

    /**
     * @description 获取元素的索引
     * @param
     * @return
     */
    int indexOf(E elment);

    /**
     * @description 是否包含元素
     * @param
     * @return
     */
    boolean contains(E element);

    /**
     * @description  根据索引获取元素
     * @param
     * @return
     */
    public E get(int index);

    /**
     * @description 添加元素
     * @param
     * @return
     */
    void add(E element);

    /**
     * @description  指定索引位置添加元素
     * @param
     * @return
     */
    void add(int index,E element);

    /**
     * @description  修改指定索引位置的元素，返回原元素
     * @param
     * @return
     */
    E set(int index,E element);

    /**
     * @description 删除指定索引的元素
     * @param
     * @return
     */
    E remove(int index);

    /**
     * @description  清空元素
     * @param
     * @return
     */
    void clear();

    /**
     * @description  数组是否是空
     * @param
     * @return
     */
    boolean isEmpty();

}
