package com.wipro.java.buildpattern;

//Engine.java
public class Engine {
 private final double volume;
 private double mileage;

 public Engine(double volume, double mileage) {
     this.volume = volume;
     this.mileage = mileage;
 }

 public double getVolume() {
     return volume;
 }

 public double getMileage() {
     return mileage;
 }
}

