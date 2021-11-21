package com.company;

public class Circle {
        int R, n;
        double l, S, P;

        public Circle (int R, int n){
                this.R = R;
                this.n = n;
        }

        public void Curve(int R, int n){
                l = (3.14 * R * n) / 180;
        }

        public double GetCurve(){
                return this.l;
        }

        public String toString(){
                return "l: " + this.l + "R: " + R;
        }
}
