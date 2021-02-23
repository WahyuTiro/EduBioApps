package com.wahyu.biosisko.Riddles.model;

import android.os.Parcel;
import android.os.Parcelable;

public class jawabanRiddles8 implements Parcelable{
    private String soal81;

    public jawabanRiddles8(Parcel in) {
        soal81 = in.readString();
    }

    public static final Creator<jawabanRiddles8> CREATOR = new Creator<jawabanRiddles8>() {
        @Override
        public jawabanRiddles8 createFromParcel(Parcel in) {
            return new jawabanRiddles8(in);
        }

        @Override
        public jawabanRiddles8[] newArray(int size) {
            return new jawabanRiddles8[size];
        }
    };


    public String getSoal81() {
        return soal81;
    }

    public void setSoal81(String soal81) {
        this.soal81 = soal81;
    }


    public jawabanRiddles8(String soal81) {
        this.soal81 = soal81;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(soal81);
    }
}
