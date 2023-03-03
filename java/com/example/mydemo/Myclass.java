package com.example.mydemo;

public class Myclass
{
    private String name;
    private boolean selected;

    public Myclass(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean isSelected() {
        return selected;
    }

    public void setSelected(boolean selected) {
        this.selected = selected;
    }
}
