package by.academy.lessons1to15.lesson12;

import by.academy.lessons1to15.lesson9.Cat;

public class CatBox {

    private Cat cat;
    public CatBox(Cat cat){
        this.cat = cat;
    }

    public Cat getCat(){
        return cat;
    }

    public void setCat(Cat cat) {
        this.cat = cat;
    }
}
