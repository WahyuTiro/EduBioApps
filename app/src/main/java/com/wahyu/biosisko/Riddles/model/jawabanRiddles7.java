package com.wahyu.biosisko.Riddles.model;

import android.os.Parcel;
import android.os.Parcelable;

public class jawabanRiddles7 implements Parcelable{
    private String soal71;

    public jawabanRiddles7(Parcel in) {
        soal71 = in.readString();
    }

    public static final Creator<jawabanRiddles7> CREATOR = new Creator<jawabanRiddles7>() {
        @Override
        public jawabanRiddles7 createFromParcel(Parcel in) {
            return new jawabanRiddles7(in);
        }

        @Override
        public jawabanRiddles7[] newArray(int size) {
            return new jawabanRiddles7[size];
        }
    };


    public String getSoal71() {
        return soal71;
    }

    public void setSoal71(String soal71) {
        this.soal71 = soal71;
    }


    public jawabanRiddles7(String soal71) {
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
