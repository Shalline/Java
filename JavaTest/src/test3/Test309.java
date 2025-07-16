package test3;

/*
 * 날짜 : 2025/07/16
 * 이름 : 김철학
 * 내용 : 추상클래스 연습문제
*/
abstract class Shape {   // ??? 부분: abstract class
    public abstract void draw();
}

class Triangle extends Shape {   // Triangle도 Shape 상속
    @Override
    public void draw() {
        System.out.println("draw Triangle!");
    }
}

class Circle extends Shape {     // Circle도 Shape 상속
    @Override
    public void draw() {
        System.out.println("draw Circle!");
    }
}

public class Test309 {
    public static void main(String[] args) {
        Test309 here = new Test309();
        Circle circle = new Circle();
        Triangle triangle = new Triangle();
        here.draw(circle);
        here.draw(triangle);
    }
    
    public void draw(Shape obj) {   // 빈칸: Shape 타입 매개변수
        obj.draw();
    }
}
