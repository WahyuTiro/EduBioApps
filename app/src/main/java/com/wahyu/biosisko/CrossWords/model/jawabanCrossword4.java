package com.wahyu.biosisko.CrossWords.model;

import android.os.Parcel;
import android.os.Parcelable;

public class jawabanCrossword4 implements Parcelable {
    private String soal42,soal43,soal44, soal45,soal46,soal47,soal49;
    protected jawabanCrossword4(Parcel in) {
        soal42 = in.readString();
        soal43 = in.readString();
        soal44 = in.readString();
        soal45 = in.readString();
        soal46 = in.readString();
        soal47 = in.readString();
        soal49 = in.readString();
    }

    public static final Creator<jawabanCrossword4> CREATOR = new Creator<jawabanCrossword4>() {
        @Override
        public jawabanCrossword4 createFromParcel(Parcel in) {
            return new jawabanCrossword4(in);
        }

        @Override
        public jawabanCrossword4[] newArray(int size) {
            return new jawabanCrossword4[size];
        }
    };

    public String getSoal42() {
        return soal42;
    }

    public void setSoal42(String soal42) {
        this.soal42 = soal42;
    }

    public String getSoal43() {
        return soal43;
    }

    public void setSoal43(String soal43) {
        this.soal43 = soal43;
    }

    public String getSoal44() {
        return soal44;
    }

    public void setSoal44(String soal44) {
        this.soal44 = soal44;
    }

    public String getSoal45() {
        return soal45;
    }

    public void setSoal45(String soal45) {
        this.soal45 = soal45;
    }

    public String getSoal46() {
        return soal46;
    }

    public void setSoal46(String soal46) {
        this.soal46 = soal46;
    }

    public String getSoal47() {
        return soal47;
    }

    public void setSoal47(String soal47) {
        this.soal47 = soal47;
    }


    public String getSoal49() {
        return soal49;
    }

    public void setSoal49(String soal49) {
        this.soal49 = soal49;
    }



    public jawabanCrossword4(String soal42, String soal43, String soal44, String soal45, String soal46, String soal47, String soal49) {
        this.soal42 = soal42;
        this.soal43 = soal43;
        this.soal44 = soal44;
        this.soal45 = soal45;
        this.soal46 = soal46;
        this.soal47 = soal47;
        this.soal49 = soal49;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(soal42);
        parcel.writeString(soal43);
        parcel.writeString(soal44);
        parcel.writeString(soal45);
        parcel.writeString(soal46);
        parcel.writeString(soal47);
        parcel.writeString(soal49);
    }
}