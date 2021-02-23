package com.wahyu.biosisko.CrossWords.model;

import android.os.Parcel;
import android.os.Parcelable;

public class jawabanCrossword10 implements Parcelable {
    private String soal101, soal102,soal103,soal104,soal105,soal106;

    protected jawabanCrossword10(Parcel in) {
        soal101 = in.readString();
        soal102 = in.readString();
        soal103 = in.readString();
        soal104 = in.readString();
        soal105 = in.readString();
        soal106 = in.readString();
    }

    public static final Creator<jawabanCrossword10> CREATOR = new Creator<jawabanCrossword10>() {
        @Override
        public jawabanCrossword10 createFromParcel(Parcel in) {
            return new jawabanCrossword10(in);
        }

        @Override
        public jawabanCrossword10[] newArray(int size) {
            return new jawabanCrossword10[size];
        }
    };

    public String getSoal101() {
        return soal101;
    }

    public void setSoal101(String soal101) {
        this.soal101 = soal101;
    }

    public String getSoal102() {
        return soal102;
    }

    public void setSoal102(String soal102) {
        this.soal102 = soal102;
    }

    public String getSoal103() {
        return soal103;
    }

    public void setSoal103(String soal103) {
        this.soal103 = soal103;
    }

    public String getSoal104() {
        return soal104;
    }

    public void setSoal104(String soal104) {
        this.soal104 = soal104;
    }

    public String getSoal105() {
        return soal105;
    }

    public void setSoal105(String soal105) {
        this.soal105 = soal105;
    }

    public String getSoal106() {
        return soal106;
    }

    public void setSoal106(String soal106) {
        this.soal106 = soal106;
    }


    public jawabanCrossword10(String soal101, String soal102, String soal103, String soal104, String soal105, String soal106) {
        this.soal101 = soal101;
        this.soal102 = soal102;
        this.soal103 = soal103;
        this.soal104 = soal104;
        this.soal105 = soal105;
        this.soal106 = soal106;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(soal101);
        parcel.writeString(soal102);
        parcel.writeString(soal103);
        parcel.writeString(soal104);
        parcel.writeString(soal105);
        parcel.writeString(soal106);
    }
}
