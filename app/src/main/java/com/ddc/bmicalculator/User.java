package com.ddc.bmicalculator;

import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;

public class User extends BaseObservable {

    private String age;
    private String feet;
    private String inches;
    private String weight;

    public User(String age, String feet, String inches, String weight) {
        this.age = age;
        this.feet = feet;
        this.inches = inches;
        this.weight = weight;

    }

    @Bindable
    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
        notifyPropertyChanged(BR.age);
    }

    @Bindable
    public String getFeet() {
        return feet;
    }

    public void setFeet(String feet) {
        this.feet = feet;
        notifyPropertyChanged(BR.feet);
    }

    @Bindable
    public String getInches() {
        return inches;
    }

    public void setInches(String inches) {
        this.inches = inches;
        notifyPropertyChanged(BR.inches);
    }

    @Bindable
    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
        notifyPropertyChanged(BR.weight);
    }
}
