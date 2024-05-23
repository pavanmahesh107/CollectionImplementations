package ArrayListInternalImplemmentations;

public class MyArrayList<T> {  //The type parameter T allows to store elements of any type.

    private static final int DEFAULT_CAPACITY = 10;
    private Object[] elementData;
    private int size = 0;

    //Constructor
    public MyArrayList() {
        elementData = new Object[DEFAULT_CAPACITY];
    }

    //Get method
    public T get(int index) {
        if (index >= size || index < 0) {
            throw new IndexOutOfBoundsException("Index:" + index + ",Size:" + size);
        }
        return (T) elementData[index];
    }

    //Add method
    public void add(T t) {
        if (size == elementData.length) {
            Grow();
        }
        elementData[size++] = t;
    }

    //Grow method
    public void Grow() { //Helps the Add method by providing some new capacity that is 1.5 time of the old capacity.
        int newCapacity = elementData.length * 3 / 2 + 1;
        Object[] newArray = new Object[newCapacity];
        System.arraycopy(elementData, 0, newArray, 0, elementData.length);
        elementData = newArray;
    }

    public int size() {
        return size;
    }
}

