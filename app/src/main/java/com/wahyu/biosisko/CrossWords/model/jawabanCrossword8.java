package com.wahyu.biosisko.CrossWords.model;

import android.os.Parcel;
import android.os.Parcelable;

public class jawabanCrossword8 implements Parcelable {
    private String soal82,soal83,soal85,soal86;

    protected jawabanCrossword8(Parcel in) {
        soal82 = in.readString();
        soal83 = in.readString();
        soal85 = in.readString();
        soal86 = in.readString();
    }

    public static final Creator<jawabanCrossword8> CREATOR = new Creator<jawabanCrossword8>() {
        @Override
        public jawabanCrossword8 createFromParcel(Parcel in) {
            return new jawabanCrossword8(in);
        }

        @Override
        public jawabanCrossword8[] newArray(int size) {
            return new jawabanCrossword8[size];
        }
    };

    public String getSoal82() {
        return soal82;
    }

    public void setSoal82(String soal82) {
        this.soal82 = soal82;
    }


    public String getSoal83() {
        return soal83;
    }

    public void setSoal83(String soal83) {
        this.soal83 = soal83;
    }


    public String getSoal85() {
        return soal85;
    }

    public void setSoal85(String soal85) {
        this.soal85 = soal85;
    }

    public String getSoal86() {
        return soal86;
    }

    public void setSoal86(String soal86) {
        this.soal86 = soal86;
    }


    public jawabanCrossword8(String soal82, String soal83, String soal85, String soal86) {
        this.soal82 = soal82;
        this.soal83 = soal83;
        this.soal85 = soal85;
        this.soal86 = soal86;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(soal82);
        parcel.writeString(soal83);
        parcel.writeString(soal85);
        parcel.writeString(soal86);
    }
}
