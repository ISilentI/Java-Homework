package com.company;

public class Circle {
        private double R, n;
        private double l = 0;
        private String color;


        public Circle (int R, int n, String color){
                this.R = R;
                this.n = n;
                this.color = color;
        }

        public void Curve(int R, int n){
                this.l = 3.14 * R * n / 180;
        }

        public void SetRadius(double R){
                this.R = R;
        }

        public void SetAngle(double n) {
                this.n = n;
        }

        public void setColor(String color) {
                this.color = color;
        }

        public double getRadius() {
                return R;
        }

        public double getAngle() {
                return n;
        }

        public String getColor() {
                return color;
        }

        public String toString(){
                return "/Curve: " + this.l + " /Radius: " + this.R + " /Color: " + this.color;
        }
}
