package com.it_2.customArrayList;

import java.util.Arrays;

public class CustomArrayList<T> {
    private int arraySize = 10;
    private int cut = 4;
    private Object[] array = new Object[arraySize];
    private int index = 0;

    public void add(T element) {
        if (index == array.length - 1)
            resize(array.length * 2);
        array[index++] = element;
    }

    public void add(int index, T element) {
        while (array.length <= index) {
            resize(array.length * 2);
        }

        for (int i = this.index; i > index; i--) {
            array[i] = array[i - 1];
        }
        array[index] = element;
        if (index > this.index) {
            this.index = index + 1;
        } else {
            this.index++;
        }
    }

    private void resize(int newSize) {
        Object[] newArray = new Object[newSize];
        System.arraycopy(array, 0, newArray, 0, index);
        array = newArray;
    }

    public T get(int index) {
        checkIndex(index, 0);
        return (T) array[index];
    }

    public T set(int index, T element) {
        checkIndex(index, 0);
        var oldElement = get(index);
        array[index] = element;
        return oldElement;
    }

    public T remove(int index) {
        checkIndex(index, 0);

        var oldElement = get(index);

        for (int i = index; i < this.index; i++) {
            array[i] = array[i + 1];
        }

        array[this.index] = null;
        this.index--;

        if (array.length > arraySize && this.index < array.length / cut) {
            resize(array.length / 2);
        }

        return oldElement;
    }

    public int size() {
        return index;
    }

    private void checkIndex(int index, int min) {
        if (index < min || index > array.length - 1) {
            throw new ArrayIndexOutOfBoundsException("Invalid index: " + index);
        }
    }

    @Override
    public String toString() {
        return Arrays.toString(array);
    }
}
