package br.com.cotemig.praticav

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class BalanceCheckActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_balance_check)
    }
   @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_conta_detalhes);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        linkToXml();

        intent = getIntent();
        if (intent != null) {
            params = intent.getExtras();
            if (params != null) {
                idConta = params.getInt("id");
            }
        }

        preencherDetalhes(getDadosConta());

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent = new Intent(ContaDetalhes.this, ContaEditar.class);
                params.putInt("id", idConta);
                intent.putExtras(params);
                startActivity(intent);
            }
        });
    }
}