package com.alkchimovich.warsawrotbart

import android.annotation.SuppressLint
import android.view.View
import kotlinx.android.synthetic.main.activity_game.*

class Story(private val gs: GameActivity) {

    var nextPosition1 = ""
    var nextPosition2 = ""
    var nextPosition3 = ""



    fun selectPosition(position: String) {

        when (position) {
            "startingPoint" -> startingPoint()
            "second" -> second()
            "three" -> three()
            "four" -> four()
            "five" -> five()
            "six" -> six()
            "seven" -> seven()
            "eight" -> eight()
            "nine" -> nine()
            "ten" -> ten()
            "eleven" -> eleven()
            "twelve" -> twelve()
            "thirteen" -> thirteen()
            "fourteen" -> fourteen()

        }
    }

    private fun showAllButton() {
        gs.btnGame1.visibility = View.VISIBLE
        gs.btnGame2.visibility = View.VISIBLE
        gs.btnGame3.visibility = View.VISIBLE
    }


    @SuppressLint("SetTextI18n")
    fun startingPoint() {
        gs.textTitle.text = "Берлин. 1941..."
        gs.imgGame.setImageResource(R.drawable.room1)
        gs.txtGame.setText(R.string.story_one)
        gs.btnGame1.setText("Далее")
        gs.btnGame2.setText("Информация") //info1
        gs.btnGame3.setText("")

        gs.btnGame3.setVisibility(View.INVISIBLE)

        nextPosition1 = "second"
        nextPosition2 = "info1"
    }

    @SuppressLint("SetTextI18n")
    fun second() {

        gs.textTitle.text = "Берлин. 1941..."
        gs.imgGame.setImageResource(R.drawable.street_berlin_one)
        gs.txtGame.setText(R.string.story_two)
        gs.btnGame1.setText("Далее")
        gs.btnGame2.setText("Информация") //info2
        gs.btnGame3.setText("")

        gs.btnGame3.setVisibility(View.INVISIBLE)

        nextPosition1 = "three"
        nextPosition2 = "info2"
    }

    @SuppressLint("SetTextI18n")
    fun three() {
        gs.textTitle.text = "Берлин. 1941..."
        gs.imgGame.setImageResource(R.drawable.room_arthur)
        gs.txtGame.setText(R.string.story_free)
        gs.btnGame1.text = "Далее"
        gs.btnGame2.text = "Информация" //info3
        gs.btnGame3.text = ""

        gs.btnGame3.visibility = View.INVISIBLE

        nextPosition1 = "four"
        nextPosition2 = "info3"
    }

    @SuppressLint("SetTextI18n")
    fun four() {
        gs.textTitle.text = "Берлин. 1941..."
        gs.imgGame.setImageResource(R.drawable.night_berlin_sd)
        gs.txtGame.setText(R.string.story_four)

        showAllButton()

        gs.btnGame1.text = "Поехать домой" //five 5
        gs.btnGame2.text = "Поехать к Китти" // 6
        gs.btnGame3.text = ""

        gs.btnGame3.visibility = View.INVISIBLE

        nextPosition1 = "five"
        nextPosition2 = "six"
    }

    @SuppressLint("SetTextI18n")
    fun five() {
        gs.textTitle.text = "Берлин. 1941..."
        gs.imgGame.setImageResource(R.drawable.room1)
        gs.txtGame.setText(R.string.story_five)

        showAllButton()

        gs.btnGame1.text = "Поднять трубку" //7
        gs.btnGame2.text = "Не поднимать"   //8
        gs.btnGame3.text = ""

        gs.btnGame3.visibility = View.INVISIBLE

        nextPosition1 = "seven"
        nextPosition2 = "eight"
    }

    @SuppressLint("SetTextI18n")
    fun six() {
        gs.textTitle.text = "Берлин. 1941..."
        gs.imgGame.setImageResource(R.drawable.night_berlin_kitty)
        gs.txtGame.setText(R.string.story_six)

        showAllButton()

        gs.btnGame1.text = "Дальше" //6.1
        gs.btnGame2.text = "Информация"   //info4
        gs.btnGame3.text = ""

        gs.btnGame3.visibility = View.INVISIBLE

        nextPosition1 = "sixOne"
        nextPosition2 = "three"
    }

