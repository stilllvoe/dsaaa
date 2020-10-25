package c_linkedlist;

/**
 * @author ming
 * @description
 * @date 2020/6/22
 */
public class LinkedList<E> extends AbstractList<E>{

    private Node<E> firstNode;

    private static class Node<E>{
        E  element;
        Node<E> next;
        public Node(E element, Node<E> next){
            this.element = element;
            this.next = next;
        }
    }

    /**
     * @description 获取元素的索引
     * @param
     * @return
     */
    public int indexOf(E elment){
        Node<E> node = firstNode;
        if(elment==null){
            for (int i = 0; i <size ; i++) {
                if (node.element==null){
                    return i;
                }
                node = node.next;
            }
        }else{
            for (int i = 0; i <size ; i++) {
                if (elment.equals(node.element)){
                    return i;
                }
                node = node.next;
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
        return node(index).element;
    }

    //指定索引位置添加元素
    public void add(int index,E element){
        checkIndexRangeForAdd(index);
        if(0==index){
            firstNode = new Node<>(element,firstNode);
        }else {
            Node<E> preNode = node(index-1);
            preNode.next = new Node<>(element,preNode.next);
        }
        size++;
    }

    /**
     * @description  修改指定索引位置的元素，返回原元素
     * @param
     * @return
     */
    public E set(int index,E element){
        Node<E> node = node(index);
        E old = node.element;
        node.element = element;
        return old;
    }

    /**
     * @description 删除指定索引的元素
     * @param
     * @return
     */
    public E remove(int index){
        checkIndexRange(index);
        Node<E> node = firstNode;
        if (0==index){
            firstNode = firstNode.next;
        }else{
            Node<E> preNode = node(index - 1);
            node = preNode.next;
            preNode.next=node.next;
        }
        size--;
        return node.element;
    }

    //清空元素
    public void clear(){
        size=0;
        firstNode=null;
    }

    //返回指定索引所在位置的元素
    private Node<E> node(int index){
        checkIndexRange(index);
        Node<E> node = firstNode;
        for (int i = 0; i < index ; i++) {
            node = node.next;
        }
        return node;
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        Node<E> node = firstNode;
        str.append("size=").append(size).append(",[");
        for (int i = 0; i <size ; i++) {
            if(i!=0){
                str.append(",");
            }
            str.append(node.element);
            node = node.next;
            /*if(i!=size-1){
                str.append(",");
            }*/
        }
        str.append("]");
        return str.toString();
    }
}
