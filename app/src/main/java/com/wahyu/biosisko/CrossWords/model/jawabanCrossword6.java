package com.wahyu.biosisko.CrossWords.model;

import android.os.Parcel;
import android.os.Parcelable;

public class jawabanCrossword6 implements Parcelable{
    private String soal61,soal62,soal64,soal65,soal67;

    protected jawabanCrossword6(Parcel in) {
        soal61 = in.readString();
        soal62 = in.readString();
        soal64 = in.readString();
        soal65 = in.readString();
        soal67 = in.readString();
    }

    public static final Creator<jawabanCrossword6> CREATOR = new Creator<jawabanCrossword6>() {
        @Override
        public jawabanCrossword6 createFromParcel(Parcel in) {
            return new jawabanCrossword6(in);
        }

        @Override
        public jawabanCrossword6[] newArray(int size) {
            return new jawabanCrossword6[size];
        }
    };

    public String getSoal61() {
        return soal61;
    }

    public void setSoal61(String soal61) {
        this.soal61 = soal61;
    }

    public String getSoal62() {
        return soal62;
    }

    public void setSoal62(String soal62) {
        this.soal62 = soal62;
    }


    public String getSoal64() {
        return soal64;
    }

    public void setSoal64(String soal64) {
        this.soal64 = soal64;
    }

    public String getSoal65() {
        return soal65;
    }

    public void setSoal65(String soal65) {
        this.soal65 = soal65;
    }

    public String getSoal67() {
        return soal67;
    }

    public void setSoal67(String soal67) {
        this.soal67 = soal67;
    }


    public jawabanCrossword6(String soal61, String soal62, String soal64, String soal65, String soal67) {
        this.soal61 = soal61;
        this.soal62 = soal62;
        this.soal64 = soal64;
        this.soal65 = soal65;
        this.soal67 = soal67;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(soal61);
        parcel.writeString(soal62);
        parcel.writeString(soal64);
        parcel.writeString(soal65);
        parcel.writeString(soal67);
    }
}
