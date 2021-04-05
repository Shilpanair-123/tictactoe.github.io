package com.tictactoe.tictacgame;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import  android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        boardView = (BoardView) findViewBYId(R.id.board);
        gameEngine = new gameEngine();
        boardView.setgameEngine(gameEngine);
        boardView.setMainActivity(this);
    }

    private Object findViewBYId(int board) {
        return null;
    }


    @Override
public boolean onCreateOptionsMenu(Menu menu) {
    getMenuInflater().inflate(R.menu.main, menu);
    return super.onCreateOptionsMenu(menu);
}
@Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(item.getItemId() == R.id.action_new_game) {
            newGame();
        }
    return super.OnOptionsItemSelelected(item);

}
        public void gameEnded(char c){
        String msg = (c =='T') ? "Game Ended..Tie" : "Game Ended." + c +"win";
        new AlertDialog.Builder(this).setTitle("Tic Tac Toe").
                setMessage(msg).
                setOnDismissListener(new OnDismissListener()) {
                @Override
                public void onDismiss(DialogInterface dialogInterface){
                    newGame();
                }
            }).show();

                }
                private void newGame(){
                    gameEngine.newGame();
                boardView.invalidate();

            }
}


