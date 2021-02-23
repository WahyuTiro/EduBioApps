package com.wahyu.biosisko.Matching.model;

import android.os.Parcel;
import android.os.Parcelable;

public class jawabanMatching1 implements Parcelable{
    private String soal11;

    public jawabanMatching1(Parcel in) {
        soal11 = in.readString();
    }

    public static final Creator<jawabanMatching1> CREATOR = new Creator<jawabanMatching1>() {
        @Override
        public jawabanMatching1 createFromParcel(Parcel in) {
            return new jawabanMatching1(in);
        }

        @Override
        public jawabanMatching1[] newArray(int size) {
            return new jawabanMatching1[size];
        }
    };


    public String getSoal11() {
        return soal11;
    }

    public void setSoal11(String soal11) {
        this.soal11 = soal11;
    }


    public jawabanMatching1(String soal11) {
        this.soal11 = soal11;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(soal11);
    }
}
