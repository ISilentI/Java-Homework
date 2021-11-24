package com.company;

public class Spitz extends Dog {

    private String cute;

    public Spitz(int age, double weight, int height, String cute){
        super(2, 2.2, 18);
        this.cute = cute;
    }

    public String getCute() {
        return cute;
    }

    public void setCute(String cute) {
        this.cute = cute;
    }

    @Override
    public String toString(){
        return "Spitz: " + super.toString() + " Level of cute: | " + this.cute + "| ";
    }
}
