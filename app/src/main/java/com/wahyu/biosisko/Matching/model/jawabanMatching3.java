package com.wahyu.biosisko.Matching.model;

import android.os.Parcel;
import android.os.Parcelable;

public class jawabanMatching3 implements Parcelable{
    private String soal31;

    public jawabanMatching3(Parcel in) {
        soal31 = in.readString();
    }

    public static final Creator<jawabanMatching3> CREATOR = new Creator<jawabanMatching3>() {
        @Override
        public jawabanMatching3 createFromParcel(Parcel in) {
            return new jawabanMatching3(in);
        }

        @Override
        public jawabanMatching3[] newArray(int size) {
            return new jawabanMatching3[size];
        }
    };


    public String getSoal31() {
        return soal31;
    }

    public void setSoal31(String soal31) {
        this.soal31 = soal31;
    }


    public jawabanMatching3(String soal31) {
        this.soal31 = soal31;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(soal31);
    }
}
