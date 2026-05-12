package es.uniovi.reflection.obj_50;

import java.util.List;
import java.util.ArrayList;

import java.util.AbstractList;
import java.util.Arrays;

// Now extending AbstractList
public class InmutableMethodsSimpleList<E> extends AbstractList<E> {

    private Object[] data;
    private int size;

    private static final int INITIAL_CAPACITY = 10;

    // --- Constructors ---

    public InmutableMethodsSimpleList() {
        this.data = new Object[INITIAL_CAPACITY];
        this.size = 0;
    }

    // --- Core List Methods (Required by AbstractList) ---

    /**
     * Retrieves the element at the specified position in this list.
     * Required to be implemented by AbstractList.
     * Note: AbstractList handles the index check (rangeCheck).
     */
    @Override
    @SuppressWarnings("unchecked")
    public E get(int index) {
        // AbstractList handles the size() check before calling this method.
        // We just need to check the array boundaries if necessary, but AbstractList's rangeCheck does it.
        return (E) data[index];
    }

    /**
     * Returns the number of elements in this list.
     * Required to be implemented by AbstractList.
     */
    @Override
    public int size() {
        return size;
    }

    // --- Mutation Methods (Overridden from AbstractList) ---

    /**
     * Appends the specified element to the end of this list.
     * Overrides the AbstractList implementation.
     */
    @Override
    public boolean add(E element) {
        // We must increment modCount manually since we are overriding add(E e).
        // The add(int index, E element) method in AbstractList handles modCount,
        // but this one (which calls add(size, element)) doesn't, so we add it here.
//        modCount++;
//
//        ensureCapacity(size + 1);
//        data[size++] = element;

        return true;
    }

    /**
     * Removes the element at the specified position in this list.
     * Overrides the AbstractList implementation.
     */
    @Override
    @SuppressWarnings("unchecked")
    public E remove(int index) {
        // AbstractList's remove(int index) handles the index check (rangeCheck) and modCount increment.

//        E removedElement = (E) data[index];
//
//        // Calculate how many elements need to be shifted
//        int numShifted = size - index - 1;
//
//        if (numShifted > 0) {
//            // Shift elements efficiently using System.arraycopy
//            System.arraycopy(data, index + 1, data, index, numShifted);
//        }
//
//        // Decrease size and clear the last reference (for Garbage Collection)
//        data[--size] = null;

//        return removedElement;
        return null;
    }

    // --- Internal Utility Methods (Same as before) ---

    private void ensureCapacity(int minCapacity) {
        if (minCapacity > data.length) {
            grow(minCapacity);
        }
    }

    private void grow(int minCapacity) {
        int oldCapacity = data.length;
        // New capacity = Old Capacity * 1.5
        int newCapacity = oldCapacity + (oldCapacity >> 1);

        if (newCapacity < minCapacity) {
            newCapacity = minCapacity;
        }

        data = Arrays.copyOf(data, newCapacity);
        System.out.println("DEBUG: Array resized to capacity " + newCapacity);
    }
}