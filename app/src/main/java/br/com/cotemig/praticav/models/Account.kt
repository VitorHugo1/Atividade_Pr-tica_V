package br.com.cotemig.praticav.models

import java.io.Serializable
import kotlin.random.Random

data class Account(
    var accountNumber: Int = Random.nextInt(1,10),
    var name: String = "",
    var phone: String = "",
    var birthDate: String = "",
    var balance: Double = 0.0
):Serializable {


    fun checkAccountExist(number: Int): Boolean {
        return number == this.accountNumber
    }

    fun depositValue(value: Double) {
        if (value > 0) {
            this.balance += value
        }
    }

    fun balanceCheck(value: Int): Double {
        return this.balance
    }

}



