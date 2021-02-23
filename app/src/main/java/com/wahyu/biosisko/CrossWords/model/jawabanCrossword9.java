package com.wahyu.biosisko.CrossWords.model;

import android.os.Parcel;
import android.os.Parcelable;

public class jawabanCrossword9 implements Parcelable {
    private String soal91, soal92,soal93,soal94,soal95;

    protected jawabanCrossword9(Parcel in) {
        soal91 = in.readString();
        soal92 = in.readString();
        soal93 = in.readString();
        soal94 = in.readString();
        soal95 = in.readString();
    }

    public static final Creator<jawabanCrossword9> CREATOR = new Creator<jawabanCrossword9>() {
        @Override
        public jawabanCrossword9 createFromParcel(Parcel in) {
            return new jawabanCrossword9(in);
        }

        @Override
        public jawabanCrossword9[] newArray(int size) {
            return new jawabanCrossword9[size];
        }
    };

    public String getSoal91() {
        return soal91;
    }

    public void setSoal91(String soal91) {
        this.soal91 = soal91;
    }


    public String getSoal92() {
        return soal92;
    }

    public void setSoal92(String soal92) {
        this.soal92 = soal92;
    }


    public String getSoal93() {
        return soal93;
    }

    public void setSoal93(String soal93) {
        this.soal93 = soal93;
    }


    public String getSoal94() {
        return soal94;
    }

    public void setSoal94(String soal94) {
        this.soal94 = soal94;
    }


    public String getSoal95() {
        return soal95;
    }

    public void setSoal95(String soal95) {
        this.soal95 = soal95;
    }


    public jawabanCrossword9(String soal91, String soal92, String soal93, String soal94, String soal95) {
        this.soal91 = soal91;
        this.soal92 = soal92;
        this.soal93 = soal93;
        this.soal94 = soal94;
        this.soal95 = soal95;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(soal91);
        parcel.writeString(soal92);
        parcel.writeString(soal93);
        parcel.writeString(soal94);
        parcel.writeString(soal95);
    }
}
