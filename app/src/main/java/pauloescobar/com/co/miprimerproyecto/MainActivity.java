package pauloescobar.com.co.miprimerproyecto;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.txtName)
    EditText txtName;
    @BindView(R.id.btnAceptar)
    Button btnAceptar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }


    public void btnAceptarOnClick(View view){
        String nombre= txtName.getText().toString();
        if(!"".equals(nombre)){ //esto significa que el nombre no viene null
                String messaje="hola".concat(txtName.getText().toString());
                Toast.makeText(getApplicationContext(),messaje,Toast.LENGTH_SHORT).show();
        }
        else{
            txtName.setError(getString(R.string.required_name));
        }
    }
    public void btnAbrirPantalla(View view)
    {
        Intent intent = new Intent(MainActivity.this,SecondActivity.class);
        startActivity(intent);
    }
}

