package com.wahyu.biosisko.Matching.model;

import android.os.Parcel;
import android.os.Parcelable;

public class jawabanMatching5 implements Parcelable{
    private String soal51;

    public jawabanMatching5(Parcel in) {
        soal51 = in.readString();
    }

    public static final Creator<jawabanMatching5> CREATOR = new Creator<jawabanMatching5>() {
        @Override
        public jawabanMatching5 createFromParcel(Parcel in) {
            return new jawabanMatching5(in);
        }

        @Override
        public jawabanMatching5[] newArray(int size) {
            return new jawabanMatching5[size];
        }
    };


    public String getSoal51() {
        return soal51;
    }

    public void setSoal51(String soal51) {
        this.soal51 = soal51;
    }


    public jawabanMatching5(String soal51) {
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
