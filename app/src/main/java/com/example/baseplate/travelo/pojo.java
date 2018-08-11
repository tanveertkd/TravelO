package com.example.baseplate.travelo;

public class pojo {
    private int imageID;
    private String headerID;
    private int gradientID;

    public pojo(String headerResourceID, int imageResourceID, int gradientResourceID){
        headerID = headerResourceID;
        imageID = imageResourceID;
        gradientID = gradientResourceID;
    }

    public int getImageResource(){
        return imageID;
    }
    public int getGradientResource(){
        return gradientID;
    }
    public String getHeaderResource() {
        return headerID;
    }
}
