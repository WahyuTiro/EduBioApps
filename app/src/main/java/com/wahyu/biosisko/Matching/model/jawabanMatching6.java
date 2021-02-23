package com.wahyu.biosisko.Matching.model;

import android.os.Parcel;
import android.os.Parcelable;

public class jawabanMatching6 implements Parcelable{
    private String soal61;

    public jawabanMatching6(Parcel in) {
        soal61 = in.readString();
    }

    public static final Creator<jawabanMatching6> CREATOR = new Creator<jawabanMatching6>() {
        @Override
        public jawabanMatching6 createFromParcel(Parcel in) {
            return new jawabanMatching6(in);
        }

        @Override
        public jawabanMatching6[] newArray(int size) {
            return new jawabanMatching6[size];
        }
    };


    public String getSoal61() {
        return soal61;
    }

    public void setSoal61(String soal61) {
        this.soal61 = soal61;
    }


    public jawabanMatching6(String soal61) {
        this.soal61 = soal61;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(soal61);
    }
}
