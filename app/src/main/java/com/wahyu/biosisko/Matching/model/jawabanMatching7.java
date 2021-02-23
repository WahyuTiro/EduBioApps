package com.wahyu.biosisko.Matching.model;

import android.os.Parcel;
import android.os.Parcelable;

public class jawabanMatching7 implements Parcelable{
    private String soal71;

    public jawabanMatching7(Parcel in) {
        soal71 = in.readString();
    }

    public static final Creator<jawabanMatching7> CREATOR = new Creator<jawabanMatching7>() {
        @Override
        public jawabanMatching7 createFromParcel(Parcel in) {
            return new jawabanMatching7(in);
        }

        @Override
        public jawabanMatching7[] newArray(int size) {
            return new jawabanMatching7[size];
        }
    };


    public String getSoal71() {
        return soal71;
    }

    public void setSoal71(String soal71) {
        this.soal71 = soal71;
    }


    public jawabanMatching7(String soal71) {
        this.soal71 = soal71;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(soal71);
    }
}
