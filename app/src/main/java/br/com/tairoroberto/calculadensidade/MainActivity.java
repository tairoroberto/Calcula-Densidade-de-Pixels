package br.com.tairoroberto.calculadensidade;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity {
    private TextView txtLdpi;
    private TextView txtMdpi;
    private TextView txtHdpi;
    private TextView txtXHdpi;
    private TextView txtXXHdpi;
    private EditText edtValorEmDP;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtLdpi = (TextView)findViewById(R.id.txtLdpi);
        txtMdpi = (TextView)findViewById(R.id.txtMdpi);
        txtHdpi = (TextView)findViewById(R.id.txtHdpi);
        txtXHdpi = (TextView)findViewById(R.id.txtXHpdi);
        txtXXHdpi = (TextView)findViewById(R.id.txtXXHdpi);
        edtValorEmDP = (EditText)findViewById(R.id.edtValorEmDP);

    }

    public void calcularDensidade(View view){
        int dp = Integer.parseInt(edtValorEmDP.getText().toString());

        int ldpi = (int) (dp * 0.75 + 0.5f);
        int mdpi = (int) (dp * 1 + 0.5f);
        int hdpi = (int) (dp * 1.5 + 0.5f);
        int xhpi = (int) (dp * 2 + 0.5f);
        int xxhpi = (int) (dp * 3 + 0.5f);

        txtLdpi.setText(ldpi+"px");
        txtMdpi.setText(mdpi+"px");
        txtHdpi.setText(hdpi+"px");
        txtXHdpi.setText(xhpi+"px");
        txtXXHdpi.setText(xxhpi+"px");

    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
