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

        public void Square(int R){
                S = 3.14 * R * R;
        }

        public void Perimeter(int R){
                P = 2 * 3.14 * R;
        }


        public double GetCurve(){
                return this.l;
        }

        public double GetSquare(){
                return this.S;
        }

        public double GetPerimeter(){
                return P;
        }
}
