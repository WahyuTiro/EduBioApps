package com.wahyu.biosisko.Quiz

import android.content.ContentValues
import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper
import android.provider.BaseColumns
import com.wahyu.biosisko.R
import com.wahyu.biosisko.Quiz.QuizContainer.QuizTable.Companion.ANS_COLUMN
import com.wahyu.biosisko.Quiz.QuizContainer.QuizTable.Companion.CLUE
import com.wahyu.biosisko.Quiz.QuizContainer.QuizTable.Companion.IMAGE_COLUMN
import com.wahyu.biosisko.Quiz.QuizContainer.QuizTable.Companion.OPTION1_COLUMN
import com.wahyu.biosisko.Quiz.QuizContainer.QuizTable.Companion.OPTION2_COLUMN
import com.wahyu.biosisko.Quiz.QuizContainer.QuizTable.Companion.OPTION3_COLUMN
import com.wahyu.biosisko.Quiz.QuizContainer.QuizTable.Companion.OPTION4_COLUMN
import com.wahyu.biosisko.Quiz.QuizContainer.QuizTable.Companion.OPTION5_COLUMN
import com.wahyu.biosisko.Quiz.QuizContainer.QuizTable.Companion.QUESTION_COLUMN
import com.wahyu.biosisko.Quiz.QuizContainer.QuizTable.Companion.QUESTION_TABLE_NAME

class DBHelper (context: Context) : SQLiteOpenHelper(context, DATABASE_NAME, null, DATABASE_VERSION) {

    private var db: SQLiteDatabase? = null
    val context = context

    val questionSet: List<Question>
        get() {

            val questionSetsList = ArrayList<Question>()

            db = readableDatabase


            val c = db!!.rawQuery("SELECT * FROM $QUESTION_TABLE_NAME", null)

            if (c.moveToFirst()) {
                do {
                    val question = Question()
                    question.setmQuestion(c.getString(c.getColumnIndex(QUESTION_COLUMN)))
                    question.setImage(c.getString(c.getColumnIndex(IMAGE_COLUMN)))
                    question.setmOption1(c.getString(c.getColumnIndex(OPTION1_COLUMN)))
                    question.setmOption2(c.getString(c.getColumnIndex(OPTION2_COLUMN)))
                    question.setmOption3(c.getString(c.getColumnIndex(OPTION3_COLUMN)))
                    question.setmOption4(c.getString(c.getColumnIndex(OPTION4_COLUMN)))
                    question.setmOption5(c.getString(c.getColumnIndex(OPTION5_COLUMN)))
                    question.setmRightAns(c.getInt(c.getColumnIndex(ANS_COLUMN)))
                    question.setmClue(c.getString(c.getColumnIndex(CLUE)))
                    questionSetsList.add(question)
                } while (c.moveToNext())

            }
            c.close()
            return questionSetsList
        }

    override fun onCreate(db: SQLiteDatabase) {
        this.db = db

        val QB_TABLE = "CREATE TABLE " +
                QUESTION_TABLE_NAME + " ( " +
                BaseColumns._ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                QUESTION_COLUMN + " TEXT, " +
                IMAGE_COLUMN + " TEXT, " +
                OPTION1_COLUMN + " TEXT, " +
                OPTION2_COLUMN + " TEXT, " +
                OPTION3_COLUMN + " TEXT, " +
                OPTION4_COLUMN + " TEXT, " +
                OPTION5_COLUMN + " TEXT, " +
                ANS_COLUMN + " INTEGER, " +
                CLUE + " TEXT " +
                " )"

        db.execSQL(QB_TABLE)

        GenerateQuestionFunction()

    }

