package Classes;

import java.awt.*;

import Enumerators.TypeOfGearBox;
import Enumerators.TypeOfBody;
import Enumerators.TypeOfFuel;

public abstract class Car {
    private String name;
    private String model;
    private Color color;
    private TypeOfBody typeOfBody;
    private int numOfWheels;
    private TypeOfGearBox typeOfGearBox;
    private TypeOfFuel typeOfFuel;
    private float engCapacity;

    public Car(String name, String model, Color color, TypeOfBody typeOfBody, int numOfWheels,
            TypeOfGearBox typeOfGearBox, TypeOfFuel typeOfFuel, float engCapacity) {
        this.name = name;
        this.model = model;
        this.color = color;
        this.typeOfBody = typeOfBody;
        this.numOfWheels = numOfWheels;
        this.typeOfGearBox = typeOfGearBox;
        this.typeOfFuel = typeOfFuel;
        this.engCapacity = engCapacity;
    }

    public void movement() {
    }

    public void maintenance() {
    }

    public boolen turnLight() {
        return true;
    }

    public boolen turnWipers() {
        return true;
    }

    public String getName() {
        return name;
    }

    public String getModel() {
        return model;
    }

    public Color getColor() {
        return color;
    }

    public TypeOfBody getTypeOfBody() {
        return typeOfBody;
    }

    public int getNumOfWheels() {
        return numOfWheels;
    }

    public TypeOfGearBox getTypeOfGearBox() {
        return typeOfGearBox;
    }

    public TypeOfFuel getTypeOfFuel() {
        return typeOfFuel;
    }

    public float getEngCapacity() {
        return engCapacity;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public void setTypeOfBody(TypeOfBody typeOfBody) {
        this.typeOfBody = typeOfBody;
    }

    public void setNumOfWheels(int numOfWheels) {
        this.numOfWheels = numOfWheels;
    }

    public void setTypeOfGearBox(TypeOfGearBox typeOfGearBox) {
        this.typeOfGearBox = typeOfGearBox;
    }

    public void setTypeOfFuel(TypeOfFuel typeOfFuel) {
        this.typeOfFuel = typeOfFuel;
    }

    public void setEngCapacity(float engCapacity) {
        this.engCapacity = engCapacity;
    }

}