package task52;

import java.util.LinkedList;

public class NewCollection <E>
{
    LinkedList<E> linkedList = new LinkedList();

    int size()
    {
        return (linkedList.size());
    }

    void add(E item)
    {
        linkedList.add(item);
    }

    void remove(int index)
    {
        linkedList.remove(index);
    }

    void remove(E item)
    {
        linkedList.remove(item);
    }

    E get(int index)
    {
        return(linkedList.get(index));
    }

    void clear()
    {
        linkedList.clear();
    }

}
