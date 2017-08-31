package makx.fourqueengame;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    Button btn00;
    Button btn01;
    Button btn02;
    Button btn03;
    Button btn04;

    Button btn10;
    Button btn11;
    Button btn12;
    Button btn13;
    Button btn14;

    Button btn20;
    Button btn21;
    Button btn22;
    Button btn23;
    Button btn24;

    Button btn30;
    Button btn31;
    Button btn32;
    Button btn33;
    Button btn34;

    Button btn40;
    Button btn41;
    Button btn42;
    Button btn43;
    Button btn44;

    String txt;

    Button submitButton;

    int arr[] = new int[25];
    int top = -1;
    Boolean result = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn00 = (Button) findViewById(R.id.button00);
        btn01 = (Button) findViewById(R.id.button01);
        btn02 = (Button) findViewById(R.id.button02);
        btn03 = (Button) findViewById(R.id.button03);
        btn04 = (Button) findViewById(R.id.button04);

        btn10 = (Button) findViewById(R.id.button10);
        btn11 = (Button) findViewById(R.id.button11);
        btn12 = (Button) findViewById(R.id.button12);
        btn13 = (Button) findViewById(R.id.button13);
        btn14 = (Button) findViewById(R.id.button14);

        btn20 = (Button) findViewById(R.id.button20);
        btn21 = (Button) findViewById(R.id.button21);
        btn22 = (Button) findViewById(R.id.button22);
        btn23 = (Button) findViewById(R.id.button23);
        btn24 = (Button) findViewById(R.id.button24);

        btn30 = (Button) findViewById(R.id.button30);
        btn31 = (Button) findViewById(R.id.button31);
        btn32 = (Button) findViewById(R.id.button32);
        btn33 = (Button) findViewById(R.id.button33);
        btn34 = (Button) findViewById(R.id.button34);

        btn40 = (Button) findViewById(R.id.button40);
        btn41 = (Button) findViewById(R.id.button41);
        btn42 = (Button) findViewById(R.id.button42);
        btn43 = (Button) findViewById(R.id.button43);
        btn44 = (Button) findViewById(R.id.button44);

        submitButton = (Button) findViewById(R.id.submitbutton);

        btn00.setOnClickListener(this);
        btn01.setOnClickListener(this);
        btn02.setOnClickListener(this);
        btn03.setOnClickListener(this);
        btn04.setOnClickListener(this);

        btn10.setOnClickListener(this);
        btn11.setOnClickListener(this);
        btn12.setOnClickListener(this);
        btn13.setOnClickListener(this);
        btn14.setOnClickListener(this);

        btn20.setOnClickListener(this);
        btn21.setOnClickListener(this);
        btn22.setOnClickListener(this);
        btn23.setOnClickListener(this);
        btn24.setOnClickListener(this);

        btn30.setOnClickListener(this);
        btn31.setOnClickListener(this);
        btn32.setOnClickListener(this);
        btn33.setOnClickListener(this);
        btn34.setOnClickListener(this);

        btn40.setOnClickListener(this);
        btn41.setOnClickListener(this);
        btn42.setOnClickListener(this);
        btn43.setOnClickListener(this);
        btn44.setOnClickListener(this);

        submitButton.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){

            case (R.id.button00):
                txt = btn00.getText().toString();
                if(txt.equals(getString(R.string.space))){
                    btn00.setText(getString(R.string.queenShape));
                }
                else{
                    btn00.setText(getString(R.string.space));
                }
                break;

            case (R.id.button01):
                txt = btn01.getText().toString();
                if(txt.equals(getString(R.string.space))){
                    btn01.setText(getString(R.string.queenShape));
                }
                else{
                    btn01.setText(getString(R.string.space));
                }
                break;

            case (R.id.button02):
                txt = btn02.getText().toString();
                if(txt.equals(getString(R.string.space))){
                    btn02.setText(getString(R.string.queenShape));
                }
                else{
                    btn02.setText(getString(R.string.space));
                }
                break;

            case (R.id.button03):
                txt = btn03.getText().toString();
                if(txt.equals(getString(R.string.space))){
                    btn03.setText(getString(R.string.queenShape));
                }
                else{
                    btn03.setText(getString(R.string.space));
                }
                break;

            case (R.id.button04):
                txt = btn04.getText().toString();
                if(txt.equals(getString(R.string.space))){
                    btn04.setText(getString(R.string.queenShape));
                }
                else{
                    btn04.setText(getString(R.string.space));
                }
                break;

            case (R.id.button10):
                txt = btn10.getText().toString();
                if(txt.equals(getString(R.string.space))){
                    btn10.setText(getString(R.string.queenShape));
                }
                else{
                    btn10.setText(getString(R.string.space));
                }
                break;

            case (R.id.button11):
                txt = btn11.getText().toString();
                if(txt.equals(getString(R.string.space))){
                    btn11.setText(getString(R.string.queenShape));
                }
                else{
                    btn11.setText(getString(R.string.space));
                }
                break;

            case (R.id.button12):
                txt = btn12.getText().toString();
                if(txt.equals(getString(R.string.space))){
                    btn12.setText(getString(R.string.queenShape));
                }
                else{
                    btn12.setText(getString(R.string.space));
                }
                break;

            case (R.id.button13):
                txt = btn13.getText().toString();
                if(txt.equals(getString(R.string.space))){
                    btn13.setText(getString(R.string.queenShape));
                }
                else{
                    btn13.setText(getString(R.string.space));
                }
                break;

            case (R.id.button14):
                txt = btn14.getText().toString();
                if(txt.equals(getString(R.string.space))){
                    btn14.setText(getString(R.string.queenShape));
                }
                else{
                    btn14.setText(getString(R.string.space));
                }
                break;

            case (R.id.button20):
                txt = btn20.getText().toString();
                if(txt.equals(getString(R.string.space))){
                    btn20.setText(getString(R.string.queenShape));
                }
                else{
                    btn20.setText(getString(R.string.space));
                }
                break;

            case (R.id.button21):
                txt = btn21.getText().toString();
                if(txt.equals(getString(R.string.space))){
                    btn21.setText(getString(R.string.queenShape));
                }
                else{
                    btn21.setText(getString(R.string.space));
                }
                break;

            case (R.id.button22):
                txt = btn22.getText().toString();
                if(txt.equals(getString(R.string.space))){
                    btn22.setText(getString(R.string.queenShape));
                }
                else{
                    btn22.setText(getString(R.string.space));
                }
                break;

            case (R.id.button23):
                txt = btn23.getText().toString();
                if(txt.equals(getString(R.string.space))){
                    btn23.setText(getString(R.string.queenShape));
                }
                else{
                    btn23.setText(getString(R.string.space));
                }
                break;

            case (R.id.button24):
                txt = btn24.getText().toString();
                if(txt.equals(getString(R.string.space))){
                    btn24.setText(getString(R.string.queenShape));
                }
                else{
                    btn24.setText(getString(R.string.space));
                }
                break;

            case (R.id.button30):
                txt = btn30.getText().toString();
                if(txt.equals(getString(R.string.space))){
                    btn30.setText(getString(R.string.queenShape));
                }
                else{
                    btn30.setText(getString(R.string.space));
                }
                break;

            case (R.id.button31):
                txt = btn31.getText().toString();
                if(txt.equals(getString(R.string.space))){
                    btn31.setText(getString(R.string.queenShape));
                }
                else{
                    btn31.setText(getString(R.string.space));
                }
                break;

            case (R.id.button32):
                txt = btn32.getText().toString();
                if(txt.equals(getString(R.string.space))){
                    btn32.setText(getString(R.string.queenShape));
                }
                else{
                    btn32.setText(getString(R.string.space));
                }
                break;

            case (R.id.button33):
                txt = btn33.getText().toString();
                if(txt.equals(getString(R.string.space))){
                    btn33.setText(getString(R.string.queenShape));
                }
                else{
                    btn33.setText(getString(R.string.space));
                }
                break;

            case (R.id.button34):
                txt = btn34.getText().toString();
                if(txt.equals(getString(R.string.space))){
                    btn34.setText(getString(R.string.queenShape));
                }
                else{
                    btn34.setText(getString(R.string.space));
                }
                break;

            case (R.id.button40):
                txt = btn40.getText().toString();
                if(txt.equals(getString(R.string.space))){
                    btn40.setText(getString(R.string.queenShape));
                }
                else{
                    btn40.setText(getString(R.string.space));
                }
                break;

            case (R.id.button41):
                txt = btn41.getText().toString();
                if(txt.equals(getString(R.string.space))){
                    btn41.setText(getString(R.string.queenShape));
                }
                else{
                    btn41.setText(getString(R.string.space));
                }
                break;

            case (R.id.button42):
                txt = btn42.getText().toString();
                if(txt.equals(getString(R.string.space))){
                    btn42.setText(getString(R.string.queenShape));
                }
                else{
                    btn42.setText(getString(R.string.space));
                }
                break;

            case (R.id.button43):
                txt = btn43.getText().toString();
                if(txt.equals(getString(R.string.space))){
                    btn43.setText(getString(R.string.queenShape));
                }
                else{
                    btn43.setText(getString(R.string.space));
                }
                break;

            case (R.id.button44):
                txt = btn44.getText().toString();
                if(txt.equals(getString(R.string.space))){
                    btn44.setText(getString(R.string.queenShape));
                }
                else{
                    btn44.setText(getString(R.string.space));
                }
                break;

            case (R.id.submitbutton):
                checkResult();
                if (result) {
                    Toast.makeText(this, "you pass!", Toast.LENGTH_SHORT).show();
                    break;
                }
                else{
                    Toast.makeText(this, "you fail!", Toast.LENGTH_SHORT).show();
                    break;
                }
        }

    }

    private void checkResult() {


    }


}
