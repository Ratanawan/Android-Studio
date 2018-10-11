package com.example.kamal.listviewtestingwithadapter

data class Stud(var name:String, var email:String, var mobile: String)

object StudentContainer
{
    var arrList = listOf<Stud>(
            Stud("Ratanak","ratanak@gmail.com","87774884"),
            Stud("Sreythou","ratanak@gmail.com","87774884"),
            Stud("Nataly","ratanak@gmail.com","87774884"),
            Stud("Manich","ratanak@gmail.com","87774884"),
            Stud("Tieng","ratanak@gmail.com","87774884"),
            Stud("Panha","ratanak@gmail.com","87774884"),
            Stud("Chhay Rith","ratanak@gmail.com","87774884"),
            Stud("Panharith","ratanak@gmail.com","87774884")

    )
}
SEP 17TH, 11:00PM