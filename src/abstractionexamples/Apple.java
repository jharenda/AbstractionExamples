/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractionexamples;

/**
 *
 * @author Jennifer
 */
public class Apple extends Fruit {

    private final static String genus = "MALUS";
    private String shape;
    private String color;
    private int count;
    private String fruitClassification;

    @Override
    public void setShape(String shape) {

        this.shape = shape;
    }

    @Override
    public String getShape() {
        return shape;
    }

    @Override
    public void disperseSeeds() {
        System.out.println("I am an apple and have different seeds.");
    }

    @Override
    public void photosynthesize() {
        System.out.println("I am an apple and have different levels of cholorphyll.");
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String getFruitClassification() {
        return fruitClassification;
    }

    @Override
    public void setFruitClassification(String fruitClassification) {
        this.fruitClassification = fruitClassification;
    }
}
