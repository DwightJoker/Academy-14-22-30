package by.academy.lessons1to15.lesson12;

public class Box<T> {

    private T[] items;
    private T item;
    private static int current = 0;

    public Box() {
        super();

        this.items = (T[]) new Object[10];
    }

    public Box(T[] items) {
        this.items = items;
    }

    public Box(T item){
        this.item = item;
    }

    public T get() {
        return item;
    }

    public void set(T item) {
        this.item = item;
    }
    public void add(T item) {
        if(items == null) {
            this.items = (T[]) new Object[10];
        }

        if (items.length <= current) {
            grow();
        }

        items[current++] = item;
    }
    private void grow(){
        T[] temp = (T[]) new Object[items.length * 2 + 1];
        System.arraycopy(items, 0, temp,0, items.length);
        items = temp;
    }

    public void print() {
        for (int i = 0; i < current; i++) {
            System.out.println(items[i]);
        }
    }
}
