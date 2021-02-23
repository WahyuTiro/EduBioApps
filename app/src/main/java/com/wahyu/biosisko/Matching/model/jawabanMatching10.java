package com.wahyu.biosisko.Matching.model;

import android.os.Parcel;
import android.os.Parcelable;

public class jawabanMatching10 implements Parcelable{
    private String soal101;

    public jawabanMatching10(Parcel in) {
        soal101 = in.readString();
    }

    public static final Creator<jawabanMatching10> CREATOR = new Creator<jawabanMatching10>() {
        @Override
        public jawabanMatching10 createFromParcel(Parcel in) {
            return new jawabanMatching10(in);
        }

        @Override
        public jawabanMatching10[] newArray(int size) {
            return new jawabanMatching10[size];
        }
    };


    public String getSoal101() {
        return soal101;
    }

    public void setSoal101(String soal101) {
        this.soal101 = soal101;
    }


    public jawabanMatching10(String soal101) {
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
