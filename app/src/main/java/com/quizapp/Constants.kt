package com.quizapp

import com.quizapp.R
import com.quizapp.Question

object Constants {

    // TODO (STEP 1: Create a constant variables which we required in the result screen.)
    // START
    const val USER_NAME: String = "user_name"
    const val TOTAL_QUESTIONS: String = "total_questions"
    const val CORRECT_ANSWERS: String = "correct_answers"
    // END
    
    fun getQuestions(): ArrayList<Question> {
        val questionsList = ArrayList<Question>()

        val que1= Question(1,
            "Which team has India defeated to reach the Semi Finals of Olympics Hockey 2020?",
            R.drawable.que1,
            "Britain",
            "Pakistan",
            "China",
            "Japan",
            1)
        questionsList.add(que1)

        val que2= Question(2,
            "Which country has won the highest number of Olympic medals till date?",
            R.drawable.que2,
            "China",
            "Japan",
            "USA",
            "Britain",
            3)
        questionsList.add(que2)

        val que3= Question(3,
            "Which year did the torch burning relay start in the Olympics?",
            R.drawable.que3,
            "1932",
            "1936",
            "1940",
            "1964",
            2)
        questionsList.add(que3)

        val que4= Question(4,
            "In which of the following years has India won the gold in Hockey in Olympic games?",
            R.drawable.que4,
            "1928",
            "1932",
            "1936",
            "All of the above",
            4)
        questionsList.add(que4)

        val que5= Question(5,
            "Which medal did Mary Kom win in the London Olympics 2012?",
            R.drawable.que5,
            "GOld",
            "Silver",
            "Bronze",
            "None",
            3)
        questionsList.add(que5)

        val que6= Question(6,
            "Who is the current captain of the India Hockey team (Men)?",
            R.drawable.que6,
            "Manpreet Singh",
            "K D Singh",
            "Bharat Chetri",
            "P R Shreejesh",
            1)
        questionsList.add(que6)

        val que7= Question(7,
            "Which of the following athletes wore a parachute while flying to 1960 Olympics??",
            R.drawable.que7,
            "Muhammed Ali",
            "Dhyan Chand",
            "Mike Tyson",
            "None of the above",
            1)
        questionsList.add(que7)

        val que8= Question(8,
            "Who is the fisrt ever Indian Fencer to qualify for the Olympic Games?",
            R.drawable.que8,
            "Kavita Devi",
            "Bhavani Devi",
            "Shilpa Garg",
            "Pooja Mishra",
            2)
        questionsList.add(que8)

        val que9= Question(9,
            "What is the Tokyo Olympics 2020 mascot?",
            R.drawable.que9,
            "Hodori",
            "Amik",
            "Fuwa",
            "Miraitowa",
            1)
        questionsList.add(que9)

        val que10= Question(10,
            "At which of the following Olympics were Gold medars made of pure gold last awarded?",
            R.drawable.que10,
            "1912",
            "1920",
            "1936",
            "1948",
            1)
        questionsList.add(que10)

        return questionsList
    }
}