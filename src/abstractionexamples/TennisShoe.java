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
public class TennisShoe extends Footwear {

    private final static boolean HAS_LACES = true;
    private String material = "canvas";
    private double productionCost = 5.23;
    private double size;
    private String color;

    @Override
    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public void lace() {
        System.out.println("Not all Footwear has laces");
    }

    @Override
    public double getProductionCost() {
        return productionCost;
    }

    @Override
    public void setProductionCost(double productionCost) {
        this.productionCost = productionCost;
    }

    @Override
    public void setSize(double size) {
        this.size = size;
    }

    @Override
    public double getSize() {
        return size;
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
    public void make() {
        System.out.println("Make sure that my shoes are made.");
    }
}
