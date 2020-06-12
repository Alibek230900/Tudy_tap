package com.example.flag

object Constants{

    const val USER_NAME:String="user_name"
    const val TOTAL_QUESTIONS:String="total_question"
    const val CORRECT_ANSWERS:String="correct_answers"

    fun getQuestions():ArrayList<Question>{
        val questionList=ArrayList<Question>()
        val que1=Question(1,"Қай елдің туы?",
        R.drawable.austria,
            "Aустрия",
            "Moнaкo",
            "Польша",
            "Ирландия",
            1
        )
        questionList.add(que1)

        val que2=Question(2,"Қай елдің туы?",
        R.drawable.hungary,
        "Нигер",
        "Maльтa",
        "Германия",
        "Венгрия",
         4
        )
        questionList.add(que2)

        val que3=Question(3,"Қай елдің туы?",
        R.drawable.algeria,
        "Тунис",
        "Судан",
        "Aлжир",
        "Moрокко",
        3
        )
        questionList.add(que3)

        val que4=Question(4,"Қай елдің туы?",
        R.drawable.czechrepublic,
        "Нигерия",
        "Литьва",
        "Чехия",
        "Латвия",
        3)
        questionList.add(que4)

        val que5=Question(5,"Қай елдің туы?",
        R.drawable.qatar,
        "Катар",
        "Оман",
        "Бахрейн",
        "Eгипет",
            1
        )
        questionList.add(que5)

        val que6=Question(6,"Қай елдің туы?",
        R.drawable.qazaqstan,
        "Қазақ елі",
        "Қазақстан",
        "Қазақ хандығы",
        "Ваканда",
        2)
        questionList.add(que6)

        val que7=Question(7,"Қай елдің туы?",
        R.drawable.sweden,
        "Дания",
        "Швейцария",
        "Швеция",
        "Исландия",
        3)
        questionList.add(que7)

        val que8=Question(8,"Mynau qanday el?",
        R.drawable.saudiarabia,
        "Сауд Арабиясы",
        "БАӘ",
        "Йемен",
        "Сирия",
        1)
        questionList.add(que8)

        val que9=Question(9,"Қай елдің туы?",
        R.drawable.croatia,
        "Сербия",
        "Словакия",
        "Словения",
        "Хорватия",
        4)
        questionList.add(que9)

        val que10=Question(10,"Қай елдің туы?",
        R.drawable.singapore,
        "Малайзия",
        "Сингапур",
        "Жапония",
        "Қытай",
        2)

        questionList.add(que10)

        return questionList

    }
}