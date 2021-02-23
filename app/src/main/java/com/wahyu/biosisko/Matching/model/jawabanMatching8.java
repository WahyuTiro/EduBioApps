package com.wahyu.biosisko.Matching.model;

import android.os.Parcel;
import android.os.Parcelable;

public class jawabanMatching8 implements Parcelable{
    private String soal81;

    public jawabanMatching8(Parcel in) {
        soal81 = in.readString();
    }

    public static final Creator<jawabanMatching8> CREATOR = new Creator<jawabanMatching8>() {
        @Override
        public jawabanMatching8 createFromParcel(Parcel in) {
            return new jawabanMatching8(in);
        }

        @Override
        public jawabanMatching8[] newArray(int size) {
            return new jawabanMatching8[size];
        }
    };


    public String getSoal81() {
        return soal81;
    }

    public void setSoal81(String soal81) {
        this.soal81 = soal81;
    }


    public jawabanMatching8(String soal81) {
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
