package com.company.points;

class MyPoint {
    int x;
    int y;
    public MyPoint(){
        this.x=0;
        this.y=0;
    }


    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public double distance(int x, int y){
        double k=Math.sqrt((x-this.x)*(x-this.x) + ((y-this.y)*(y-this.y)));
        return k;
    }
    public double distance(MyPoint obj){
        double k=Math.sqrt((obj.x-this.x)*(obj.x-this.x) + ((obj.y-this.y)*(obj.y-this.y)));
        return k;
    }

    @Override
    public String toString() {
        return "(" + this.x + "," + this.y + ")";
    }
}

class TestMyPoint{
    public static void main(String[] args) {
        MyPoint obj1 = new MyPoint();
        MyPoint obj2 = new MyPoint(4,5);
        MyPoint obj3 = new MyPoint(1,1);
        System.out.println(obj2.distance(3,4));
        System.out.println(obj2.distance(obj3));

    }
}
