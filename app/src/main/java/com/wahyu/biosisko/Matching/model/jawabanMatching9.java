package com.wahyu.biosisko.Matching.model;

import android.os.Parcel;
import android.os.Parcelable;

public class jawabanMatching9 implements Parcelable{
    private String soal91;

    public jawabanMatching9(Parcel in) {
        soal91 = in.readString();
    }

    public static final Creator<jawabanMatching9> CREATOR = new Creator<jawabanMatching9>() {
        @Override
        public jawabanMatching9 createFromParcel(Parcel in) {
            return new jawabanMatching9(in);
        }

        @Override
        public jawabanMatching9[] newArray(int size) {
            return new jawabanMatching9[size];
        }
    };


    public String getSoal91() {
        return soal91;
    }

    public void setSoal91(String soal91) {
        this.soal91 = soal91;
    }


    public jawabanMatching9(String soal91) {
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
