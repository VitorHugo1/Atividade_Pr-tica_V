package br.com.cotemig.praticav.ui.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import br.com.cotemig.praticav.R
import br.com.cotemig.praticav.models.Account

class DepositActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_deposit)

        var accountNumber = findViewById<EditText>(R.id.accountNumber)
        var value = findViewById<EditText>(R.id.depositValue)
        var btnDeposit = findViewById<Button>(R.id.btnDeposit)
        var account = Account()

        btnDeposit.setOnClickListener {
            if (account.chekAccountExist(accountNumber.text.toString().toInt())){
                account.depositValue(value.text.toString().toDouble())
                Toast.makeText(this, "Deposito Realizado", Toast.LENGTH_LONG).show()
            } else{
                Toast.makeText(this, "A conta ${accountNumber.text} não existe", Toast.LENGTH_LONG).show()
            }
        }

    }
}