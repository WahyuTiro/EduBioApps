package com.wahyu.biosisko.Riddles.model;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.List;

public class inputRiddles implements Parcelable {
    private List<String> jawaban1;
    private List<String> jawaban2;
    private List<String> jawaban3;
    private List<String> jawaban4;
    private List<String> jawaban5;
    private List<String> jawaban6;
    private List<String> jawaban7;
    private List<String> jawaban8;
    private List<String> jawaban9;
    private List<String> jawaban10;

    private List<String> input1;
    private List<String> input2;
    private List<String> input3;
    private List<String> input4;
    private List<String> input5;
    private List<String> input6;
    private List<String> input7;
    private List<String> input8;
    private List<String> input9;
    private List<String> input10;

    public inputRiddles(){}

    public inputRiddles(List<String> jawaban1, List<String> jawaban2, List<String> jawaban3, List<String> jawaban4, List<String> jawaban5, List<String> jawaban6, List<String> jawaban7, List<String> jawaban8, List<String> jawaban9, List<String> jawaban10, List<String> input1, List<String> input2, List<String> input3, List<String> input4, List<String> input5, List<String> input6, List<String> input7, List<String> input8, List<String> input9, List<String> input10) {
        this.jawaban1 = jawaban1;
        this.jawaban2 = jawaban2;
        this.jawaban3 = jawaban3;
        this.jawaban4 = jawaban4;
        this.jawaban5 = jawaban5;
        this.jawaban6 = jawaban6;
        this.jawaban7 = jawaban7;
        this.jawaban8 = jawaban8;
        this.jawaban9 = jawaban9;
        this.jawaban10 = jawaban10;
        this.input1 = input1;
        this.input2 = input2;
        this.input3 = input3;
        this.input4 = input4;
        this.input5 = input5;
        this.input6 = input6;
        this.input7 = input7;
        this.input8 = input8;
        this.input9 = input9;
        this.input10 = input10;
    }

    protected inputRiddles(Parcel in) {
        jawaban1 = in.createStringArrayList();
        jawaban2 = in.createStringArrayList();
        jawaban3 = in.createStringArrayList();
        jawaban4 = in.createStringArrayList();
        jawaban5 = in.createStringArrayList();
        jawaban6 = in.createStringArrayList();
        jawaban7 = in.createStringArrayList();
        jawaban8 = in.createStringArrayList();
        jawaban9 = in.createStringArrayList();
        jawaban10 = in.createStringArrayList();
        input1 = in.createStringArrayList();
        input2 = in.createStringArrayList();
        input3 = in.createStringArrayList();
        input4 = in.createStringArrayList();
        input5 = in.createStringArrayList();
        input6 = in.createStringArrayList();
        input7 = in.createStringArrayList();
        input8 = in.createStringArrayList();
        input9 = in.createStringArrayList();
        input10 = in.createStringArrayList();
    }

    public static final Creator<inputRiddles> CREATOR = new Creator<inputRiddles>() {
        @Override
        public inputRiddles createFromParcel(Parcel in) {
            return new inputRiddles(in);
        }
        @Override
        public inputRiddles[] newArray(int size) {
            return new inputRiddles[size];
        }
    };


    public List<String> getJawaban1() {
        return jawaban1;
    }

    public void setJawaban1(List<String> jawaban1) {
        this.jawaban1 = jawaban1;
    }

    public List<String> getJawaban2() {
        return jawaban2;
    }

    public void setJawaban2(List<String> jawaban2) {
        this.jawaban2 = jawaban2;
    }

    public List<String> getJawaban3() {
        return jawaban3;
    }

    public void setJawaban3(List<String> jawaban3) {
        this.jawaban3 = jawaban3;
    }

    public List<String> getJawaban4() {
        return jawaban4;
    }

    public void setJawaban4(List<String> jawaban4) {
        this.jawaban4 = jawaban4;
    }

    public List<String> getJawaban5() {
        return jawaban5;
    }

    public void setJawaban5(List<String> jawaban5) {
        this.jawaban5 = jawaban5;
    }

    public List<String> getJawaban6() {
        return jawaban6;
    }

    public void setJawaban6(List<String> jawaban6) {
        this.jawaban6 = jawaban6;
    }

    public List<String> getJawaban7() {
        return jawaban7;
    }

    public void setJawaban7(List<String> jawaban7) {
        this.jawaban7 = jawaban7;
    }

    public List<String> getJawaban8() {
        return jawaban8;
    }

    public void setJawaban8(List<String> jawaban8) {
        this.jawaban8 = jawaban8;
    }

    public List<String> getJawaban9() {
        return jawaban9;
    }

    public void setJawaban9(List<String> jawaban9) {
        this.jawaban9 = jawaban9;
    }

    public List<String> getJawaban10() {
        return jawaban10;
    }

    public void setJawaban10(List<String> jawaban10) {
        this.jawaban10 = jawaban10;
    }

    public List<String> getInput1() {
        return input1;
    }

    public void setInput1(List<String> input1) {
        this.input1 = input1;
    }

    public List<String> getInput2() {
        return input2;
    }

    public void setInput2(List<String> input2) {
        this.input2 = input2;
    }

    public List<String> getInput3() {
        return input3;
    }

    public void setInput3(List<String> input3) {
        this.input3 = input3;
    }

    public List<String> getInput4() {
        return input4;
    }

    public void setInput4(List<String> input4) {
        this.input4 = input4;
    }

    public List<String> getInput5() {
        return input5;
    }

    public void setInput5(List<String> input5) {
        this.input5 = input5;
    }

    public List<String> getInput6() {
        return input6;
    }

    public void setInput6(List<String> input6) {
        this.input6 = input6;
    }

    public List<String> getInput7() {
        return input7;
    }

    public void setInput7(List<String> input7) {
        this.input7 = input7;
    }

    public List<String> getInput8() {
        return input8;
    }

    public void setInput8(List<String> input8) {
        this.input8 = input8;
    }

    public List<String> getInput9() {
        return input9;
    }

    public void setInput9(List<String> input9) {
        this.input9 = input9;
    }

    public List<String> getInput10() {
        return input10;
    }

    public void setInput10(List<String> input10) {
        this.input10 = input10;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringList(jawaban1);
        parcel.writeStringList(jawaban2);
        parcel.writeStringList(jawaban3);
        parcel.writeStringList(jawaban4);
        parcel.writeStringList(jawaban5);
        parcel.writeStringList(jawaban6);
        parcel.writeStringList(jawaban7);
        parcel.writeStringList(jawaban8);
        parcel.writeStringList(jawaban9);
        parcel.writeStringList(jawaban10);
        parcel.writeStringList(input1);
        parcel.writeStringList(input2);
        parcel.writeStringList(input3);
        parcel.writeStringList(input4);
        parcel.writeStringList(input5);
        parcel.writeStringList(input6);
        parcel.writeStringList(input7);
        parcel.writeStringList(input8);
        parcel.writeStringList(input9);
        parcel.writeStringList(input10);
    }
}
