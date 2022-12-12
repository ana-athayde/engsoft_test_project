package com.example;

public class Image {

    private int Height;
    private int Width;
    private ImageType ImageType;

    public Image() {

    }

    public Image(int Height, int Width, ImageType ImageType) {
        this.Height = Height;
        this.Width = Width;
        this.ImageType = ImageType;
    }

    public int getHeight() {
        return this.Height;
    }

    public void setHeight(int Height) {
        this.Height = Height;
    }

    public int getWidth() {
        return this.Width;
    }

    public void setWidth(int Width) {
        this.Width = Width;
    }

    public ImageType getImageType() {
        return this.ImageType;
    }

    public void setImageType(ImageType ImageType) {
        this.ImageType = ImageType;
    }

    @Override
    public String toString() {
        return "{" +
            " Height='" + getHeight() + "'" +
            ", Width='" + getWidth() + "'" +
            ", ImageType='" + getImageType() + "'" +
            "}";
    }
}