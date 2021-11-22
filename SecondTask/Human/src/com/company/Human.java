package com.company;

public class Human {
    private String name;
    private int age, height, weight;

    public Human(String name, int age, int height, int weight){
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getHeight() {
        return height;
    }

    public int getWeight() {
        return weight;
    }

    public String toString(){
        return 
    }
}

class Head extends Human {

    private int sizeh;

        public Head(int sizeh){
            super("Nick", 15, 164, 53);
            this.sizeh = sizeh;
    }

    public void SetSizeh(int sizeh){
        this.sizeh = sizeh;
    }

    public int GetSizeh(int sizeh){
        return this.sizeh;
    }

}

class Leg extends Human {

    private int sizel;

        public Leg(int sizel){
            super("Nick", 15, 164, 53);
            this.sizel = sizel;
        }

    public void SetSizel(int sizel){
            this.sizel = sizel;
    }

    public int GetSizel(int sizel){
            return this.sizel;
    }

}

class Hand extends Human {

    private int sizehh;

        public Hand(int sizehh){
            super("Nick", 15, 164, 53);
            this.sizehh = sizehh;
        }

    public void SetSizehh(int sizehh){
            this.sizehh = sizehh;
    }

    public int GetSizehh(int sizehh){
            return this.sizehh;
    }

}
