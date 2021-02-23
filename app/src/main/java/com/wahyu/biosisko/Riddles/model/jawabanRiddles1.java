package com.wahyu.biosisko.Riddles.model;

import android.os.Parcel;
import android.os.Parcelable;

public class jawabanRiddles1 implements Parcelable{
    private String soal11;

    public jawabanRiddles1(Parcel in) {
        soal11 = in.readString();
    }

    public static final Creator<jawabanRiddles1> CREATOR = new Creator<jawabanRiddles1>() {
        @Override
        public jawabanRiddles1 createFromParcel(Parcel in) {
            return new jawabanRiddles1(in);
        }

        @Override
        public jawabanRiddles1[] newArray(int size) {
            return new jawabanRiddles1[size];
        }
    };


    public String getSoal11() {
        return soal11;
    }

    public void setSoal11(String soal11) {
        this.soal11 = soal11;
    }


    public jawabanRiddles1(String soal11) {
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
