package makx.fourqueengame;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button[][] btn = new Button[5][5];
    final int [][] buttonId = new int[][] {
            {R.id.button00, R.id.button01, R.id.button02, R.id.button03, R.id.button04,},
            {R.id.button10, R.id.button11, R.id.button12, R.id.button13, R.id.button14,},
            {R.id.button20, R.id.button21, R.id.button22, R.id.button23, R.id.button24,},
            {R.id.button30, R.id.button31, R.id.button32, R.id.button33, R.id.button34,},
            {R.id.button40, R.id.button41, R.id.button42, R.id.button43, R.id.button44,},
    };

    String txt;

    Button submitButton, clearButton;

    int arr[] = new int[25];
    int top = -1;
    Boolean result = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        for(int i = 0; i < 5; i++)
            for(int j = 0; j < 5; j++)
            {
                btn[i][j]= (Button) findViewById(buttonId[i][j]);
                btn[i][j].setOnClickListener(this);
            }

        submitButton = (Button) findViewById(R.id.submitbutton);

        clearButton = (Button) findViewById(R.id.clearButton);

        clearButton.setOnClickListener(this);

        submitButton.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){

            case (R.id.button00):
                txt = btn[0][0].getText().toString();
                if(txt.equals(getString(R.string.space))){
                    btn[0][0].setText(getString(R.string.queenShape));
                }
                else{
                    btn[0][0].setText(getString(R.string.space));
                }
                break;

            case (R.id.button01):
                txt = btn[0][1].getText().toString();
                if(txt.equals(getString(R.string.space))){
                    btn[0][1].setText(getString(R.string.queenShape));
                }
                else{
                    btn[0][1].setText(getString(R.string.space));
                }
                break;

            case (R.id.button02):
                txt = btn[0][2].getText().toString();
                if(txt.equals(getString(R.string.space))){
                    btn[0][2].setText(getString(R.string.queenShape));
                }
                else{
                    btn[0][2].setText(getString(R.string.space));
                }
                break;

            case (R.id.button03):
                txt = btn[0][3].getText().toString();
                if(txt.equals(getString(R.string.space))){
                    btn[0][3].setText(getString(R.string.queenShape));
                }
                else{
                    btn[0][3].setText(getString(R.string.space));
                }
                break;

            case (R.id.button04):
                txt = btn[0][4].getText().toString();
                if(txt.equals(getString(R.string.space))){
                    btn[0][4].setText(getString(R.string.queenShape));
                }
                else{
                    btn[0][4].setText(getString(R.string.space));
                }
                break;

            case (R.id.button10):
                txt = btn[1][0].getText().toString();
                if(txt.equals(getString(R.string.space))){
                    btn[1][0].setText(getString(R.string.queenShape));
                }
                else{
                    btn[1][0].setText(getString(R.string.space));
                }
                break;

            case (R.id.button11):
                txt = btn[1][1].getText().toString();
                if(txt.equals(getString(R.string.space))){
                    btn[1][1].setText(getString(R.string.queenShape));
                }
                else{
                    btn[1][1].setText(getString(R.string.space));
                }
                break;

            case (R.id.button12):
                txt = btn[1][2].getText().toString();
                if(txt.equals(getString(R.string.space))){
                    btn[1][2].setText(getString(R.string.queenShape));
                }
                else{
                    btn[1][2].setText(getString(R.string.space));
                }
                break;

            case (R.id.button13):
                txt = btn[1][3].getText().toString();
                if(txt.equals(getString(R.string.space))){
                    btn[1][3].setText(getString(R.string.queenShape));
                }
                else{
                    btn[1][3].setText(getString(R.string.space));
                }
                break;

            case (R.id.button14):
                txt = btn[1][4].getText().toString();
                if(txt.equals(getString(R.string.space))){
                    btn[1][4].setText(getString(R.string.queenShape));
                }
                else{
                    btn[1][4].setText(getString(R.string.space));
                }
                break;

            case (R.id.button20):
                txt = btn[2][0].getText().toString();
                if(txt.equals(getString(R.string.space))){
                    btn[2][0].setText(getString(R.string.queenShape));
                }
                else{
                    btn[2][0].setText(getString(R.string.space));
                }
                break;

            case (R.id.button21):
                txt = btn[2][1].getText().toString();
                if(txt.equals(getString(R.string.space))){
                    btn[2][1].setText(getString(R.string.queenShape));
                }
                else{
                    btn[2][1].setText(getString(R.string.space));
                }
                break;

            case (R.id.button22):
                txt = btn[2][2].getText().toString();
                if(txt.equals(getString(R.string.space))){
                    btn[2][2].setText(getString(R.string.queenShape));
                }
                else{
                    btn[2][2].setText(getString(R.string.space));
                }
                break;

            case (R.id.button23):
                txt = btn[2][3].getText().toString();
                if(txt.equals(getString(R.string.space))){
                    btn[2][3].setText(getString(R.string.queenShape));
                }
                else{
                    btn[2][3].setText(getString(R.string.space));
                }
                break;

            case (R.id.button24):
                txt = btn[2][4].getText().toString();
                if(txt.equals(getString(R.string.space))){
                    btn[2][4].setText(getString(R.string.queenShape));
                }
                else{
                    btn[2][4].setText(getString(R.string.space));
                }
                break;

            case (R.id.button30):
                txt = btn[3][0].getText().toString();
                if(txt.equals(getString(R.string.space))){
                    btn[3][0].setText(getString(R.string.queenShape));
                }
                else{
                    btn[3][0].setText(getString(R.string.space));
                }
                break;

            case (R.id.button31):
                txt = btn[3][1].getText().toString();
                if(txt.equals(getString(R.string.space))){
                    btn[3][1].setText(getString(R.string.queenShape));
                }
                else{
                    btn[3][1].setText(getString(R.string.space));
                }
                break;

            case (R.id.button32):
                txt = btn[3][2].getText().toString();
                if(txt.equals(getString(R.string.space))){
                    btn[3][2].setText(getString(R.string.queenShape));
                }
                else{
                    btn[3][2].setText(getString(R.string.space));
                }
                break;

            case (R.id.button33):
                txt = btn[3][3].getText().toString();
                if(txt.equals(getString(R.string.space))){
                    btn[3][3].setText(getString(R.string.queenShape));
                }
                else{
                    btn[3][3].setText(getString(R.string.space));
                }
                break;

            case (R.id.button34):
                txt = btn[3][4].getText().toString();
                if(txt.equals(getString(R.string.space))){
                    btn[3][4].setText(getString(R.string.queenShape));
                }
                else{
                    btn[3][4].setText(getString(R.string.space));
                }
                break;

            case (R.id.button40):
                txt = btn[4][0].getText().toString();
                if(txt.equals(getString(R.string.space))){
                    btn[4][0].setText(getString(R.string.queenShape));
                }
                else{
                    btn[4][0].setText(getString(R.string.space));
                }
                break;

            case (R.id.button41):
                txt = btn[4][1].getText().toString();
                if(txt.equals(getString(R.string.space))){
                    btn[4][1].setText(getString(R.string.queenShape));
                }
                else{
                    btn[4][1].setText(getString(R.string.space));
                }
                break;

            case (R.id.button42):
                txt = btn[4][2].getText().toString();
                if(txt.equals(getString(R.string.space))){
                    btn[4][2].setText(getString(R.string.queenShape));
                }
                else{
                    btn[4][2].setText(getString(R.string.space));
                }
                break;

            case (R.id.button43):
                txt = btn[4][3].getText().toString();
                if(txt.equals(getString(R.string.space))){
                    btn[4][3].setText(getString(R.string.queenShape));
                }
                else{
                    btn[4][3].setText(getString(R.string.space));
                }
                break;

            case (R.id.button44):
                txt = btn[4][4].getText().toString();
                if(txt.equals(getString(R.string.space))){
                    btn[4][4].setText(getString(R.string.queenShape));
                }
                else{
                    btn[4][4].setText(getString(R.string.space));
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

            case (R.id.clearButton):
                for( int i = 0; i < 5; i++)
                    for( int j = 0; j < 5; j++){
                        btn[i][j].setText(getString(R.string.space));
                    }
                break;

        }

    }

    private void checkResult() {


    }


}
