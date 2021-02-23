package com.wahyu.biosisko.Riddles.model;

import android.os.Parcel;
import android.os.Parcelable;

public class jawabanRiddles5 implements Parcelable{
    private String soal51;

    public jawabanRiddles5(Parcel in) {
        soal51 = in.readString();
    }

    public static final Creator<jawabanRiddles5> CREATOR = new Creator<jawabanRiddles5>() {
        @Override
        public jawabanRiddles5 createFromParcel(Parcel in) {
            return new jawabanRiddles5(in);
        }

        @Override
        public jawabanRiddles5[] newArray(int size) {
            return new jawabanRiddles5[size];
        }
    };


    public String getSoal51() {
        return soal51;
    }

    public void setSoal51(String soal51) {
        this.soal51 = soal51;
    }


    public jawabanRiddles5(String soal51) {
        this.soal51 = soal51;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(soal51);
    }
}
