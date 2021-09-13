package br.com.cotemig.praticav.ui.activity


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import br.com.cotemig.praticav.R
import br.com.cotemig.praticav.models.Account
import kotlin.random.Random

class CreateAccountActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_create_account)

        var name = findViewById<EditText>(R.id.name)
        var phone = findViewById<EditText>(R.id.phone)
        var birthDate = findViewById<EditText>(R.id.birthDate)
        var btnCreateAccount = findViewById<Button>(R.id.btnCreateAccount)


        btnCreateAccount.setOnClickListener {
            var account = Account()
            var intent = Intent(this, DepositActivity::class.java)
            intent.putExtra("account", account)
            Toast.makeText(this, "Conta ${account.accountNumber} Criada", Toast.LENGTH_LONG).show()
        }

    }
}
