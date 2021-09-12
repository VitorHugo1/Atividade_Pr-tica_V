package br.com.cotemig.praticav.models

import kotlin.random.Random

class Account {
    var name : String = ""
    var phone : String = ""
    var birthDate : String = ""
    var balance : Double = 0.0
    var accountNumber : Int = 0

    fun createAccount(name : String, phone : String, birthDate : String){
        this.name = name
        this.phone = phone
        this.birthDate = birthDate
        this.balance = 0.0
        this.accountNumber = Random.nextInt(1,10)
    }
}

