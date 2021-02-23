package com.wahyu.biosisko.Riddles.model;

import android.os.Parcel;
import android.os.Parcelable;

public class jawabanRiddles2 implements Parcelable{
    private String soal21;

    public jawabanRiddles2(Parcel in) {
        soal21 = in.readString();
    }

    public static final Creator<jawabanRiddles2> CREATOR = new Creator<jawabanRiddles2>() {
        @Override
        public jawabanRiddles2 createFromParcel(Parcel in) {
            return new jawabanRiddles2(in);
        }

        @Override
        public jawabanRiddles2[] newArray(int size) {
            return new jawabanRiddles2[size];
        }
    };


    public String getSoal21() {
        return soal21;
    }

    public void setSoal21(String soal21) {
        this.soal21 = soal21;
    }


    public jawabanRiddles2(String soal21) {
        this.soal21 = soal21;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(soal21);
    }
}
