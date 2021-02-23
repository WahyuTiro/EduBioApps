package com.wahyu.biosisko.CrossWords.model;

import android.os.Parcel;
import android.os.Parcelable;

public class jawabanCrossword5 implements Parcelable{
    private String soal51,soal52,soal53,soal54,soal55,soal56,soal57,soal58;

    protected jawabanCrossword5(Parcel in) {
        soal51 = in.readString();
        soal52 = in.readString();
        soal53 = in.readString();
        soal54 = in.readString();
        soal55 = in.readString();
        soal56 = in.readString();
        soal57 = in.readString();
        soal58 = in.readString();
    }

    public static final Creator<jawabanCrossword5> CREATOR = new Creator<jawabanCrossword5>() {
        @Override
        public jawabanCrossword5 createFromParcel(Parcel in) {
            return new jawabanCrossword5(in);
        }

        @Override
        public jawabanCrossword5[] newArray(int size) {
            return new jawabanCrossword5[size];
        }
    };

    public String getSoal51() {
        return soal51;
    }

    public void setSoal51(String soal51) {
        this.soal51 = soal51;
    }

    public String getSoal52() {
        return soal52;
    }

    public void setSoal52(String soal52) {
        this.soal52 = soal52;
    }

    public String getSoal53() {
        return soal53;
    }

    public void setSoal53(String soal53) {
        this.soal53 = soal53;
    }

    public String getSoal54() {
        return soal54;
    }

    public void setSoal54(String soal54) {
        this.soal54 = soal54;
    }

    public String getSoal55() {
        return soal55;
    }

    public void setSoal55(String soal55) {
        this.soal55 = soal55;
    }

    public String getSoal56() {
        return soal56;
    }

    public void setSoal56(String soal56) {
        this.soal56 = soal56;
    }

    public String getSoal57() {
        return soal57;
    }

    public void setSoal57(String soal57) {
        this.soal57 = soal57;
    }


    public String getSoal58() {
        return soal58;
    }

    public void setSoal58(String soal58) {
        this.soal58 = soal58;
    }



    public jawabanCrossword5(String soal51, String soal52, String soal53, String soal54, String soal55, String soal56, String soal57, String soal58) {
        this.soal51 = soal51;
        this.soal52 = soal52;
        this.soal53 = soal53;
        this.soal54 = soal54;
        this.soal55 = soal55;
        this.soal56 = soal56;
        this.soal57 = soal57;
        this.soal58 = soal58;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(soal51);
        parcel.writeString(soal52);
        parcel.writeString(soal53);
        parcel.writeString(soal54);
        parcel.writeString(soal55);
        parcel.writeString(soal56);
        parcel.writeString(soal57);
        parcel.writeString(soal58);
    }
}
