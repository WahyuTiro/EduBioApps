package com.wahyu.biosisko.CrossWords.model;

import android.os.Parcel;
import android.os.Parcelable;

public class jawabanCrossword3 implements Parcelable {
    private String soal31,soal32,soal33,soal34,soal35,soal36,soal37,soal38,soal39;

    protected jawabanCrossword3(Parcel in) {
        soal31 = in.readString();
        soal32 = in.readString();
        soal33 = in.readString();
        soal34 = in.readString();
        soal35 = in.readString();
        soal36 = in.readString();
        soal37 = in.readString();
        soal38 = in.readString();
        soal39 = in.readString();
    }

    public static final Creator<jawabanCrossword3> CREATOR = new Creator<jawabanCrossword3>() {
        @Override
        public jawabanCrossword3 createFromParcel(Parcel in) {
            return new jawabanCrossword3(in);
        }

        @Override
        public jawabanCrossword3[] newArray(int size) {
            return new jawabanCrossword3[size];
        }
    };

    public String getSoal31() {
        return soal31;
    }

    public void setSoal31(String soal31) {
        this.soal31 = soal31;
    }


    public String getSoal32() {
        return soal32;
    }

    public void setSoal32(String soal32) {
        this.soal32 = soal32;
    }


    public String getSoal33() {
        return soal33;
    }

    public void setSoal33(String soal33) {
        this.soal33 = soal33;
    }


    public String getSoal34() {
        return soal34;
    }

    public void setSoal34(String soal34) {
        this.soal34 = soal34;
    }


    public String getSoal35() {
        return soal35;
    }

    public void setSoal35(String soal35) {
        this.soal35 = soal35;
    }


    public String getSoal36() {
        return soal36;
    }

    public void setSoal36(String soal36) {
        this.soal36 = soal36;
    }


    public String getSoal37() {
        return soal37;
    }

    public void setSoal37(String soal37) {
        this.soal35 = soal37;
    }


    public String getSoal38() {
        return soal38;
    }

    public void setSoal38(String soal38) {
        this.soal38= soal38;
    }


    public String getSoal39() {
        return soal39;
    }

    public void setSoal39(String soal39) {
        this.soal38= soal39;
    }


    public jawabanCrossword3(String soal31, String soal32, String soal33, String soal34, String soal35, String soal36, String soal37, String soal38, String soal39) {
        this.soal31 = soal31;
        this.soal32 = soal32;
        this.soal33 = soal33;
        this.soal34 = soal34;
        this.soal35 = soal35;
        this.soal36 = soal36;
        this.soal37 = soal37;
        this.soal38 = soal38;
        this.soal39 = soal39;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(soal31);
        parcel.writeString(soal32);
        parcel.writeString(soal33);
        parcel.writeString(soal34);
        parcel.writeString(soal35);
        parcel.writeString(soal36);
        parcel.writeString(soal37);
        parcel.writeString(soal38);
        parcel.writeString(soal39);
    }
}
