package com.wahyu.biosisko.Matching.model;

import android.os.Parcel;
import android.os.Parcelable;

public class jawabanMatching2 implements Parcelable{
    private String soal21;

    public jawabanMatching2(Parcel in) {
        soal21 = in.readString();
    }

    public static final Creator<jawabanMatching2> CREATOR = new Creator<jawabanMatching2>() {
        @Override
        public jawabanMatching2 createFromParcel(Parcel in) {
            return new jawabanMatching2(in);
        }

        @Override
        public jawabanMatching2[] newArray(int size) {
            return new jawabanMatching2[size];
        }
    };


    public String getSoal21() {
        return soal21;
    }

    public void setSoal21(String soal21) {
        this.soal21 = soal21;
    }


    public jawabanMatching2(String soal21) {
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
