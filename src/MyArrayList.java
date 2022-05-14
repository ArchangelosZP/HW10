import java.util.*;

public class MyArrayList<T> implements List<T> {

    private T[] arr = (T[]) new Object[0];

    @Override
    public String toString() {
        String s="";
        for (int i = 0; (i <= arr.length - 1); i++) {
            if (arr[i] == null) {
                s = s + "null ";
            } else
                s = s + arr[i].toString()+" ";
        }
        return s;
    }

    @Override
    public boolean add(T element) {
        T[] newArray = (T[]) new Object[arr.length + 1];
        System.arraycopy(arr, 0, newArray, 0, arr.length);
        arr = newArray;
        arr[arr.length - 1] = element;
        return true;
    }

    @Override
    public void add(int index, T element) {
        if (index > arr.length - 1) {
            T[] newArray = (T[]) new Object[index + 1];
            System.arraycopy(arr, 0, newArray, 0, arr.length);
            arr = newArray;
            arr[index] = element;
        } else {
            T[] newArray = (T[]) new Object[arr.length + 1];
            System.arraycopy(arr, 0, newArray, 0, arr.length);
            arr = newArray;
            for (int i = arr.length; i > index; i--) {
                arr[i - 1] = arr[i - 2];
            }
            arr[index] = element;
        }
    }

    @Override
    public boolean addAll(Collection<? extends T> c) {
        return addAll(arr.length, c);
    }

    @Override
    public boolean addAll(int index, Collection c) {
        T[] arrForAdd = (T[]) c.toArray();
        if (index < 0) {
            return false;
        }
        if (index > arr.length - 1) {
            int newLen = index + arrForAdd.length;
            T[] newArray = (T[]) new Object[newLen];
            System.arraycopy(arr, 0, newArray, 0, arr.length);
            arr = newArray;
            for (int i = 0; i < arrForAdd.length; i++) {
                arr[index + i] = arrForAdd[i];
            }
            return true;
        } else {
            int newLen = arr.length + arrForAdd.length;
            T[] newArray = (T[]) new Object[newLen];
            System.arraycopy(arr, 0, newArray, 0, arr.length);
            arr = newArray;
            for (int i = newLen; i > index + arrForAdd.length; i--) {
                arr[i - 1] = arr[i - 1 - arrForAdd.length];
            }
            int ii = 0;
            for (int i = index; i < index + arrForAdd.length; i++) {
                arr[i] = arrForAdd[ii];
                ii++;
            }
            return true;
        }

    }

    @Override
    public T get(int index) {
        return arr[index];
    }

    @Override
    public T set(int index, T element) {
        arr[index]=element;
        return arr[index];
    }

    @Override
    public int indexOf(Object o) {
        for (int i=0;i<arr.length;i++){
            if (o.equals(arr[i])) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public int lastIndexOf(Object o) {
        int fIndex=-1;
        for (int i=0;i<arr.length;i++){
            if (o.equals(arr[i])) {
                fIndex = i;
            }
        }
        return fIndex;
    }

    @Override
    public T remove(int index) {
        T delEl = arr[index];
        for (int i = index; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }
        T[] newArray = (T[]) new Object[arr.length - 1];
        System.arraycopy(arr, 0, newArray, 0, newArray.length);
        arr = newArray;
        return delEl;
    }

    @Override
    public List<T> subList(int fromIndex, int toIndex) {
        T[] sList = (T[]) new Object[toIndex-fromIndex];
        int ii=0;
        for (int i=fromIndex;i<toIndex;i++){
            sList[ii]=arr[i];
            ii++;
        }
        return Arrays.asList(sList);
    }

    @Override
    public int size() {
        return arr.length;
    }

    @Override
    public boolean isEmpty() {
        return arr.length == 0;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public Iterator iterator() {
        return null;
    }

    @Override
    public T[] toArray() {
        return arr;
    }



    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public void clear() {
        arr = (T[]) new Object[0];
    }

    @Override
    public ListIterator listIterator() {
        return null;
    }

    @Override
    public ListIterator listIterator(int index) {
        return null;
    }

    @Override
    public boolean retainAll(Collection c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection c) {
        return false;
    }

    @Override
    public boolean containsAll(Collection c) {
        return false;
    }

    @Override
    public Object[] toArray(Object[] a) {
        return new Object[0];
    }

}
