package com.wahyu.biosisko.Quiz

import android.provider.BaseColumns

object QuizContainer {

    class QuizTable : BaseColumns {
        companion object {

            val QUESTION_TABLE_NAME = "quiz_question"
            val QUESTION_COLUMN = "question"
            val IMAGE_COLUMN = "image"
            val OPTION1_COLUMN = "option1"
            val OPTION2_COLUMN = "option2"
            val OPTION3_COLUMN = "option3"
            val OPTION4_COLUMN = "option4"
            val OPTION5_COLUMN = "option5"
            val ANS_COLUMN = "ans"
            val CLUE = "clue"
        }


    }
}

