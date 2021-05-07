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
            "twelveOne" -> twelveOne()
            "thirteen" -> thirteen()
            "fourteen" -> fourteen()
            "fifteen" -> fifteen()
            "sixteen" -> sixteen()
            "seventeen" -> seventeen()
            "eighteen" -> eighteen()
            "nineteen" -> nineteen()

            "twenty" -> twenty()
            "twentyone" -> twentyone()
            "elevenOne" -> elevenOne()
            "elevenTwo" -> elevenTwo()
            "twentyoneOne" -> twentyoneOne()
            "twentyoneTwo" -> twentyoneTwo()
            "twentyoneThree" -> twentyoneThree()
            "twentytwo" -> twentytwo()
            "twentythree" -> twentythree()
            "twentyfive" -> twentyfive()
            "twentyfour" -> twentyfour()
            "twentysix" -> twentysix()
            "twentyseven" -> twentyseven()
            "twentyEight" -> twentyEight()
            "twentynine" -> twentynine()

            "thirty" -> thirty()
            "twentynineOne" -> twentynineOne()

            "fourteenOne" -> fourteenOne()
            "fourteenTwo" -> fourteenTwo()
            "fourteenThree" -> fourteenThree()
            "fourteenFive" -> fourteenFive()
            "fourteenSix" -> fourteenSix()
            "fourteenSeven" -> fourteenSeven()
            "fourteenEight" -> fourteenEight()
            "fourteenNine" -> fourteenNine()
            "fourteenTen" -> fourteenTen()
            "fourteenEleven" -> fourteenEleven()
            "fourteenTwelve" -> fourteenTwelve()
            "sixOne" -> sixOne()
            "sixTwo" -> sixTwo()
            "sixThree" -> sixThree()
            "sixFour" -> sixFour()
            "sixFive" -> sixFive()
            "sixSix" -> sixSix()
            "sixSeven" -> sixSeven()
            "sixFiveOne" -> sixFiveOne()
            "sixSixOne" -> sixSixOne()
            "sixSevenOne" -> sixSevenOne()

            "infoGame" -> infoGame()
            "info1" -> info1()
            "info2" -> info2()
            "info3" -> info3()
            "info4" -> info4()

        }
    }

    private fun showAllButton() {
        gs.btnGame1.visibility = View.VISIBLE
        gs.btnGame2.visibility = View.VISIBLE
        gs.btnGame3.visibility = View.VISIBLE
    }

    @SuppressLint("SetTextI18n")
    fun startingPoint() {
        showAllButton()

        gs.textTitle.text = "Берлин. 1941..."
        gs.imgGame.setImageResource(R.drawable.room_new)
        gs.txtGame.setText(R.string.story_one)
        gs.btnGame1.setText("Далее")
        gs.btnGame2.setText("Информация") //info1
        gs.btnGame3.setText("")

        gs.btnGame3.setVisibility(View.INVISIBLE)

        nextPosition1 = "second"
        nextPosition2 = "info1"
    }

    fun info1(){
        showAllButton()

        gs.textTitle.text = "Франц Вернер"
        gs.imgGame.setImageResource(R.drawable.franc_new)
        gs.txtGame.setText(R.string.franc)
        gs.btnGame1.setText("Вернутся в игру") //startingPoint
        gs.btnGame2.setText("")
        gs.btnGame3.setText("")


        gs.btnGame2.setVisibility(View.INVISIBLE)
        gs.btnGame3.setVisibility(View.INVISIBLE)

        nextPosition1 = "startingPoint"

    }

    @SuppressLint("SetTextI18n")
    fun second() {

        showAllButton()

        gs.textTitle.text = "Берлин. 1941..."
        gs.imgGame.setImageResource(R.drawable.img2)
        gs.txtGame.setText(R.string.story_two)
        gs.btnGame1.setText("Далее")
        gs.btnGame2.setText("Информация") //info2
        gs.btnGame3.setText("")

        gs.btnGame3.setVisibility(View.INVISIBLE)

        nextPosition1 = "three"
        nextPosition2 = "info2"
    }

    fun info2(){
        showAllButton()

        gs.textTitle.text = "Артур Небе"
        gs.imgGame.setImageResource(R.drawable.artur_nebe)
        gs.txtGame.setText(R.string.arthur)
        gs.btnGame1.setText("Вернутся в игру") //startingPoint
        gs.btnGame2.setText("")
        gs.btnGame3.setText("")


        gs.btnGame2.setVisibility(View.INVISIBLE)
        gs.btnGame3.setVisibility(View.INVISIBLE)

        nextPosition1 = "second"

    }

    @SuppressLint("SetTextI18n")
    fun three() {
        gs.textTitle.text = "Берлин. 1941..."
        gs.imgGame.setImageResource(R.drawable.img3)
        gs.txtGame.setText(R.string.story_free)
        gs.btnGame1.text = "Далее"
        gs.btnGame2.text = "Информация" //info3
        gs.btnGame3.text = ""

        gs.btnGame3.visibility = View.INVISIBLE

        nextPosition1 = "four"
        nextPosition2 = "info3"
    }


    fun info3(){
        showAllButton()

        gs.textTitle.text = "«Принц Альбрехт»"
        gs.imgGame.setImageResource(R.drawable.otel_albrecht)
        gs.txtGame.setText(R.string.albreht)
        gs.btnGame1.setText("Вернутся в игру") //startingPoint
        gs.btnGame2.setText("")
        gs.btnGame3.setText("")


        gs.btnGame2.setVisibility(View.INVISIBLE)
        gs.btnGame3.setVisibility(View.INVISIBLE)

        nextPosition1 = "three"

    }

    @SuppressLint("SetTextI18n")
    fun four() {
        gs.textTitle.text = "Берлин. 1941..."
        gs.imgGame.setImageResource(R.drawable.img4)
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
        gs.imgGame.setImageResource(R.drawable.room_franc)
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
        gs.imgGame.setImageResource(R.drawable.img6)
        gs.txtGame.setText(R.string.story_six)

        showAllButton()

        gs.btnGame1.text = "Дальше" //6.1
        gs.btnGame2.text = "Информация"   //info4
        gs.btnGame3.text = ""

        gs.btnGame3.visibility = View.INVISIBLE

        nextPosition1 = "sixOne"
        nextPosition2 = "info4"
    }

    fun info4() {
        showAllButton()

        gs.textTitle.text = "Салон Китти."
        gs.imgGame.setImageResource(R.drawable.salon_kitty)
        gs.txtGame.setText(R.string.salon_kitty)
        gs.btnGame1.setText("Вернутся в игру") //6
        gs.btnGame2.setText("")
        gs.btnGame3.setText("")


        gs.btnGame2.setVisibility(View.INVISIBLE)
        gs.btnGame3.setVisibility(View.INVISIBLE)

        nextPosition1 = "six"
    }

    @SuppressLint("SetTextI18n")
    fun seven() {
        gs.textTitle.text = "Берлин. 1941..."
        gs.imgGame.setImageResource(R.drawable.img8)
        gs.txtGame.setText(R.string.story_seven)

        showAllButton()

        gs.btnGame1.text = "Поехать к Матису" //13
        gs.btnGame2.text = "Остаться дома"  //9
        gs.btnGame3.text = "Информация"   //info5

        nextPosition1 = "thirteen"
        nextPosition2 = "nine"

        gs.btnGame3.visibility = View.INVISIBLE

    }

    @SuppressLint("SetTextI18n")
    fun eight() {
        gs.textTitle.text = "Берлин. 1941..."
        gs.imgGame.setImageResource(R.drawable.room_franc)
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
        gs.imgGame.setImageResource(R.drawable.img8)
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
        gs.imgGame.setImageResource(R.drawable.franc_sleep)
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
        gs.imgGame.setImageResource(R.drawable.franc_sleep)
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
        gs.imgGame.setImageResource(R.drawable.img12)
        gs.txtGame.setText(R.string.story_twelve)

        showAllButton()

        gs.btnGame1.text = "Начать сначала" //1

        nextPosition1 = "startingPoint"

        gs.btnGame2.visibility = View.INVISIBLE
        gs.btnGame3.visibility = View.INVISIBLE

    }
    @SuppressLint("SetTextI18n")
    fun twelveOne() {
        gs.textTitle.text = "Берлин. 1941..."
        gs.imgGame.setImageResource(R.drawable.franc_dead)
        gs.txtGame.setText(R.string.story_twelve_one)

        showAllButton()

        gs.btnGame1.text = "Начать сначала" //1

        nextPosition1 = "startingPoint"

        gs.btnGame2.visibility = View.INVISIBLE
        gs.btnGame3.visibility = View.INVISIBLE

    }

    @SuppressLint("SetTextI18n")
    fun thirteen() {
        gs.textTitle.text = "Берлин. 1941..."
        gs.imgGame.setImageResource(R.drawable.img2)
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
        gs.imgGame.setImageResource(R.drawable.img14_franc_smoke)
        gs.txtGame.setText(R.string.story_fourteen)

        showAllButton()

        gs.btnGame1.text = "Искать зажигалку" //14.1
        gs.btnGame2.text = "Продолжить идти к Матиасу" //14.2

        nextPosition1 = "fourteenOne"
        nextPosition2 = "fourteenTwo"

        gs.btnGame3.visibility = View.INVISIBLE

    }

    @SuppressLint("SetTextI18n")
    fun fifteen() {
        gs.textTitle.text = "Берлин. 1941..."
        gs.imgGame.setImageResource(R.drawable.img15_fran_auto)
        gs.txtGame.setText(R.string.story_fifteen)

        showAllButton()

        gs.btnGame1.text = "Остановится за два дома" //16
        gs.btnGame2.text = "Подъехать к дому" //17

        nextPosition1 = "sixteen"
        nextPosition2 = "seventeen"

        gs.btnGame3.visibility = View.INVISIBLE

    }

    @SuppressLint("SetTextI18n")
    fun sixteen() {
        gs.textTitle.text = "Берлин. 1941..."
        gs.imgGame.setImageResource(R.drawable.img16_auto)
        gs.txtGame.setText(R.string.story_sixteen)

        showAllButton()

        gs.btnGame1.text = "Пойти" //18
        gs.btnGame2.text = "Остаться" //19

        nextPosition1 = "eighteen"
        nextPosition2 = "nineteen"

        gs.btnGame3.visibility = View.INVISIBLE

    }

    @SuppressLint("SetTextI18n")
    fun seventeen() {
        gs.textTitle.text = "Берлин. 1941..."
        gs.imgGame.setImageResource(R.drawable.img17_lestnica)
        gs.txtGame.setText(R.string.story_seventeen)

        showAllButton()

        gs.btnGame1.text = "Подождать" //20
        gs.btnGame2.text = "Пойти" //21

        nextPosition1 = "twenty"
        nextPosition2 = "twentyone"

        gs.btnGame3.visibility = View.INVISIBLE

    }

    @SuppressLint("SetTextI18n")
    fun eighteen() {
        gs.textTitle.text = "Берлин. 1941..."
        gs.imgGame.setImageResource(R.drawable.img17_lestnica)
        gs.txtGame.setText(R.string.story_eighteen)

        showAllButton()

        gs.btnGame1.text = "Подождать" //20
        gs.btnGame2.text = "Пойти" //21

        nextPosition1 = "twenty"
        nextPosition2 = "twentyone"

        gs.btnGame3.visibility = View.INVISIBLE

    }

    @SuppressLint("SetTextI18n")
    fun nineteen() {
        gs.textTitle.text = "Берлин. 1941..."
        gs.imgGame.setImageResource(R.drawable.img16_auto)
        gs.txtGame.setText(R.string.story_nineteen)

        showAllButton()

        gs.btnGame1.text = "Подождать" //22
        gs.btnGame2.text = "Вернуться домой" //23

        nextPosition1 = "twentytwo"
        nextPosition2 = "twentythree"

        gs.btnGame3.visibility = View.INVISIBLE

    }

    @SuppressLint("SetTextI18n")
    fun twenty() {
        gs.textTitle.text = "Берлин. 1941..."
        gs.imgGame.setImageResource(R.drawable.img17_lestnica)
        gs.txtGame.setText(R.string.story_twenty)

        showAllButton()

        gs.btnGame1.text = "Дальше" //21

        nextPosition1 = "twentyone"

        gs.btnGame2.visibility = View.INVISIBLE
        gs.btnGame3.visibility = View.INVISIBLE

    }

    @SuppressLint("SetTextI18n")
    fun twentyone() {
        gs.textTitle.text = "Берлин. 1941..."
        gs.imgGame.setImageResource(R.drawable.img20_open_door)
        gs.txtGame.setText(R.string.story_twentyone)

        showAllButton()

        gs.btnGame1.text = "Дальше" //21.1

        nextPosition1 = "twentyoneOne"

        gs.btnGame2.visibility = View.INVISIBLE
        gs.btnGame3.visibility = View.INVISIBLE

    }

    @SuppressLint("SetTextI18n")
    fun elevenOne() {
        gs.textTitle.text = "Берлин. 1941..."
        gs.imgGame.setImageResource(R.drawable.img11_1_alarm)
        gs.txtGame.setText(R.string.story_eleven_one)

        showAllButton()

        gs.btnGame1.text = "Дальше" //11.2

        nextPosition1 = "elevenTwo"

        gs.btnGame2.visibility = View.INVISIBLE
        gs.btnGame3.visibility = View.INVISIBLE

    }

    @SuppressLint("SetTextI18n")
    fun elevenTwo() {
        gs.textTitle.text = "Берлин. 1941..."
        gs.imgGame.setImageResource(R.drawable.img11_2_hospital)
        gs.txtGame.setText(R.string.story_eleven_two)

        showAllButton()

        gs.btnGame1.text = "Начать с начала" //1

        nextPosition1 = "startingPoint"

        gs.btnGame2.visibility = View.INVISIBLE
        gs.btnGame3.visibility = View.INVISIBLE

    }

    @SuppressLint("SetTextI18n")
    fun twentyoneOne() {
        gs.textTitle.text = "Берлин. 1941..."
        gs.imgGame.setImageResource(R.drawable.img21_1_franc_pistolet)
        gs.txtGame.setText(R.string.story_twentyone_one)

        showAllButton()

        gs.btnGame1.text = "Осмотреть квартиру" //21.3
        gs.btnGame2.text = "Спуститься к машине" //21.2

        nextPosition1 = "twentyoneThree"
        nextPosition2 = "twentyoneTwo"

        gs.btnGame3.visibility = View.INVISIBLE
    }

    @SuppressLint("SetTextI18n")
    fun twentyoneTwo() {
        gs.textTitle.text = "Берлин. 1941..."
        gs.imgGame.setImageResource(R.drawable.img16_auto)
        gs.txtGame.setText(R.string.story_twentyone_two)

        showAllButton()

        gs.btnGame1.text = "Оставаться в машине" //25
        gs.btnGame2.text = "Вернуться домой" //24

        nextPosition1 = "twentyfive"
        nextPosition2 = "twentyfour"

        gs.btnGame3.visibility = View.INVISIBLE
    }

    @SuppressLint("SetTextI18n")
    fun twentyoneThree() {
        gs.textTitle.text = "Берлин. 1941..."
        gs.imgGame.setImageResource(R.drawable.img21_1_franc_pistolet)
        gs.txtGame.setText(R.string.story_twentyone_three)

        showAllButton()

        gs.btnGame1.text = "Оставаться в машине" //21.2

        nextPosition1 = "twentyoneTwo"

        gs.btnGame2.visibility = View.INVISIBLE
        gs.btnGame3.visibility = View.INVISIBLE
    }

    @SuppressLint("SetTextI18n")
    fun twentytwo() {
        gs.textTitle.text = "Берлин. 1941..."
        gs.imgGame.setImageResource(R.drawable.img16_auto)
        gs.txtGame.setText(R.string.story_twentytwo)

        showAllButton()

        gs.btnGame1.text = "Оставаться в машине" //25
        gs.btnGame2.text = "Вернуться домой" //24

        nextPosition1 = "twentyfive"
        nextPosition2 = "twentyfour"

        gs.btnGame3.visibility = View.INVISIBLE
    }

    @SuppressLint("SetTextI18n")
    fun twentythree() {
        gs.textTitle.text = "Берлин. 1941..."
        gs.imgGame.setImageResource(R.drawable.franc_sleep)
        gs.txtGame.setText(R.string.story_twentythree)

        showAllButton()

        gs.btnGame1.text = "Продолжить" //10

        nextPosition1 = "ten"
        gs.btnGame2.visibility = View.INVISIBLE
        gs.btnGame3.visibility = View.INVISIBLE
    }

    @SuppressLint("SetTextI18n")
    fun twentyfive() {
        gs.textTitle.text = "Берлин. 1941..."
        gs.imgGame.setImageResource(R.drawable.img16_auto)
        gs.txtGame.setText(R.string.story_twentyfive)

        showAllButton()

        gs.btnGame1.text = "Дальше" //26

        nextPosition1 = "twentysix"
        gs.btnGame2.visibility = View.INVISIBLE
        gs.btnGame3.visibility = View.INVISIBLE
    }

    @SuppressLint("SetTextI18n")
    fun twentyfour() {
        gs.textTitle.text = "Берлин. 1941..."
        gs.imgGame.setImageResource(R.drawable.gun_shot)
        gs.txtGame.setText(R.string.story_twentyfour)

        showAllButton()

        gs.btnGame1.text = "Дальше" //12.1

        nextPosition1 = "twelve_one"
        gs.btnGame2.visibility = View.INVISIBLE
        gs.btnGame3.visibility = View.INVISIBLE
    }

    @SuppressLint("SetTextI18n")
    fun twentysix() {
        gs.textTitle.text = "Берлин. 1941..."
        gs.imgGame.setImageResource(R.drawable.franc_auto_home_day)
        gs.txtGame.setText(R.string.story_twentysix)

        showAllButton()

        gs.btnGame1.text = "Дальше" //27

        nextPosition1 = "twentyseven"
        gs.btnGame2.visibility = View.INVISIBLE
        gs.btnGame3.visibility = View.INVISIBLE
    }

    @SuppressLint("SetTextI18n")
    fun twentyseven() {
        gs.textTitle.text = "Берлин. 1941..."
        gs.imgGame.setImageResource(R.drawable.franc_dead)
        gs.txtGame.setText(R.string.story_twentyseven)

        showAllButton()

        gs.btnGame1.text = "Дальше" //28

        nextPosition1 = "twentyEight"
        gs.btnGame2.visibility = View.INVISIBLE
        gs.btnGame3.visibility = View.INVISIBLE
    }

    @SuppressLint("SetTextI18n")
    fun twentynine() {
        gs.textTitle.text = "Берлин. 1941..."
        gs.imgGame.setImageResource(R.drawable.img_gestapo)
        gs.txtGame.setText(R.string.story_twentynine)

        showAllButton()

        gs.btnGame1.text = "Дальше" //29.1

        nextPosition1 = "twentynineOne"
        gs.btnGame2.visibility = View.INVISIBLE
        gs.btnGame3.visibility = View.INVISIBLE
    }

    @SuppressLint("SetTextI18n")
    fun twentyEight() {
        gs.textTitle.text = "Берлин. 1941..."
        gs.imgGame.setImageResource(R.drawable.img3)
        gs.txtGame.setText(R.string.story_twentyeight)

        showAllButton()

        gs.btnGame1.text = "Остаться в Берлине" //29
        gs.btnGame2.text = "Поехать в Варшаву" //30

        nextPosition1 = "twentynine"
        nextPosition2 = "thirty"

        gs.btnGame3.visibility = View.INVISIBLE
    }


    @SuppressLint("SetTextI18n")
    fun twentynineOne() {
        gs.textTitle.text = "Берлин. 1941..."
        gs.imgGame.setImageResource(R.drawable.img_final_29_1)
        gs.txtGame.setText(R.string.story_twentynine_one)

        showAllButton()


        gs.btnGame1.text = "Начать с начала" //1
        gs.btnGame2.text = "Информация об игре" //"infoGame"

        nextPosition1 = "startingPoint"
        nextPosition2 = "infoGame"

        gs.btnGame3.visibility = View.INVISIBLE
    }

    @SuppressLint("SetTextI18n")
    fun fourteenOne() {
        gs.textTitle.text = "Берлин. 1941..."
        gs.imgGame.setImageResource(R.drawable.img14_1_zazigalka)
        gs.txtGame.setText(R.string.story_fourteen_one)

        showAllButton()

        gs.btnGame1.text = "Продолжить искать зажигалку" //14.3
        gs.btnGame2.text = "Оставить поиск и идти к Матиасу" //14.2

        nextPosition1 = "fourteenThree"
        nextPosition2 = "fourteenTwo"

        gs.btnGame3.visibility = View.INVISIBLE
    }

    @SuppressLint("SetTextI18n")
    fun fourteenTwo() {
        gs.textTitle.text = "Берлин. 1941..."
        gs.imgGame.setImageResource(R.drawable.img14_2)
        gs.txtGame.setText(R.string.story_fourteen_two)

        showAllButton()

        gs.btnGame1.text = "Дальше" //11.1

        nextPosition1 = "elevenTwo"

        gs.btnGame2.visibility = View.INVISIBLE
        gs.btnGame3.visibility = View.INVISIBLE
    }

    @SuppressLint("SetTextI18n")
    fun fourteenThree() {
        gs.textTitle.text = "Берлин. 1941..."
        gs.imgGame.setImageResource(R.drawable.img14_1_zazigalka)
        gs.txtGame.setText(R.string.story_fourteen_three)

        showAllButton()

        gs.btnGame1.text = "Стоять на месте и наблюдать " //14.5
        gs.btnGame2.text = "Пойти туда, где показались силуэты" //14.6

        nextPosition1 = "fourteenFive"
        nextPosition2 = "fourteenSix"

        gs.btnGame3.visibility = View.INVISIBLE
    }

    @SuppressLint("SetTextI18n")
    fun fourteenFive() {
        gs.textTitle.text = "Берлин. 1941..."
        gs.imgGame.setImageResource(R.drawable.img14_2)
        gs.txtGame.setText(R.string.story_fourteen_five)

        showAllButton()

        gs.btnGame1.text = "Окликнуть Матиаса " //14.7
        gs.btnGame2.text = "Продолжать следить" //14.8

        nextPosition1 = "fourteenSeven"
        nextPosition2 = "fourteenEight"

        gs.btnGame3.visibility = View.INVISIBLE
    }

    @SuppressLint("SetTextI18n")
    fun fourteenSeven() {
        gs.textTitle.text = "Берлин. 1941..."
        gs.imgGame.setImageResource(R.drawable.gun_shot)
        gs.txtGame.setText(R.string.story_fourteen_seven)

        showAllButton()

        gs.btnGame1.text = "Дальше" //14.9

        nextPosition1 = "fourteenNine"

        gs.btnGame2.visibility = View.INVISIBLE
        gs.btnGame3.visibility = View.INVISIBLE
    }

    @SuppressLint("SetTextI18n")
    fun fourteenEight() {
        gs.textTitle.text = "Берлин. 1941..."
        gs.imgGame.setImageResource(R.drawable.img2)
        gs.txtGame.setText(R.string.story_fourteen_eight)

        showAllButton()

        gs.btnGame1.text = "Дальше" //14.12

        nextPosition1 = "fourteenTwelve"

        gs.btnGame2.visibility = View.INVISIBLE
        gs.btnGame3.visibility = View.INVISIBLE
    }

    @SuppressLint("SetTextI18n")
    fun fourteenSix() {
        gs.textTitle.text = "Берлин. 1941..."
        gs.imgGame.setImageResource(R.drawable.gun_shot)
        gs.txtGame.setText(R.string.story_fourteen_six)

        showAllButton()

        gs.btnGame1.text = "Дальше" //12.1

        nextPosition1 = "twelveOne"

        gs.btnGame2.visibility = View.INVISIBLE
        gs.btnGame3.visibility = View.INVISIBLE
    }

    @SuppressLint("SetTextI18n")
    fun fourteenNine() {
        gs.textTitle.text = "Берлин. 1941..."
        gs.imgGame.setImageResource(R.drawable.img14_19)
        gs.txtGame.setText(R.string.story_fourteen_nine)

        showAllButton()

        gs.btnGame1.text = "Осмотреть тела" //14.10
        gs.btnGame2.text = "Вернуться домой и вызвать полицию" //14.11

        nextPosition1 = "fourteenTen"
        nextPosition2 = "fourteenEleven"

        gs.btnGame3.visibility = View.INVISIBLE
    }

    @SuppressLint("SetTextI18n")
    fun fourteenTen() {
        gs.textTitle.text = "Берлин. 1941..."
        gs.imgGame.setImageResource(R.drawable.img14_19)
        gs.txtGame.setText(R.string.story_fourteen_ten)

        showAllButton()

        gs.btnGame1.text = "Вернуться домой и вызвать полицию" //14.11

        nextPosition1 = "fourteenEleven"

        gs.btnGame2.visibility = View.INVISIBLE
        gs.btnGame3.visibility = View.INVISIBLE
    }

    @SuppressLint("SetTextI18n")
    fun fourteenEleven() {
        gs.textTitle.text = "Берлин. 1941..."
        gs.imgGame.setImageResource(R.drawable.room_franc)
        gs.txtGame.setText(R.string.story_fourteen_eleven)

        showAllButton()

        gs.btnGame1.text = "Дальше" //28

        nextPosition1 = "twentyEight"

        gs.btnGame2.visibility = View.INVISIBLE
        gs.btnGame3.visibility = View.INVISIBLE
    }

    @SuppressLint("SetTextI18n")
    fun fourteenTwelve() {
        gs.textTitle.text = "Берлин. 1941..."
        gs.imgGame.setImageResource(R.drawable.img12)
        gs.txtGame.setText(R.string.story_fourteen_twelve)

        showAllButton()

        gs.btnGame1.text = "Дальше" //28

        nextPosition1 = "twentyEight"

        gs.btnGame2.visibility = View.INVISIBLE
        gs.btnGame3.visibility = View.INVISIBLE
    }

    @SuppressLint("SetTextI18n")
    fun sixOne() {
        gs.textTitle.text = "Берлин. 1941..."
        gs.imgGame.setImageResource(R.drawable.img6_1_salon_kitty)
        gs.txtGame.setText(R.string.story_six_one)

        showAllButton()

        gs.btnGame1.text = "Молча пить коньяк" //6.2
        gs.btnGame2.text = "Поговорить с Лизи" //6.3

        nextPosition1 = "sixTwo"
        nextPosition2 = "sixThree"

        gs.btnGame3.visibility = View.INVISIBLE
    }

    @SuppressLint("SetTextI18n")
    fun sixTwo() {
        gs.textTitle.text = "Берлин. 1941..."
        gs.imgGame.setImageResource(R.drawable.img6_2_bokal)
        gs.txtGame.setText(R.string.story_six_two)

        showAllButton()

        gs.btnGame1.text = "Продолжить одному" //6.4
        gs.btnGame2.text = "Позвать девушку" //6.5

        nextPosition1 = "sixFour"
        nextPosition2 = "sixFive"

        gs.btnGame3.visibility = View.INVISIBLE
    }

    @SuppressLint("SetTextI18n")
    fun sixThree() {
        gs.textTitle.text = "Берлин. 1941..."
        gs.imgGame.setImageResource(R.drawable.img6_3_salon)
        gs.txtGame.setText(R.string.story_six_three)

        showAllButton()

        gs.btnGame1.text = "Дальше" //6.7

        nextPosition1 = "sixSeven"

        gs.btnGame2.visibility = View.INVISIBLE
        gs.btnGame3.visibility = View.INVISIBLE
    }

    @SuppressLint("SetTextI18n")
    fun sixFour() {
        gs.textTitle.text = "Берлин. 1941..."
        gs.imgGame.setImageResource(R.drawable.franc_sleep)
        gs.txtGame.setText(R.string.story_six_four)

        showAllButton()
        gs.btnGame1.text = "Дальше" //6.6

        nextPosition1 = "sixSix"

        gs.btnGame2.visibility = View.INVISIBLE
        gs.btnGame3.visibility = View.INVISIBLE
    }

    @SuppressLint("SetTextI18n")
    fun sixFive() {
        gs.textTitle.text = "Берлин. 1941..."
        gs.imgGame.setImageResource(R.drawable.salon_kitty_two_girls)
        gs.txtGame.setText(R.string.story_six_five)

        showAllButton()

        gs.btnGame1.text = "Пойти в комнату" //6.51
        gs.btnGame2.text = "Остаться в холле" //6.61

        nextPosition1 = "sixFiveOne"
        nextPosition2 = "sixSixOne"

        gs.btnGame3.visibility = View.INVISIBLE
    }

    @SuppressLint("SetTextI18n")
    fun sixSix() {
        gs.textTitle.text = "Берлин. 1941..."
        gs.imgGame.setImageResource(R.drawable.franc_lizi)
        gs.txtGame.setText(R.string.story_six_six)

        showAllButton()


        gs.btnGame1.text = "Дальше" //6.7

        nextPosition1 = "sixSeven"

        gs.btnGame2.visibility = View.INVISIBLE
        gs.btnGame3.visibility = View.INVISIBLE
    }

    @SuppressLint("SetTextI18n")
    fun sixSeven() {
        gs.textTitle.text = "Берлин. 1941..."
        gs.imgGame.setImageResource(R.drawable.salon_kitty)
        gs.txtGame.setText(R.string.story_six_seven)

        showAllButton()


        gs.btnGame1.text = "Дальше" //28

        nextPosition1 = "twentyEight"

        gs.btnGame2.visibility = View.INVISIBLE
        gs.btnGame3.visibility = View.INVISIBLE
    }

    @SuppressLint("SetTextI18n")
    fun sixFiveOne() {
        gs.textTitle.text = "Берлин. 1941..."
        gs.imgGame.setImageResource(R.drawable.franc_lizi)
        gs.txtGame.setText(R.string.story_six_five_one)

        showAllButton()


        gs.btnGame1.text = "Спустя время" //6.7

        nextPosition1 = "sixSeven"

        gs.btnGame2.visibility = View.INVISIBLE
        gs.btnGame3.visibility = View.INVISIBLE
    }

    @SuppressLint("SetTextI18n")
    fun sixSixOne() {
        gs.textTitle.text = "Берлин. 1941..."
        gs.imgGame.setImageResource(R.drawable.img6_3_salon)
        gs.txtGame.setText(R.string.story_six_six_one)

        showAllButton()

        gs.btnGame1.text = "Пойти в комнату" //6.51

        nextPosition1 = "sixFiveOne"

        gs.btnGame2.visibility = View.INVISIBLE
        gs.btnGame3.visibility = View.INVISIBLE
    }

    @SuppressLint("SetTextI18n")
    fun sixSevenOne() {
        gs.textTitle.text = "Берлин. 1941..."
        gs.imgGame.setImageResource(R.drawable.franc_lizi)
        gs.txtGame.setText(R.string.story_six_seven_one)

        showAllButton()

        gs.btnGame1.text = "Спустя время" //6.7

        nextPosition1 = "sixSeven"

        gs.btnGame2.visibility = View.INVISIBLE
        gs.btnGame3.visibility = View.INVISIBLE
    }

    @SuppressLint("SetTextI18n")
    fun thirty() {
        gs.textTitle.text = "Берлин. 1941..."
        gs.imgGame.setImageResource(R.drawable.samoliot)
        gs.txtGame.setText(R.string.story_thirty)

        showAllButton()

        gs.btnGame1.text = "Начать с начала" //1
        gs.btnGame2.text = "Информация об игре" //"infoGame"

        nextPosition1 = "startingPoint"
        nextPosition2 = "infoGame"


        gs.btnGame3.visibility = View.INVISIBLE
    }

    fun infoGame(){
        showAllButton()

        gs.textTitle.text = "Warsaw Rotbart. part I."
        gs.imgGame.setImageResource(R.drawable.game_info)
        gs.txtGame.setText(R.string.info_game)
        gs.btnGame1.setText("Начать с начала") //startingPoint
        gs.btnGame2.setText("")
        gs.btnGame3.setText("")


        gs.btnGame2.setVisibility(View.INVISIBLE)
        gs.btnGame3.setVisibility(View.INVISIBLE)

        nextPosition1 = "startingPoint"

    }
}
