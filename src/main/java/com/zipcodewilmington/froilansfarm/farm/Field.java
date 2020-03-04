package com.zipcodewilmington.froilansfarm.farm;

import com.zipcodewilmington.froilansfarm.crop.Crop;

import java.security.PublicKey;

public class Field {
    CropRow row1;
    CropRow row2;
    CropRow row3;
    CropRow row4;
    CropRow row5;

    public Field(){

    }
    public CropRow getCropRow(Integer rowNum){
        if(rowNum == 1){
            return row1;
        }else if(rowNum == 2){
            return row2;
        }else if(rowNum == 3){
            return row3;
        }else if(rowNum == 4){
            return row4;
        }else{
            return row5;
        }
    }
    public void setCropRow(Integer rowNum, Crop cropType){

        if(rowNum == 1){
            if(isEmpty(row1)){
                row1.setCropType(cropType);
            }
        }else if(rowNum == 2){
            if(isEmpty(row2)){
                row2.setCropType(cropType);
            }
        }else if(rowNum == 3){
            if(isEmpty(row3)){
                row3.setCropType(cropType);
            }
        }else if(rowNum == 4){
            if(isEmpty(row4)){
                row4.setCropType(cropType);
            }
        }else{
            if(isEmpty(row5)){
                row5.setCropType(cropType);
            }
        }
    }
    public Boolean isEmpty(CropRow rowToCheck){
       if(rowToCheck ==  null){
           return true;
       }else{
           return false;
       }
    }
}

