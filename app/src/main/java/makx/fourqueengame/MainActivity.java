package makx.fourqueengame;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
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

    Button submitButton, clearButton, button4x4, button5x5, button6x6;

    int stack[] = new int[25];
    int sTop = -1;
    int result ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        button4x4 = (Button) findViewById(R.id.button4x4);

        button4x4.setOnClickListener(this);

        button5x5 = (Button) findViewById(R.id.button5x5);

        button5x5.setOnClickListener(this);

        button6x6 = (Button) findViewById(R.id.button6x6);

        button6x6.setOnClickListener(this);

    }

    /*@Override
    protected void onResume() {
        super.onResume();
        setContentView(R.layout.activity_menu);

        button4x4 = (Button) findViewById(R.id.button4x4);

        button4x4.setOnClickListener(this);

        button5x5 = (Button) findViewById(R.id.button5x5);

        button5x5.setOnClickListener(this);

        button6x6 = (Button) findViewById(R.id.button6x6);

        button6x6.setOnClickListener(this);
    }*/

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case (R.id.submitbutton):
                result = checkResult();
                if (result == -1) {
                    Toast.makeText(this, "you fail!", Toast.LENGTH_SHORT).show();
                    break;
                }
                else{
                    Toast.makeText(this, "you pass!", Toast.LENGTH_SHORT).show();
                    break;
                }

            case (R.id.clearButton):
                for( int i = 0; i < 5; i++)
                    for( int j = 0; j < 5; j++){
                        btn[i][j].setText(getString(R.string.space));
                    }
                sTop = -1;
                break;

            case (R.id.button4x4):
                Toast.makeText(this, "Not working yet, try 5x5", Toast.LENGTH_SHORT).show();
                break;

            case (R.id.button5x5):
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
                break;

            case (R.id.button6x6):
                Toast.makeText(this, "Not working yet, try 5x5", Toast.LENGTH_SHORT).show();
                break;

            default:
                for( int i = 0; i < 5; i++)
                    for( int j = 0; j < 5; j++){
                        if (view.getId() == buttonId[i][j]){
                            txt = btn[i][j].getText().toString();
                            if(txt.equals(getString(R.string.space))){
                                btn[i][j].setText(getString(R.string.queenShape));
                            }
                            else{
                                btn[i][j].setText(getString(R.string.space));
                            }
                            break;
                        }
                    }

        }

    }

    private int checkResult() {
        sTop = -1;
        for( int i = 0; i < 5; i++)
            for( int j = 0; j < 5; j++){
                if (btn[i][j].getText().toString().equals(getString(R.string.queenShape))){
                    sTop++;
                    stack[sTop] = j;
                }
            }
        if (sTop != 4){
            Log.i("fail","sTop!=4");
            return -1;
        }

        for ( int i = 1; i <= sTop; i++ ) {
            for (int j = 0; j < i; j++) {
                if (stack[i] == stack[j]) {
                    Log.i("fail","stack["+i+"] == stack["+j+"]");
                    return -1;
                }
            }
        }
        for (int i = 1; i <= sTop; i++){
            for (int j = 0; j < i; j++){
                if ( (stack[i] - i) == (stack[j] - j) ){
                    Log.i("fail","(stack["+i+"]"+stack[i]+" - "+i+") == (stack["+j+"]"+stack[j]+" - "+j+")");
                    return -1;
                }
            }
        }
        for (int i = 1; i <= sTop; i++){
            for (int j = 0; j < i; j++){
                if ( ((stack[i] + i) == (stack[j] + j)) ){
                    Log.i("fail","(stack["+i+"]"+stack[i]+" + "+i+") == (stack["+j+"]"+stack[j]+" + "+j+")");
                    return -1;
                }
            }
        }


        return 1;
    }
}



