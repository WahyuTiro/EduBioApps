package com.wahyu.biosisko.CrossWords.model;

import android.os.Parcel;
import android.os.Parcelable;

public class jawabanCrossword7 implements Parcelable {
    private String soal71,soal72,soal73,soal74,soal75,soal76,soal77,soal78,soal79,soal710,soal711;

    protected jawabanCrossword7(Parcel in) {
        soal71 = in.readString();
        soal72 = in.readString();
        soal73 = in.readString();
        soal74 = in.readString();
        soal75 = in.readString();
        soal76 = in.readString();
        soal77 = in.readString();
        soal78 = in.readString();
        soal79 = in.readString();
        soal710 = in.readString();
        soal711 = in.readString();
    }

    public static final Creator<jawabanCrossword7> CREATOR = new Creator<jawabanCrossword7>() {
        @Override
        public jawabanCrossword7 createFromParcel(Parcel in) {
            return new jawabanCrossword7(in);
        }

        @Override
        public jawabanCrossword7[] newArray(int size) {
            return new jawabanCrossword7[size];
        }
    };

    public String getSoal71() {
        return soal71;
    }

    public void setSoal71(String soal71) {
        this.soal71 = soal71;
    }


    public String getSoal72() {
        return soal72;
    }

    public void setSoal72(String soal72) {
        this.soal72 = soal72;
    }


    public String getSoal73() {
        return soal73;
    }

    public void setSoal73(String soal73) {
        this.soal73 = soal73;
    }


    public String getSoal74() {
        return soal74;
    }

    public void setSoal74(String soal74) {
        this.soal74 = soal74;
    }


    public String getSoal75() {
        return soal75;
    }

    public void setSoal75(String soal75) {
        this.soal75 = soal75;
    }


    public String getSoal76() {
        return soal76;
    }

    public void setSoal76(String soal76) {
        this.soal76 = soal76;
    }


    public String getSoal77() {
        return soal77;
    }

    public void setSoal77(String soal77) {
        this.soal77 = soal77;
    }


    public String getSoal78() {
        return soal78;
    }

    public void setSoal78(String soal78) {
        this.soal78= soal78;
    }


    public String getSoal79() {
        return soal79;
    }

    public void setSoal79(String soal79) {
        this.soal79= soal79;
    }


    public String getSoal710() {
        return soal710;
    }

    public void setSoal710(String soal710) {
        this.soal710= soal710;
    }


    public String getSoal711() {
        return soal711;
    }

    public void setSoal711(String soal711) {
        this.soal711= soal711;
    }


    public jawabanCrossword7(String soal71, String soal72, String soal73, String soal74, String soal75, String soal76, String soal77, String soal78, String soal79, String soal710, String soal711) {
        this.soal71 = soal71;
        this.soal72 = soal72;
        this.soal73 = soal73;
        this.soal74 = soal74;
        this.soal75 = soal75;
        this.soal76 = soal76;
        this.soal77 = soal77;
        this.soal78 = soal78;
        this.soal79 = soal79;
        this.soal710 = soal710;
        this.soal711 = soal711;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(soal71);
        parcel.writeString(soal72);
        parcel.writeString(soal73);
        parcel.writeString(soal74);
        parcel.writeString(soal75);
        parcel.writeString(soal76);
        parcel.writeString(soal77);
        parcel.writeString(soal78);
        parcel.writeString(soal79);
        parcel.writeString(soal710);
        parcel.writeString(soal711);
    }
}
