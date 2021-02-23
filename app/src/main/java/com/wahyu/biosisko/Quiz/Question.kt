package com.wahyu.biosisko.Quiz


class Question {

    private var mQuestion: String? = null
    private var mImage: String? = null
    private var mOption1: String? = null
    private var mOption2: String? = null
    private var mOption3: String? = null
    private var mOption4: String? = null
    private var mOption5: String? = null
    private var mRightAns: Int = 0
    private var mClue: String? = null

    constructor() {}

    constructor(mQuestion: String, mImage: String, mOption1: String, mOption2: String, mOption3: String, mOption4: String, mOption5: String, mRightAns: Int, mClue: String) {
        this.mQuestion = mQuestion
        this.mImage = mImage
        this.mOption1 = mOption1
        this.mOption2 = mOption2
        this.mOption3 = mOption3
        this.mOption4 = mOption4
        this.mOption5 = mOption5
        this.mRightAns = mRightAns
        this.mClue = mClue
    }

    fun getmQuestion(): String? {
        return mQuestion
    }

    fun setmQuestion(mQuestion: String) {
        this.mQuestion = mQuestion
    }

    fun getImage(): String? {
        return mImage
    }

    fun setImage(mImage: String) {
        this.mImage = mImage
    }

    fun getmOption1(): String? {
        return mOption1
    }

    fun setmOption1(mOption1: String) {
        this.mOption1 = mOption1
    }

    fun getmOption2(): String? {
        return mOption2
    }

    fun setmOption2(mOption2: String) {
        this.mOption2 = mOption2
    }

    fun getmOption3(): String? {
        return mOption3
    }

    fun setmOption3(mOption3: String) {
        this.mOption3 = mOption3
    }

    fun getmOption4(): String? {
        return mOption4
    }

    fun setmOption4(mOption4: String) {
        this.mOption4 = mOption4
    }

    fun getmOption5(): String? {
        return mOption5
    }

    fun setmOption5(mOption5: String) {
        this.mOption5 = mOption5
    }

    fun getmRightAns(): Int {
        return mRightAns
    }

    fun setmRightAns(mRightAns: Int) {
        this.mRightAns = mRightAns
    }

    fun getmClue(): String? {
        return mClue
    }

    fun setmClue(mClue: String) {
        this.mClue = mClue
    }
}