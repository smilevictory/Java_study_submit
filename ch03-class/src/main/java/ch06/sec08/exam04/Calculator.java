package ch06.sec08.exam04;

public class Calculator {
    // 정사각형의 넓이를 구하는 메서드
    double areaRectangle(double width) {
        return width * width;
    }

    // 직사각형의 넓이를 구하는 메서드 (오버로딩)
    double areaRectangle(double width, double height) {
        return width * height;
    }
}
