package com.wahyu.biosisko.Riddles.model;

import android.os.Parcel;
import android.os.Parcelable;

public class jawabanRiddles3 implements Parcelable{
    private String soal31;

    public jawabanRiddles3(Parcel in) {
        soal31 = in.readString();
    }

    public static final Creator<jawabanRiddles3> CREATOR = new Creator<jawabanRiddles3>() {
        @Override
        public jawabanRiddles3 createFromParcel(Parcel in) {
            return new jawabanRiddles3(in);
        }

        @Override
        public jawabanRiddles3[] newArray(int size) {
            return new jawabanRiddles3[size];
        }
    };


    public String getSoal31() {
        return soal31;
    }

    public void setSoal31(String soal31) {
        this.soal31 = soal31;
    }


    public jawabanRiddles3(String soal31) {
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
