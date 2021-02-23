package com.wahyu.biosisko.Riddles.model;

import android.os.Parcel;
import android.os.Parcelable;

public class jawabanRiddles10 implements Parcelable{
    private String soal101;

    public jawabanRiddles10(Parcel in) {
        soal101 = in.readString();
    }

    public static final Creator<jawabanRiddles10> CREATOR = new Creator<jawabanRiddles10>() {
        @Override
        public jawabanRiddles10 createFromParcel(Parcel in) {
            return new jawabanRiddles10(in);
        }

        @Override
        public jawabanRiddles10[] newArray(int size) {
            return new jawabanRiddles10[size];
        }
    };


    public String getSoal101() {
        return soal101;
    }

    public void setSoal101(String soal101) {
        this.soal101 = soal101;
    }


    public jawabanRiddles10(String soal101) {
        this.soal101 = soal101;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(soal101);
    }
}
