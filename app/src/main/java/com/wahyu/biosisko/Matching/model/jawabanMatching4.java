package com.wahyu.biosisko.Matching.model;

import android.os.Parcel;
import android.os.Parcelable;

public class jawabanMatching4 implements Parcelable{
    private String soal41;

    public jawabanMatching4(Parcel in) {
        soal41 = in.readString();
    }

    public static final Creator<jawabanMatching4> CREATOR = new Creator<jawabanMatching4>() {
        @Override
        public jawabanMatching4 createFromParcel(Parcel in) {
            return new jawabanMatching4(in);
        }

        @Override
        public jawabanMatching4[] newArray(int size) {
            return new jawabanMatching4[size];
        }
    };


    public String getSoal41() {
        return soal41;
    }

    public void setSoal41(String soal41) {
        this.soal41 = soal41;
    }


    public jawabanMatching4(String soal41) {
        this.soal41 = soal41;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(soal41);
    }
}
