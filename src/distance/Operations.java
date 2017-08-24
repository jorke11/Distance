/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package distance;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author pinedo
 */
public class Operations {

    public double y, x, result;
    public double y2, x2;

    public Operations() {
    }

    public Operations(double x, double y) {
        this.y = y;
        this.x = x;
    }

    public Operations(double x, double y, double x2, double y2, double result) {
        this.y = y;
        this.x = x;
        this.result = result;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY2() {
        return y2;
    }

    public void setY2(double y2) {
        this.y2 = y2;
    }

    public double getX2() {
        return x2;
    }

    public void setX2(double x2) {
        this.x2 = x2;
    }

    public double getResult() {
        return result;
    }

    public double getDistance(Operations data) {
        return Math.sqrt(Math.pow((x - data.getX()), 2) + Math.pow((y - data.getY()), 2));
    }

    public double compareDistance(Operations[] data) {

        System.out.println("Compare distance");
        List<Operations> alldistance = new ArrayList();

        for (int i = 0; i < data.length; i++) {
            System.out.println(i);
            for (int j = 0; j < data.length; j++) {
                if (i != j) {
//                    System.out.println("x" + i + ": " + data[i].getX() + " x" + j + ": " + data[j].getX() + " distance " + data[i].getDistance(data[j]));
                    alldistance.add(new Operations(data[i].getX(), data[i].getY(), data[j].getX2(), data[j].getY2(), data[i].getDistance(data[j])));
                }
            }

        }

//        for (int i = 0; i < alldistance.size(); i++) {
//            System.out.println("x" + alldistance.get(i).getX() + " y:" + alldistance.get(i).getY() + " dist:" + alldistance.get(i).getResult());
//
//        }
        return mininus(alldistance);
    }

    public double mininus(List<Operations> data) {
        double max = 0;
        for (int i = 0; i < data.size(); i++) {
            if (data.get(i).getResult() > max) {
                max = data.get(i).getResult();
            }
        }
        double min = max;
        for (int i = 0; i < data.size(); i++) {
            if (data.get(i).getResult() < min) {
                min = data.get(i).getResult();
            }
        }
        return min;
    }

}
