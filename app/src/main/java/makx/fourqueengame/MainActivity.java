package makx.fourqueengame;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    Button btn00;
    Button btn01;
    Button btn02;
    Button btn03;

    Button btn10;
    Button btn11;
    Button btn12;
    Button btn13;

    Button btn20;
    Button btn21;
    Button btn22;
    Button btn23;

    Button btn30;
    Button btn31;
    Button btn32;
    Button btn33;

    String txt;

    Button submitButton;

    int arr[] = new int[4];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn00 = (Button) findViewById(R.id.button00);
        btn01 = (Button) findViewById(R.id.button01);
        btn02 = (Button) findViewById(R.id.button02);
        btn03 = (Button) findViewById(R.id.button03);

        btn10 = (Button) findViewById(R.id.button10);
        btn11 = (Button) findViewById(R.id.button11);
        btn12 = (Button) findViewById(R.id.button12);
        btn13 = (Button) findViewById(R.id.button13);

        btn20 = (Button) findViewById(R.id.button20);
        btn21 = (Button) findViewById(R.id.button21);
        btn22 = (Button) findViewById(R.id.button22);
        btn23 = (Button) findViewById(R.id.button23);

        btn30 = (Button) findViewById(R.id.button30);
        btn31 = (Button) findViewById(R.id.button31);
        btn32 = (Button) findViewById(R.id.button32);
        btn33 = (Button) findViewById(R.id.button33);

        submitButton = (Button) findViewById(R.id.submitbutton);

        btn00.setOnClickListener(this);
        btn01.setOnClickListener(this);
        btn02.setOnClickListener(this);
        btn03.setOnClickListener(this);

        btn10.setOnClickListener(this);
        btn11.setOnClickListener(this);
        btn12.setOnClickListener(this);
        btn13.setOnClickListener(this);

        btn20.setOnClickListener(this);
        btn21.setOnClickListener(this);
        btn22.setOnClickListener(this);
        btn23.setOnClickListener(this);

        btn30.setOnClickListener(this);
        btn31.setOnClickListener(this);
        btn32.setOnClickListener(this);
        btn33.setOnClickListener(this);

        submitButton.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){

            case (R.id.button00):
                txt = btn00.getText().toString();
                if(txt.equals("  ")){
                    btn00.setText("♛");
                }
                else{
                    btn00.setText("  ");
                }
                break;

            case (R.id.button01):
                txt = btn01.getText().toString();
                if(txt.equals("  ")){
                    btn01.setText("♛");
                }
                else{
                    btn01.setText("  ");
                }
                break;

            case (R.id.button02):
                txt = btn02.getText().toString();
                if(txt.equals("  ")){
                    btn02.setText("♛");
                }
                else{
                    btn02.setText("  ");
                }
                break;

            case (R.id.button03):
                txt = btn03.getText().toString();
                if(txt.equals("  ")){
                    btn03.setText("♛");
                }
                else{
                    btn03.setText("  ");
                }
                break;

            case (R.id.button10):
                txt = btn10.getText().toString();
                if(txt.equals("  ")){
                    btn10.setText("♛");
                }
                else{
                    btn10.setText("  ");
                }
                break;

            case (R.id.button11):
                txt = btn11.getText().toString();
                if(txt.equals("  ")){
                    btn11.setText("♛");
                }
                else{
                    btn11.setText("  ");
                }
                break;

            case (R.id.button12):
                txt = btn12.getText().toString();
                if(txt.equals("  ")){
                    btn12.setText("♛");
                }
                else{
                    btn12.setText("  ");
                }
                break;

            case (R.id.button13):
                txt = btn13.getText().toString();
                if(txt.equals("  ")){
                    btn13.setText("♛");
                }
                else{
                    btn13.setText("  ");
                }
                break;

            case (R.id.button20):
                txt = btn20.getText().toString();
                if(txt.equals("  ")){
                    btn20.setText("♛");
                }
                else{
                    btn20.setText("  ");
                }
                break;

            case (R.id.button21):
                txt = btn21.getText().toString();
                if(txt.equals("  ")){
                    btn21.setText("♛");
                }
                else{
                    btn21.setText("  ");
                }
                break;

            case (R.id.button22):
                txt = btn22.getText().toString();
                if(txt.equals("  ")){
                    btn22.setText("♛");
                }
                else{
                    btn22.setText("  ");
                }
                break;

            case (R.id.button23):
                txt = btn23.getText().toString();
                if(txt.equals("  ")){
                    btn23.setText("♛");
                }
                else{
                    btn23.setText("  ");
                }
                break;

            case (R.id.button30):
                txt = btn30.getText().toString();
                if(txt.equals("  ")){
                    btn30.setText("♛");
                }
                else{
                    btn30.setText("  ");
                }
                break;

            case (R.id.button31):
                txt = btn31.getText().toString();
                if(txt.equals("  ")){
                    btn31.setText("♛");
                }
                else{
                    btn31.setText("  ");
                }
                break;

            case (R.id.button32):
                txt = btn32.getText().toString();
                if(txt.equals("  ")){
                    btn32.setText("♛");
                }
                else{
                    btn32.setText("  ");
                }
                break;

            case (R.id.button33):
                txt = btn33.getText().toString();
                if(txt.equals("  ")){
                    btn33.setText("♛");
                }
                else{
                    btn33.setText("  ");
                }
                break;

            case (R.id.submitbutton):

        }

    }
}
