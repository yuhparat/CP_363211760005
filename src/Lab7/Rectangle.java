package Lab7;

public class Rectangle {
    //attributes
    private double length;
    private double width;

    //constructor คือ เมธอดที่มัชื่อเดียวกันกัชบ class
    //default constructor
    public Rectangle(){}

    //design constructor
    public Rectangle (double length,double width){
        this.length = length;
        this.width = width;

    }
    //getter and setter methods
    //getter ใช้อ่านข้อมุลใน attributer ของ class
    //setter ใช้ปรับปรุงหรือเปลื่ยนแปลงข้อมุลใน attributer ของ class

    public double getLength(){
        return this.length;
    }
    public void setLength(double length){
        this.length = length;
    }


    public double getWidth(){
        return this.width;
    }
    public void setWidth(double width){
        this.width = width;
    }
    //find area
    public double getArea(){
        return this.length*this.width;
    }

}//class
