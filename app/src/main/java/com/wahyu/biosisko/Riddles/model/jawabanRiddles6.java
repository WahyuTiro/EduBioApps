package com.wahyu.biosisko.Riddles.model;

import android.os.Parcel;
import android.os.Parcelable;

public class jawabanRiddles6 implements Parcelable{
    private String soal61;

    public jawabanRiddles6(Parcel in) {
        soal61 = in.readString();
    }

    public static final Creator<jawabanRiddles6> CREATOR = new Creator<jawabanRiddles6>() {
        @Override
        public jawabanRiddles6 createFromParcel(Parcel in) {
            return new jawabanRiddles6(in);
        }

        @Override
        public jawabanRiddles6[] newArray(int size) {
            return new jawabanRiddles6[size];
        }
    };


    public String getSoal61() {
        return soal61;
    }

    public void setSoal61(String soal61) {
        this.soal61 = soal61;
    }


    public jawabanRiddles6(String soal61) {
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
