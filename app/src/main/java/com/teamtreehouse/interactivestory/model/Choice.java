package com.teamtreehouse.interactivestory.model;


public class Choice {
    private int imageId;
    private int textId;

    public Choice(int imageId, int textId) {
        this.imageId = imageId;
        this.textId = textId;
    }

    public int getImageId() {
        return imageId;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }

    public int getTextId() {
        return textId;
    }

    public void setTextId(int textId) {
        this.textId = textId;
    }
}
