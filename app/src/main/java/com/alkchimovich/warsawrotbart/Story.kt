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

        }
    }


    @SuppressLint("SetTextI18n")
    fun startingPoint() {
        gs.textTitle.setText("Берлин. 1941...")
        gs.imgGame.setImageResource(R.drawable.room)
        gs.txtGame.setText("\"Франц: Как же я устал от всего этого безумия.\\n\" +\n" +
                "\"Франц Живешь в постоянном напряжении.\\n\" +\n" +
                "\"Франц: Уже и не помню, когда получалось нормально поспать.\\n\" +\n" +
                "\"Франц: Розыск, допросы, опросы свидетелей, отчеты…\\n\" +\n" +
                "\"Из графина, стоящего на столе, Франц наливает себе виски...\\n\" +\n" +
                "\"Франц: Только алкоголь помогает снять эту вечную усталость и стресс\\n\" +\n" +
                "\"Щелкнула зажигалка. Франц закурил сигарету и, взяв бокал, откинулся на спинку кресла…\\n\" +\n" +
                "\"Франц: Настоящий, из самой Шотландии. Жаль, что заканчивается.\\n\" +\n" +
                "\"Франц: Нужно снова наведаться к Удо пополнить запасы.\\n\" +\n" +
                "\"Франц: Но лучше было бы отказаться от виски и перейти на коньяк.\\n\" +\n" +
                "\"На лице Франца заиграла улыбка…\\n\" +\n" +
                "\"Франц: А еще лучше совсем не пить.\\n\" +\n" +
                "\"Размышления Франца прерывает неожиданный звонок телефона…\\n\" +\n" +
                "\"Франц: Кому это ночью не спится? Только бы не Артур со своим вечным желанием поговорить\\n\" +\n" +
                "\"Франц: После таких бесед несколько дней не можешь прийти в себя\\n\" +\n" +
                "\"Франц: Но начальству ведь не принято отказывать.\\n\" +\n" +
                "\"Франц: Тем более, всегда можно узнать что-то полезное и нужное.\\n\" +\n" +
                "\"На лице Франца вновь заиграла улыбка…\\n\" +\n" +
                "\"Артур: Алло, алло, Франц? Это Артур. Срочно собирайся, машину за тобой уже отправил… \""
        )
        gs.btnGame1.setText("Далее")
        gs.btnGame2.setText("")
        gs.btnGame3.setText("")
        gs.btnGame2.setVisibility(View.INVISIBLE)
        gs.btnGame3.setVisibility(View.INVISIBLE)

        nextPosition1 = "second"
    }

    @SuppressLint("SetTextI18n")
    fun second() {

        gs.textTitle.setText("Берлин. 1941...")
        gs.imgGame.setImageResource(R.drawable.night_berlin_home)
        gs.txtGame.setText(
            "\"Спустя пару минут Франц вышел из подъезда своего дома.\",\n" +
                    "\"На улице было прохладно, но виски, выпитый ранее, приятно согревал изнутри.\",\n" +
                    "\"Франц огляделся по сторонам: пустая улица, только в окнах где-то горит свет, а вокруг ни одной живой души.\",\n" +
                    "\"Франц: Ну, и где машина?\",\n" +
                    "\"Франц: Артур, Артур, вот ведь всегда так, кричишь, что срочно, а на деле...\",\n" +
                    "\"Франц полез в карман за сигаретами.\",\n" +
                    "\"Он стоял, курил и размышлял: что же это за срочное дело, которое не могло бы подождать до утра.\",\n" +
                    "\"Франц: Думаю, что все гораздо серьезнее.\",\n" +
                    "\"Франц: Судя по голосу, не похоже, что начальник искал компанию выпить.\", \"Послышался звук мотора. Через минуту автомобиль остановился возле Франца.\",\n" +
                    "\"Франц: Как всегда, не успел докурить.\",\n" +
                    "\"Франц выбросил недокуренную сигарету на тротуар и сел в машину.\",\n" +
                    "\"Ночной Берлин.\", название картинки\n" +
                    "\"Ночной Берлин был по-своему красив: подсветка магазинов и зданий, рекламные вывески, фонари и, конечно же, монументы, как же без них в Третьем рейхе...\",\n" +
                    "\"Франц смотрел в окно и в какой-то момент стал понимать, что едут они не на квартиру к Артуру.\",\n" +
                    "\"Франц: Вальтер, не мог бы ты прояснить, куда это мы едем?\",\n" +
                    "\"Молодой сотрудник крипо – Вальтер – был немногословен. За это Артур его очень ценил и взял к себе личным водителем.\",\n" +
                    "\"Вальтер: К Альбрехту.\",\n" +
                    "\"Это могло означать лишь одно: они едут в главное управление Имперской безопасности.\","
        )
        gs.btnGame1.setText("Далее")
        gs.btnGame2.setText("")
        gs.btnGame3.setText("")
        gs.btnGame2.setVisibility(View.INVISIBLE)
        gs.btnGame3.setVisibility(View.INVISIBLE)

        nextPosition1 = "three"
    }

    @SuppressLint("SetTextI18n")
    fun three() {
        gs.textTitle.setText("Берлин. 1941...")
        gs.imgGame.setImageResource(R.drawable.room_arthur)
        gs.txtGame.setText(
            "\"Спустя пару минут Франц вышел из подъезда своего дома.\",\n" +
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

        )
        gs.btnGame1.setText("Далее")
        gs.btnGame2.setText("")
        gs.btnGame3.setText("")
        gs.btnGame2.setVisibility(View.INVISIBLE)
        gs.btnGame3.setVisibility(View.INVISIBLE)

        nextPosition1 = "three"
    }


}