    private fun GenerateQuestionFunction() {
        val q1 = Question(context.getString(R.string.soal1),
                "",
                context.getString(R.string.opsiA_1),
                context.getString(R.string.opsiB_1),
                context.getString(R.string.opsiC_1),
                context.getString(R.string.opsiD_1),
                context.getString(R.string.opsiE_1),
                2,
                context.getString(R.string.clue1))
        addQuestion(q1)

        val q2 = Question(context.getString(R.string.soal2), context.getString(R.string.gambar2),
                context.getString(R.string.opsiA_2),
                context.getString(R.string.opsiB_2),
                context.getString(R.string.opsiC_2),
                context.getString(R.string.opsiD_2),
                context.getString(R.string.opsiE_2),
                3,
                context.getString(R.string.clue2))
        addQuestion(q2)

        val q3 = Question(context.getString(R.string.soal3), "",
                context.getString(R.string.opsiA_3),
                context.getString(R.string.opsiB_3),
                context.getString(R.string.opsiC_3),
                context.getString(R.string.opsiD_3),
                context.getString(R.string.opsiE_3),
                5,
                context.getString(R.string.clue3))
        addQuestion(q3)

        val q4 = Question(context.getString(R.string.soal4), "",
                context.getString(R.string.opsiA_4),
                context.getString(R.string.opsiB_4),
                context.getString(R.string.opsiC_4),
                context.getString(R.string.opsiD_4),
                context.getString(R.string.opsiE_4),
                1,
                context.getString(R.string.clue4))
        addQuestion(q4)

        val q5 = Question(context.getString(R.string.soal5), "",
                context.getString(R.string.opsiA_5),
                context.getString(R.string.opsiB_5),
                context.getString(R.string.opsiC_5),
                context.getString(R.string.opsiD_5),
                context.getString(R.string.opsiE_5),
                3,
                context.getString(R.string.clue5))
        addQuestion(q5)

        val q6 = Question(context.getString(R.string.soal6), "",
                context.getString(R.string.opsiA_6),
                context.getString(R.string.opsiB_6),
                context.getString(R.string.opsiC_6),
                context.getString(R.string.opsiD_6),
                context.getString(R.string.opsiE_6),
                2,
                context.getString(R.string.clue6))
        addQuestion(q6)

        val q7 = Question(context.getString(R.string.soal7), "",
                context.getString(R.string.opsiA_7),
                context.getString(R.string.opsiB_7),
                context.getString(R.string.opsiC_7),
                context.getString(R.string.opsiD_7),
                context.getString(R.string.opsiE_7),
                1,
                context.getString(R.string.clue7))
        addQuestion(q7)

        val q8 = Question(context.getString(R.string.soal8), "",
                context.getString(R.string.opsiA_8),
                context.getString(R.string.opsiB_8),
                context.getString(R.string.opsiC_8),
                context.getString(R.string.opsiD_8),
                context.getString(R.string.opsiE_8),
                4,
                context.getString(R.string.clue8))
        addQuestion(q8)

        val q9 = Question(context.getString(R.string.soal9), context.getString(R.string.gambar9),
                context.getString(R.string.opsiA_9),
                context.getString(R.string.opsiB_9),
                context.getString(R.string.opsiC_9),
                context.getString(R.string.opsiD_9),
                context.getString(R.string.opsiE_9),
                2,
                context.getString(R.string.clue9))
        addQuestion(q9)

        val q10 = Question(context.getString(R.string.soal10), "",
                context.getString(R.string.opsiA_10),
                context.getString(R.string.opsiB_10),
                context.getString(R.string.opsiC_10),
                context.getString(R.string.opsiD_10),
                context.getString(R.string.opsiE_10),
                1,
                context.getString(R.string.clue10))
        addQuestion(q10)

        val q11 = Question(context.getString(R.string.soal11), "",
                context.getString(R.string.opsiA_11),
                context.getString(R.string.opsiB_11),
                context.getString(R.string.opsiC_11),
                context.getString(R.string.opsiD_11),
                context.getString(R.string.opsiE_11),
                5,
                context.getString(R.string.clue11))
        addQuestion(q11)

        val q12 = Question(context.getString(R.string.soal12), "",
                context.getString(R.string.opsiA_12),
                context.getString(R.string.opsiB_12),
                context.getString(R.string.opsiC_12),
                context.getString(R.string.opsiD_12),
                context.getString(R.string.opsiE_12),
                3,
                context.getString(R.string.clue12))
        addQuestion(q12)

        val q13 = Question(context.getString(R.string.soal13), "",
                context.getString(R.string.opsiA_13),
                context.getString(R.string.opsiB_13),
                context.getString(R.string.opsiC_13),
                context.getString(R.string.opsiD_13),
                context.getString(R.string.opsiE_13),
                2,
                context.getString(R.string.clue13))
        addQuestion(q13)

        val q14 = Question(context.getString(R.string.soal14), "",
                context.getString(R.string.opsiA_14),
                context.getString(R.string.opsiB_14),
                context.getString(R.string.opsiC_14),
                context.getString(R.string.opsiD_14),
                context.getString(R.string.opsiE_14),
                4,
                context.getString(R.string.clue14))
        addQuestion(q14)

        val q15 = Question(context.getString(R.string.soal15), "",
                context.getString(R.string.opsiA_15),
                context.getString(R.string.opsiB_15),
                context.getString(R.string.opsiC_15),
                context.getString(R.string.opsiD_15),
                context.getString(R.string.opsiE_15),
                5,
                context.getString(R.string.clue15))
        addQuestion(q15)

        val q16 = Question(context.getString(R.string.soal16), context.getString(R.string.gambar16),
                context.getString(R.string.opsiA_16),
                context.getString(R.string.opsiB_16),
                context.getString(R.string.opsiC_16),
                context.getString(R.string.opsiD_16),
                context.getString(R.string.opsiE_16),
                1,
                context.getString(R.string.clue16))
        addQuestion(q16)

        val q17 = Question(context.getString(R.string.soal17), context.getString(R.string.gambar17),
                context.getString(R.string.opsiA_17),
                context.getString(R.string.opsiB_17),
                context.getString(R.string.opsiC_17),
                context.getString(R.string.opsiD_17),
                context.getString(R.string.opsiE_17),
                2,
                context.getString(R.string.clue17))
        addQuestion(q17)

        val q18 = Question(context.getString(R.string.soal18), context.getString(R.string.gambar18),
                context.getString(R.string.opsiA_18),
                context.getString(R.string.opsiB_18),
                context.getString(R.string.opsiC_18),
                context.getString(R.string.opsiD_18),
                context.getString(R.string.opsiE_18),
                1,
                context.getString(R.string.clue18))
        addQuestion(q18)

        val q19 = Question(context.getString(R.string.soal19), context.getString(R.string.gambar19),
                context.getString(R.string.opsiA_19),
                context.getString(R.string.opsiB_19),
                context.getString(R.string.opsiC_19),
                context.getString(R.string.opsiD_19),
                context.getString(R.string.opsiE_19),
                5,
                context.getString(R.string.clue19))
        addQuestion(q19)

        val q20 = Question(context.getString(R.string.soal20), "",
                context.getString(R.string.opsiA_20),
                context.getString(R.string.opsiB_20),
                context.getString(R.string.opsiC_20),
                context.getString(R.string.opsiD_20),
                context.getString(R.string.opsiE_20),
                4,
                context.getString(R.string.clue20))
        addQuestion(q20)

        val q21 = Question(context.getString(R.string.soal21), "",
                context.getString(R.string.opsiA_21),
                context.getString(R.string.opsiB_21),
                context.getString(R.string.opsiC_21),
                context.getString(R.string.opsiD_21),
                context.getString(R.string.opsiE_21),
                1,
                context.getString(R.string.clue21))
        addQuestion(q21)

        val q22 = Question(context.getString(R.string.soal22), context.getString(R.string.gambar22),
                context.getString(R.string.opsiA_22),
                context.getString(R.string.opsiB_22),
                context.getString(R.string.opsiC_22),
                context.getString(R.string.opsiD_22),
                context.getString(R.string.opsiE_22),
                1,
                context.getString(R.string.clue22))
        addQuestion(q22)

        val q23 = Question(context.getString(R.string.soal23), "",
                context.getString(R.string.opsiA_23),
                context.getString(R.string.opsiB_23),
                context.getString(R.string.opsiC_23),
                context.getString(R.string.opsiD_23),
                context.getString(R.string.opsiE_23),
                5,
                context.getString(R.string.clue23))
        addQuestion(q23)

        val q24 = Question(context.getString(R.string.soal24), "",
                context.getString(R.string.opsiA_24),
                context.getString(R.string.opsiB_24),
                context.getString(R.string.opsiC_24),
                context.getString(R.string.opsiD_24),
                context.getString(R.string.opsiE_24),
                1,
                context.getString(R.string.clue24))
        addQuestion(q24)

        val q25 = Question(context.getString(R.string.soal25), "",
                context.getString(R.string.opsiA_25),
                context.getString(R.string.opsiB_25),
                context.getString(R.string.opsiC_25),
                context.getString(R.string.opsiD_25),
                context.getString(R.string.opsiE_25),
                3,
                context.getString(R.string.clue25))
        addQuestion(q25)

        val q26 = Question(context.getString(R.string.soal26), "",
                context.getString(R.string.opsiA_26),
                context.getString(R.string.opsiB_26),
                context.getString(R.string.opsiC_26),
                context.getString(R.string.opsiD_26),
                context.getString(R.string.opsiE_26),
                2,
                context.getString(R.string.clue26))
        addQuestion(q26)

        val q27 = Question(context.getString(R.string.soal27), "",
                context.getString(R.string.opsiA_27),
                context.getString(R.string.opsiB_27),
                context.getString(R.string.opsiC_27),
                context.getString(R.string.opsiD_27),
                context.getString(R.string.opsiE_27),
                4,
                context.getString(R.string.clue27))
        addQuestion(q27)

        val q28 = Question(context.getString(R.string.soal28), "",
                context.getString(R.string.opsiA_28),
                context.getString(R.string.opsiB_28),
                context.getString(R.string.opsiC_28),
                context.getString(R.string.opsiD_28),
                context.getString(R.string.opsiE_28),
                3,
                context.getString(R.string.clue28))
        addQuestion(q28)

        val q29 = Question(context.getString(R.string.soal29), "",
                context.getString(R.string.opsiA_29),
                context.getString(R.string.opsiB_29),
                context.getString(R.string.opsiC_29),
                context.getString(R.string.opsiD_29),
                context.getString(R.string.opsiE_29),
                2,
                context.getString(R.string.clue29))
        addQuestion(q29)

        val q30 = Question(context.getString(R.string.soal30), "",
                context.getString(R.string.opsiA_30),
                context.getString(R.string.opsiB_30),
                context.getString(R.string.opsiC_30),
                context.getString(R.string.opsiD_30),
                context.getString(R.string.opsiE_30),
                1,
                context.getString(R.string.clue30))
        addQuestion(q30)

        val q31 = Question(context.getString(R.string.soal31), "",
                context.getString(R.string.opsiA_31),
                context.getString(R.string.opsiB_31),
                context.getString(R.string.opsiC_31),
                context.getString(R.string.opsiD_31),
                context.getString(R.string.opsiE_31),
                1,
                context.getString(R.string.clue31))
        addQuestion(q31)

        val q32 = Question(context.getString(R.string.soal32), "",
                context.getString(R.string.opsiA_32),
                context.getString(R.string.opsiB_32),
                context.getString(R.string.opsiC_32),
                context.getString(R.string.opsiD_32),
                context.getString(R.string.opsiE_32),
                1,
                context.getString(R.string.clue32))
        addQuestion(q32)

        val q33 = Question(context.getString(R.string.soal33), "",
                context.getString(R.string.opsiA_33),
                context.getString(R.string.opsiB_33),
                context.getString(R.string.opsiC_33),
                context.getString(R.string.opsiD_33),
                context.getString(R.string.opsiE_33),
                2,
                context.getString(R.string.clue33))
        addQuestion(q33)

        val q34 = Question(context.getString(R.string.soal34), "",
                context.getString(R.string.opsiA_34),
                context.getString(R.string.opsiB_34),
                context.getString(R.string.opsiC_34),
                context.getString(R.string.opsiD_34),
                context.getString(R.string.opsiE_34),
                2,
                context.getString(R.string.clue34))
        addQuestion(q34)

        val q35 = Question(context.getString(R.string.soal35), "",
                context.getString(R.string.opsiA_35),
                context.getString(R.string.opsiB_35),
                context.getString(R.string.opsiC_35),
                context.getString(R.string.opsiD_35),
                context.getString(R.string.opsiE_35),
                2,
                context.getString(R.string.clue35))
        addQuestion(q35)

        val q36 = Question(context.getString(R.string.soal36), context.getString(R.string.gambar36),
                context.getString(R.string.opsiA_36),
                context.getString(R.string.opsiB_36),
                context.getString(R.string.opsiC_36),
                context.getString(R.string.opsiD_36),
                context.getString(R.string.opsiE_36),
                3,
                context.getString(R.string.clue36))
        addQuestion(q36)

        val q37 = Question(context.getString(R.string.soal37), "",
                context.getString(R.string.opsiA_37),
                context.getString(R.string.opsiB_37),
                context.getString(R.string.opsiC_37),
                context.getString(R.string.opsiD_37),
                context.getString(R.string.opsiE_37),
                4,
                context.getString(R.string.clue37))
        addQuestion(q37)

        val q38 = Question(context.getString(R.string.soal38), "",
                context.getString(R.string.opsiA_38),
                context.getString(R.string.opsiB_38),
                context.getString(R.string.opsiC_38),
                context.getString(R.string.opsiD_38),
                context.getString(R.string.opsiE_38),
                1,
                context.getString(R.string.clue38))
        addQuestion(q38)

        val q39 = Question(context.getString(R.string.soal39), "",
                context.getString(R.string.opsiA_39),
                context.getString(R.string.opsiB_39),
                context.getString(R.string.opsiC_39),
                context.getString(R.string.opsiD_39),
                context.getString(R.string.opsiE_39),
                5,
                context.getString(R.string.clue39))
        addQuestion(q39)

        val q40 = Question(context.getString(R.string.soal40), "",
                context.getString(R.string.opsiA_40),
                context.getString(R.string.opsiB_40),
                context.getString(R.string.opsiC_40),
                context.getString(R.string.opsiD_40),
                context.getString(R.string.opsiE_40),
                2,
                context.getString(R.string.clue40))
        addQuestion(q40)
    }

    private fun addQuestion(qb: Question) {
        val contentValues = ContentValues()
        contentValues.put(QUESTION_COLUMN, qb.getmQuestion())
        contentValues.put(IMAGE_COLUMN, qb.getImage())
        contentValues.put(OPTION1_COLUMN, qb.getmOption1())
        contentValues.put(OPTION2_COLUMN, qb.getmOption2())
        contentValues.put(OPTION3_COLUMN, qb.getmOption3())
        contentValues.put(OPTION4_COLUMN, qb.getmOption4())
        contentValues.put(OPTION5_COLUMN, qb.getmOption5())
        contentValues.put(ANS_COLUMN, qb.getmRightAns())
        contentValues.put(CLUE, qb.getmClue())
        db!!.insert(QUESTION_TABLE_NAME, null, contentValues)
    }


    override fun onUpgrade(db: SQLiteDatabase, oldVersion: Int, newVersion: Int) {

    }

    companion object {

        private val DATABASE_NAME = "QuizApp.db"
        private val DATABASE_VERSION = 1
    }

}