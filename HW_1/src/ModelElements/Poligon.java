package ModelElements;

import java.util.ArrayList;
import java.util.List;

import Stuff.Point3D;

public class Poligon {
    public List<Point3D> points = new ArrayList<Point3D>();

    /**
     * конструктор
     * 
     * @param point
     *
     * добавляем один элемент в список poligon
     */
    public Poligon(Point3D point) {
        point.add(point);
    }

}
