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
public abstract class Footwear implements ManMadeItem {
private final static String maker = "Coobler";
    private String use = "foot protection";
    private String color;
    private double size;

    @Override
    public String getUse() {
        return use;

    }

    @Override
    public void setUse(String use) {
        this.use = use;
    }

    public void resole() {
        System.out.println("All footwear can be resoled.");
    }
  public abstract void make();
    
    public static String getMaker() {
        return maker;
    }

    public abstract void setColor(String color);

    public abstract String getColor();

    public abstract void setSize(double size);

    public abstract double getSize();
}
