package com.CoryG118.PhysiqueTrackerFullstack;
// Model

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class PhysiqueEntry {

    @Id
    @GeneratedValue
    private Long id;
    private String date;
    private double weight;
    private double neck;
    private double chest;
    private double lArm;
    private double rArm;
    private double waist;
    private double navel;
    private double lLeg;
    private double rLeg;

    // Constructors
    public PhysiqueEntry(){} //Default

    public PhysiqueEntry(String date, double weight, double neck, double chest, double lArm,
                         double rArm, double waist, double navel, double lLeg, double rLeg){
        this.date = date;
        this.weight = weight;
        this.neck = neck;
        this.chest = chest;
        this.lArm = lArm;
        this.rArm = rArm;
        this.waist = waist;
        this.navel = navel;
        this.lLeg = lLeg;
        this.rLeg = rLeg;
    }

    //Getters and Setters

    public Long getId(){
        return id;
    }

    public String getDate(){
        return date;
    }

    public double getWeight() {
        return weight;
    }

    public double getNeck(){
        return neck;
    }
    public double getChest(){
        return chest;
    }
    public double getLArm(){
        return lArm;
    }
    public double getRArm(){
        return rArm;
    }
    public double getWaist(){
        return waist;
    }
    public double getNavel(){
        return navel;
    }
    public double getLLeg(){
        return lLeg;
    }
    public double getRLeg(){
        return rLeg;
    }

    public void setDate(String date){
        this.date = date;
    }
    public void setWeight(double weight){
        this.weight = weight;
    }
    public void setNeck(double neck){
        this.neck = neck;
    }
    public void setChest(double chest){
        this.chest = chest;
    }
    public void setLArm(double lArm){
        this.lArm = lArm;
    }
    public void setRArm(double rArm){
        this.rArm = rArm;
    }
    public void setWaist(double waist){
        this.waist = waist;
    }
    public void setNavel(double navel){
        this.navel = navel;
    }
    public void setLLeg(double lLeg){
        this.lLeg = lLeg;
    }
    public void setRLeg(double rLeg){
        this.rLeg = rLeg;
    }
}
