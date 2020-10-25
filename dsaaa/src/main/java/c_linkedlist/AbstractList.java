package c_linkedlist;

/**
 * @author ming
 * @description
 * @date 2020/6/24
 */
public abstract class AbstractList<E> implements List<E>{
    //元素的数量
    protected int size;

    /**
     * @description 元素的数量
     * @param
     * @return
     */
    public int size(){
        return this.size;
    }

    /**
     * @description 是否包含元素
     * @param
     * @return
     */
    public boolean contains(E element){
        boolean flag =false;
        int index = indexOf(element);
        if(DEFAULT_NOT_FOUND!=index){
            flag = true;
        }
        return flag;
    }

    //添加元素
    public void add(E element){
        add(size,element);
    }

    /**
     * @description  数组是否是空
     * @param
     * @return
     */
    public boolean isEmpty(){
        return size==0;
    }

    /**
     * @description 检查索引范围
     * @param index
     */
    protected void checkIndexRange(int index){
        if(index<0||index>=size){ 
            throw new IndexOutOfBoundsException("Index:"+index+",Size:"+size);
        }
    }

    /**
     * @description 检查索引范围
     * @param index
     */
    protected void checkIndexRangeForAdd(int index){
        if(index<0||index>size){
            throw new IndexOutOfBoundsException("Index:"+index+",Size:"+size);
        }
    }

}
