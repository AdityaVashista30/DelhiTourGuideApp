package com.example.android.tourguideapp;

public class LocationInfo {
    private int locName;
    private int locDescrition;
    private int imgId;
    private int locRating;
    public LocationInfo(int text1, int text2,int text3,int id){
        locName=text1;
        locDescrition=text2;
        locRating=text3;
        imgId=id;}
    public int getLocName(){return locName;}
    public int getLocDescrition(){return locDescrition;}
    public int getLocRating(){return locRating;}
    public int getImgId(){return imgId;}
}
