package br.com.cotemig.praticav.ui.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import br.com.cotemig.praticav.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var btnCreateAccount = findViewById<Button>(R.id.btnCreateAccount)
        btnCreateAccount.setOnClickListener {
            showCreateAccount()
        }

        var btnDeposit = findViewById<Button>(R.id.btnDeposit)
        btnDeposit.setOnClickListener {
            showDeposit()
        }

        var btnWithdraw = findViewById<Button>(R.id.btnWithdraw)
        btnWithdraw.setOnClickListener {
            showWithdraw()
        }

        var btnBalanceCheck = findViewById<Button>(R.id.btnBalanceCheck)
        btnBalanceCheck.setOnClickListener {
            showBalance()
        }

    }

    fun showBalance(){
        var intent = Intent(this, BalanceCheckActivity::class.java)
        startActivity(intent)
    }

    fun showCreateAccount(){
        var intent = Intent(this, CreateAccountActivity::class.java)
        startActivity(intent)
    }

    fun showDeposit(){
        var intent = Intent(this, DepositActivity::class.java)
        startActivity(intent)
    }

    fun showWithdraw(){
        var intent = Intent(this, WithdrawActivity::class.java)
        startActivity(intent)
    }
}