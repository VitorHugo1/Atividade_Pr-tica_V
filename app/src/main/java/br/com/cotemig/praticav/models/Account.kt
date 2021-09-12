package br.com.cotemig.praticav.models

import kotlin.random.Random

class Account {
    var accountNumber : Int = 0
    var name : String = ""
    var phone :  String = ""
    var birthDate : String = ""
    var balance : Double = 0.0

    fun checkAccountExist(number : Int) : Boolean{
        return number == this.accountNumber
    }

    fun depositValue( value : Double){
        if (value > 0){
            this.balance += value
        }
    }

    fun balanceCheck(value : Int) : Double{
        return this.balance
    }

}



