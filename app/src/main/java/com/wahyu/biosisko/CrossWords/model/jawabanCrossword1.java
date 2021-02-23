package com.wahyu.biosisko.CrossWords.model;

import android.os.Parcel;
import android.os.Parcelable;

public class jawabanCrossword1 implements Parcelable{
    private String soal11,soal12,soal14,soal15,soal17,soal18;

    protected jawabanCrossword1(Parcel in) {
        soal11 = in.readString();
        soal12 = in.readString();
        soal14 = in.readString();
        soal15 = in.readString();
        soal17 = in.readString();
        soal18 = in.readString();
    }

    public static final Creator<jawabanCrossword1> CREATOR = new Creator<jawabanCrossword1>() {
        @Override
        public jawabanCrossword1 createFromParcel(Parcel in) {
            return new jawabanCrossword1(in);
        }

        @Override
        public jawabanCrossword1[] newArray(int size) {
            return new jawabanCrossword1[size];
        }
    };

    public String getSoal11() {
        return soal11;
    }

    public void setSoal11(String soal11) {
        this.soal11 = soal11;
    }

    public String getSoal12() {
        return soal12;
    }

    public void setSoal12(String soal12) {
        this.soal12 = soal12;
    }

    public String getSoal14() {
        return soal14;
    }

    public void setSoal14(String soal14) {
        this.soal14 = soal14;
    }

    public String getSoal15() {
        return soal15;
    }

    public void setSoal15(String soal15) {
        this.soal15 = soal15;
    }

    public String getSoal17() {
        return soal17;
    }

    public void setSoal17(String soal17) {
        this.soal17 = soal17;
    }

    public String getSoal18() {
        return soal18;
    }

    public void setSoal18(String soal18) {
        this.soal18 = soal18;
    }

    public jawabanCrossword1(String soal11, String soal12, String soal14, String soal15, String soal17, String soal18) {
        this.soal11 = soal11;
        this.soal12 = soal12;
        this.soal14 = soal14;
        this.soal15 = soal15;
        this.soal17 = soal17;
        this.soal18 = soal18;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(soal11);
        parcel.writeString(soal12);
        parcel.writeString(soal14);
        parcel.writeString(soal15);
        parcel.writeString(soal17);
        parcel.writeString(soal18);
    }
}
