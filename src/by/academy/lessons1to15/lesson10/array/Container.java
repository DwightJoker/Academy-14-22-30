package by.academy.lessons1to15.lesson10.array;

public class Container {

    public Tomato[] tomatos;
    private int current;

    public void delete(int index){
        if (index < 0 || index >= current) {
            System.out.println("Введен неправильный индекс");
            return;
        }
        if (index != tomatos.length -1) {
            System.arraycopy(tomatos, index, tomatos, index + 1, tomatos.length - index - 1);
        }
        tomatos[current-- - 1] = null;

    }

    public void grow() {
        Tomato[] newTomatos = new Tomato[tomatos.length * 2 + 1];
        System.arraycopy(tomatos, 0, newTomatos, 0, tomatos.length);
        tomatos = newTomatos;
    }

    public void add(Tomato tomato){
        if (tomatos == null) {
            tomatos = new Tomato[10];
            current = 0;
        }
        if (current >= tomatos.length) {
            grow();
        }

        tomatos[current++] = tomato;

    }
    public void print() {
        for (int i = 0; i < current; i++) {
            System.out.println(tomatos[i]);
        }
    }

}
