package br.com.cotemig.praticav.ui.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import br.com.cotemig.praticav.R
import br.com.cotemig.praticav.models.Account

class BalanceCheckActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_balance_check)

        var accountNumber = findViewById<EditText>(R.id.accountNumber)
        var btnShowBalance = findViewById<Button>(R.id.btnShowBalance)
        var balanceValue = findViewById<TextView>(R.id.balanceValue)


        btnShowBalance.setOnClickListener {

        }


    }
}