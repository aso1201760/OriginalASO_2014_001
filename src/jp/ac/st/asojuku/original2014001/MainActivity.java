package jp.ac.st.asojuku.original2014001;

import java.util.Random;
import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;

import android.view.View;

public class MainActivity extends Activity implements
View.OnClickListener
{


	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);


	}

	@Override
	public void onClick(View v) {
		// TODO 自動生成されたメソッド・スタブ
		switch(v.getId()){ //どのボタンが押されたか判定
		case R.id.btnOK: //btnMsgが押されたから入力
			//エディットテキストから入力内容を取り出す
			EditText etv = (EditText)findViewById(R.id.edtName);
			String inputMsg = etv.getText().toString();

			//Randomクラスのインスタンスを作る
			Random rnd = new Random();
			// 0～から3の4パターンの数字をranに取得
			int ran = rnd.nextInt(4);

			//生成して代入用のIntentインスタンス変数を用意
			Intent intent = null;
			// ranの値によって処理をわける
			switch(ran){
			    case 0:
			    	// 0なら大吉のページへ飛ばす
			    	// インテントのインスタンス生成
			    	intent = new Intent(MainActivity.this, DaikichiActivity.class);
			    	// 次画面のアクティビティ起動
			    	startActivity(intent);
			    	break;
			    case 1:
			    	// 1なら中吉のページへ飛ばす
			    	// インテントのインスタンス生成
			    	intent = newIntent
			}
		}
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {

		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}



}
