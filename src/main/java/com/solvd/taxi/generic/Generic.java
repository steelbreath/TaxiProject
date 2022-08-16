package com.solvd.taxi.generic;

public class Generic <T> {
        private T t;

        public Generic(){}
        public Generic(T t){
            this.t = t;
        }

        public void setT(T t) {
            this.t = t;
        }

        public T getT() {
            return t;
        }

}
