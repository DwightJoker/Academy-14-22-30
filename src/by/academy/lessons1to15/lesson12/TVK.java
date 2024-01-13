package by.academy.lessons1to15.lesson12;

import by.academy.lessons1to15.lesson9.Animal;

import java.io.Serializable;

public class TVK<T extends Comparable <String>,V extends Animal & Serializable,K extends Number> {

        private T t;
        private V v;
        private K k;

    public TVK(T transport, V value, K key) {
        this.t = transport;
        this.v = value;
        this.k = key;
    }

    public TVK() {

    }

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    public V getV() {
        return v;
    }

    public void setV(V v) {
        this.v = v;
    }

    public K getK() {
        return k;
    }

    public void setK(K k) {
        this.k = k;
    }
    public void printAll() {
        System.out.println(t.getClass().toString());
        System.out.println(v.getClass().toString());
        System.out.println(k.getClass().toString());
    }
    public void printT() {
        System.out.println(t.getClass().toString());
    }
    public void printV() {
        System.out.println(v.getClass().toString());
    }
    public void printK() {
        System.out.println(k.getClass().toString());
    }
}
