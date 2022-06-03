package com.company.MockData;

import com.company.Circle;

import java.util.List;

public class CircleData {
    private final Circle c01 = new Circle(15);
    private final Circle c02 = new Circle(10);
    private final Circle c03 = new Circle(14);
    private final Circle c04 = new Circle(24);
    private final Circle c05 = new Circle(41);
    private final Circle c06 = new Circle(55);
    private final Circle c07 = new Circle(89);
    private final Circle c08 = new Circle(26);
    private final Circle c09 = new Circle(23);
    private final Circle c10 = new Circle(34);

    private List<Circle> circles = List.of(c01, c02, c03, c04, c05, c06, c07, c08, c09, c10);

    private List<Circle> someCircles = List.of(c01, c02);

    public List<Circle> getCircles() {
        return circles;
    }

    public List<Circle> getSomeCircles() {
        return someCircles;
    }
}
