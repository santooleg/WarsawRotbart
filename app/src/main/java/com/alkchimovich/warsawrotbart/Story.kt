package com.alkchimovich.warsawrotbart

import android.annotation.SuppressLint
import android.text.Html
import android.view.View
import android.widget.ScrollView
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

        }
    }

    fun showAllButton() {
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
        gs.btnGame2.setText("")
        gs.btnGame3.setText("")


        nextPosition1 = "second"
    }

    @SuppressLint("SetTextI18n")
    fun second() {

        gs.textTitle.setText("Берлин. 1941...")
        gs.imgGame.setImageResource(R.drawable.street_berlin_one)
        gs.txtGame.setText(R.string.story_two)
        gs.btnGame1.setText("Далее")
        gs.btnGame2.setText("")
        gs.btnGame3.setText("")
        gs.btnGame2.setVisibility(View.INVISIBLE)
        gs.btnGame3.setVisibility(View.INVISIBLE)

        nextPosition1 = "three"
    }

    @SuppressLint("SetTextI18n")
    fun three() {
        gs.textTitle.text = "Берлин. 1941..."
        gs.imgGame.setImageResource(R.drawable.room_arthur)
        gs.txtGame.text = "\"Спустя пару минут Франц вышел из подъезда своего дома.\",\n" +
                "\"На улице было прохладно, но виски, выпитый ранее, приятно согревал изнутри.\",\n" +
                "\"Франц огляделся по сторонам: пустая улица, только в окнах где-то горит свет, а вокруг ни одной живой души.\",\n" +
                "\"Франц: Ну, и где машина?\",\n" +
                "\"Франц: Артур, Артур, вот ведь всегда так, кричишь, что срочно, а на деле...\",\n" +
                "\"Франц полез в карман за сигаретами.\",\n" +
                "\"Он стоял, курил и размышлял: что же это за срочное дело, которое не могло бы подождать до утра.\",\n" +
                "\"Франц: Думаю, что все гораздо серьезнее.\",\n" +
                "\"Франц: Судя по голосу, не похоже, что начальник искал компанию выпить.\",\n" +
                "\"Послышался звук мотора. Через минуту автомобиль остановился возле Франца.\",\n" +
                "\"Франц: Как всегда, не успел докурить.\",\n" +
                "\"Франц выбросил недокуренную сигарету на тротуар и сел в машину.\",\n" +
                "\"Ночной Берлин был по-своему красив: подсветка магазинов и зданий, рекламные вывески, фонари и, конечно же, монументы, как же без них в Третьем рейхе...\",\n" +
                "\"Франц смотрел в окно и в какой-то момент стал понимать, что едут они не на квартиру к Артуру.\",\n" +
                "\"Франц: Вальтер, не мог бы ты прояснить, куда это мы едем?\",\n" +
                "\"Молодой сотрудник крипо – Вальтер – был немногословен. За это Артур его очень ценил и взял к себе личным водителем.\",\n" +
                "\"Вальтер: К Альбрехту.\",\n" +
                "\"Это могло означать лишь одно: они едут в главное управление Имперской безопасности.\","
        gs.btnGame1.text = "Далее"
        gs.btnGame2.text = ""
        gs.btnGame3.text = ""
        gs.btnGame2.visibility = View.INVISIBLE
        gs.btnGame3.visibility = View.INVISIBLE

        nextPosition1 = "four"
    }

    @SuppressLint("SetTextI18n")
    fun four() {
        gs.textTitle.text = "Берлин. 1941..."
        gs.imgGame.setImageResource(R.drawable.night_berlin_sd)
        gs.txtGame.text = "\"Франц вышел из здания СД на улицу.\",\n" +
                "\"Вдохнув полной грудью, Франц направился к машине.\", \n" +
                "\"Сидя на заднем сиденье, Франц задумался, куда бы поехать.\", \n" +
                "\"Вариантов было немного: домой спать или развлечься перед отъездом?\",\n" +
                "\"Франц взглянул на часы: время не такое и позднее.\", \n" +
                "\"Франц : Вальтер, поехали!\","

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
        gs.txtGame.text = "\"Автомобиль подъехал к дому Франца.\", \n" +
                "\"Вальтер: Господин Франц, если я Вам больше не нужен, разрешите отъехать по личному вопросу.\",\n" +
                "\"Франц: Езжай, Вальтер, у меня планы только поспать...\",\n" +
                "\"Франц налил себе виски и едва успел устроиться в кресле, как раздался телефонный звонок.\", \n" +
                "\"Франц: Ну это совсем не смешно! Видимо, Артур забыл еще что-то сказать...\", \n" +
                "\"Франц сидел в кресле и думал: поднимать трубку или нет.\","

        showAllButton()

        gs.btnGame1.text = "Поднять трубку" //7
        gs.btnGame2.text = "Не поднимать"   //8
        gs.btnGame3.text = ""

        gs.btnGame3.visibility = View.INVISIBLE

        nextPosition1 = "three"
        nextPosition2 = "three"
    }
}