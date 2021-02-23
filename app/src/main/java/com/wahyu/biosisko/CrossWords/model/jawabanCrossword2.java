package com.wahyu.biosisko.CrossWords.model;

import android.os.Parcel;
import android.os.Parcelable;

public class jawabanCrossword2 implements Parcelable {
    private String soal21,soal23,soal24,soal25,soal26,soal27,soal28;

    protected jawabanCrossword2(Parcel in) {
        soal21 = in.readString();
        soal23 = in.readString();
        soal24 = in.readString();
        soal25 = in.readString();
        soal26 = in.readString();
        soal27 = in.readString();
        soal28 = in.readString();
    }

    public static final Creator<jawabanCrossword2> CREATOR = new Creator<jawabanCrossword2>() {
        @Override
        public jawabanCrossword2 createFromParcel(Parcel in) {
            return new jawabanCrossword2(in);
        }

        @Override
        public jawabanCrossword2[] newArray(int size) {
            return new jawabanCrossword2[size];
        }
    };


    public String getSoal21() {
        return soal21;
    }

    public void setSoal21(String soal21) {
        this.soal21 = soal21;
    }

    public String getSoal23() {
        return soal23;
    }

    public void setSoal23(String soal23) {
        this.soal23 = soal23;
    }

    public String getSoal24() {
        return soal24;
    }

    public void setSoal24(String soal24) {
        this.soal24 = soal24;
    }

    public String getSoal25() {
        return soal25;
    }

    public void setSoal25(String soal25) {
        this.soal25 = soal25;
    }

    public String getSoal26() {
        return soal26;
    }

    public void setSoal26(String soal26) {
        this.soal26 = soal26;
    }

    public String getSoal27() {
        return soal27;
    }

    public void setSoal27(String soal27) {
        this.soal27 = soal27;
    }

    public String getSoal28() {
        return soal28;
    }

    public void setSoal28(String soal28) {
        this.soal28= soal28;
    }


    public jawabanCrossword2(String soal21, String soal23, String soal24, String soal25, String soal26, String soal27, String soal28) {
        this.soal21 = soal21;
        this.soal23 = soal23;
        this.soal24 = soal24;
        this.soal25 = soal25;
        this.soal26 = soal26;
        this.soal27 = soal27;
        this.soal28 = soal28;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(soal21);
        parcel.writeString(soal23);
        parcel.writeString(soal24);
        parcel.writeString(soal25);
        parcel.writeString(soal26);
        parcel.writeString(soal27);
        parcel.writeString(soal28);
    }
}
