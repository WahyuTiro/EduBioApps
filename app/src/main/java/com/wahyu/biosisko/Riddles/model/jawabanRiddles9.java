package com.wahyu.biosisko.Riddles.model;

import android.os.Parcel;
import android.os.Parcelable;

public class jawabanRiddles9 implements Parcelable{
    private String soal91;

    public jawabanRiddles9(Parcel in) {
        soal91 = in.readString();
    }

    public static final Creator<jawabanRiddles9> CREATOR = new Creator<jawabanRiddles9>() {
        @Override
        public jawabanRiddles9 createFromParcel(Parcel in) {
            return new jawabanRiddles9(in);
        }

        @Override
        public jawabanRiddles9[] newArray(int size) {
            return new jawabanRiddles9[size];
        }
    };


    public String getSoal91() {
        return soal91;
    }

    public void setSoal91(String soal91) {
        this.soal91 = soal91;
    }


    public jawabanRiddles9(String soal91) {
        this.soal91 = soal91;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(soal91);
    }
}