    @SuppressLint("SetTextI18n")
    fun seven() {
        gs.textTitle.text = "Берлин. 1941..."
        gs.imgGame.setImageResource(R.drawable.room)
        gs.txtGame.setText(R.string.story_seven)

        showAllButton()

        gs.btnGame1.text = "Поехать к Матису" //13
        gs.btnGame2.text = "Остаться дома"  //9
        gs.btnGame3.text = "Информация"   //info5

        nextPosition1 = "thirteen"
        nextPosition2 = "nine"
        nextPosition3 = "three"

    }

    @SuppressLint("SetTextI18n")
    fun eight() {
        gs.textTitle.text = "Берлин. 1941..."
        gs.imgGame.setImageResource(R.drawable.room)
        gs.txtGame.setText(R.string.story_eight)

        showAllButton()

        gs.btnGame1.text = "Поднять трубку" //7
        gs.btnGame2.text = "Выдернуть шнур"  //9

        nextPosition1 = "seven"
        nextPosition2 = "nine"

        gs.btnGame3.visibility = View.INVISIBLE

    }

    @SuppressLint("SetTextI18n")
    fun nine() {
        gs.textTitle.text = "Берлин. 1941..."
        gs.imgGame.setImageResource(R.drawable.telefon)
        gs.txtGame.setText(R.string.story_nine)

        showAllButton()

        gs.btnGame1.text = "Дальше" //10

        nextPosition1 = "ten"

        gs.btnGame2.visibility = View.INVISIBLE
        gs.btnGame3.visibility = View.INVISIBLE

    }

    @SuppressLint("SetTextI18n")
    fun ten() {
        gs.textTitle.text = "Берлин. 1941..."
        gs.imgGame.setImageResource(R.drawable.room)
        gs.txtGame.setText(R.string.story_ten)

        showAllButton()

        gs.btnGame1.text = "Продолжить спать" //11
        gs.btnGame2.text = "Проснуться"  //11.1

        nextPosition1 = "eleven"
        nextPosition2 = "elevenOne"

        gs.btnGame3.visibility = View.INVISIBLE

    }

    @SuppressLint("SetTextI18n")
    fun eleven() {
        gs.textTitle.text = "Берлин. 1941..."
        gs.imgGame.setImageResource(R.drawable.room)
        gs.txtGame.setText(R.string.story_eleven)

        showAllButton()

        gs.btnGame1.text = "Дальше" //12

        nextPosition1 = "twelve"

        gs.btnGame2.visibility = View.INVISIBLE
        gs.btnGame3.visibility = View.INVISIBLE

    }

    @SuppressLint("SetTextI18n")
    fun twelve() {
        gs.textTitle.text = "Берлин. 1941..."
        gs.imgGame.setImageResource(R.drawable.twelve)
        gs.txtGame.setText(R.string.story_twelve)

        showAllButton()

        gs.btnGame1.text = "Начать сначала" //1

        nextPosition1 = "startingPoint"

        gs.btnGame2.visibility = View.INVISIBLE
        gs.btnGame3.visibility = View.INVISIBLE

    }

    @SuppressLint("SetTextI18n")
    fun thirteen() {
        gs.textTitle.text = "Берлин. 1941..."
        gs.imgGame.setImageResource(R.drawable.street_berlin_one)
        gs.txtGame.setText(R.string.story_thirteen)

        showAllButton()

        gs.btnGame1.text = "Пойти сразу к Матиасу" //14
        gs.btnGame2.text = "Пойти к машине" //15

        nextPosition1 = "fourteen"
        nextPosition2 = "fifteen"

        gs.btnGame3.visibility = View.INVISIBLE

    }

    @SuppressLint("SetTextI18n")
    fun fourteen() {
        gs.textTitle.text = "Берлин. 1941..."
        gs.imgGame.setImageResource(R.drawable.street_berlin_one)
        gs.txtGame.setText(R.string.story_fourteen)

        showAllButton()

        gs.btnGame1.text = "Искать зажигалку" //14.1
        gs.btnGame2.text = "Продолжить идти к Матиасу" //14.2

        nextPosition1 = "fourteenOne"
        nextPosition2 = "fourteenTwo"

        gs.btnGame3.visibility = View.INVISIBLE

    }
}

