package com.wahyu.biosisko.Riddles.model;

import android.os.Parcel;
import android.os.Parcelable;

public class jawabanRiddles4 implements Parcelable{
    private String soal41;

    public jawabanRiddles4(Parcel in) {
        soal41 = in.readString();
    }

    public static final Creator<jawabanRiddles4> CREATOR = new Creator<jawabanRiddles4>() {
        @Override
        public jawabanRiddles4 createFromParcel(Parcel in) {
            return new jawabanRiddles4(in);
        }

        @Override
        public jawabanRiddles4[] newArray(int size) {
            return new jawabanRiddles4[size];
        }
    };


    public String getSoal41() {
        return soal41;
    }

    public void setSoal41(String soal41) {
        this.soal41 = soal41;
    }


    public jawabanRiddles4(String soal41) {
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
