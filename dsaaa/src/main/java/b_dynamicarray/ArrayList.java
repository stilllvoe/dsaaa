package b_dynamicarray;

import c_linkedlist.AbstractList;

/**
 * @author ming
 * @description
 * @date 2020/6/13 20:01
 */
public class ArrayList<E> extends AbstractList<E> {
    //数组
    private E[] elements;
    //数组默认长度
    private static final int DEFAULT_CAPACITY = 10;

    public ArrayList(){
        this(DEFAULT_CAPACITY);
    };

    public ArrayList(int capacity){
        if(capacity<=10){
            capacity = DEFAULT_CAPACITY;
        }
        elements = (E[]) new Object[capacity];
    }

    /**
     * @description 获取元素的索引
     * @param
     * @return
     */
    public int indexOf(E elment){
        if(elment==null){
            for (int i = 0; i <size ; i++) {
                if (elements[i]==null){
                    return i;
                }
            }
        }else{
            for (int i = 0; i <size ; i++) {
                if (elment.equals(elements[i])){
                    return i;
                }
            }
        }
        return DEFAULT_NOT_FOUND;
    }

    /**
     * @description  根据索引获取元素
     * @param
     * @return
     */
    public E get(int index){
        checkIndexRange(index);
        return elements[index];
    }

    //指定索引位置添加元素
    public void add(int index,E element){
        checkIndexRangeForAdd(index);
        /*if(DEFAULT_CAPACITY==size){//这种扩容是有问题的，DEFAULT_CAPACITY一直都是10，没有增加
            int tmp[] = elements;
            elements = new int[2*DEFAULT_CAPACITY];
            for (int i = 0; i < tmp.length; i++) {
                elements[i]=tmp[i];
            }
        }*/
        ensureCapacity(size+1);
        for (int i = size-1; i >=index ; i--) {
            elements[i+1]=elements[i];
        }
        elements[index]=element;
        size++;
    }

    /**
     * @description  修改指定索引位置的元素，返回原元素
     * @param
     * @return
     */
    public E set(int index,E element){
        checkIndexRange(index);
        E old = null;
        for (int i=0;i<size;i++){
            old = elements[index];
            elements[index]=element;

        }
        return old;
    }

    /**
     * @description 删除指定索引的元素
     * @param
     * @return
     */
    public E remove(int index){
        checkIndexRange(index);
        E old =elements[index];
        for (int i = index+1; i <= size-1; i++) {
             elements[i-1]=elements[i];
        }
        elements[--size] =null;
        return old;
    }

    //清空元素
    public void clear(){
        //return size = 0;
        for (int i = 0; i < size; i++) {
            elements[i]=null;//没有了地址引用，对象就会自动销毁
        }
        size = 0;
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        str.append("size=").append(size).append(",[");
        for (int i = 0; i <size ; i++) {
            if(i!=0){
                str.append(",");
            }
            str.append(elements[i]);
            /*if(i!=size-1){
                str.append(",");
            }*/
        }
        str.append("]");
        return str.toString();
    }

    /**
     * @description 确保数组容量
     * @param capacity
     */
    private void ensureCapacity(int capacity) {
        int oldCapaticy = elements.length;
        if(capacity>oldCapaticy){
            int newCapacity = oldCapaticy + (oldCapaticy>>1);
            E[] tmp = (E[]) new Object[newCapacity];
             for (int i = 0; i < size; i++) {
                tmp[i] = elements[i];
            }
            elements = tmp;
        }
    }
}
