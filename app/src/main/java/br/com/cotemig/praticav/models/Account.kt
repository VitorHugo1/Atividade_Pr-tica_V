package br.com.cotemig.praticav.models

import kotlin.random.Random

data class Account(
    var accountNumber : Int,

) {
    var name : String = ""
    var phone : String = ""
    var birthDate : String = ""
    var balance : Double = 0.0



//    fun copy(account: Account) : Account{
//        account.accountNumber = this.accountNumber
//        account.name = this.name
//        account.phone = this.phone
//        account.birthDate = this.birthDate
//        account.balance = this.balance
//        return account
//    }

    fun checkAccountExist(number : Int) : Boolean{
        return number == this.accountNumber
    }

    fun depositValue(value : Double){
        if (value > 0){
            this.balance += value
        }
    }

}

