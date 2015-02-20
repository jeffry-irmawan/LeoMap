package com.leo;

import android.os.Bundle;
import android.view.View;
import android.app.Activity;
import android.content.Intent;

public class home extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home);
    }
    public void alam(View view) {
		Intent intent = new Intent(this, Alam.class);
		startActivity(intent);
		
	}
    public void belanja(View view) {
		Intent intent = new Intent(this, Belanja.class);
		startActivity(intent);
 }
    public void keluarga(View view) {
		Intent intent = new Intent(this, Keluarga.class);
		startActivity(intent);
 }
    public void sejarah(View view) {
  		Intent intent = new Intent(this, Sejarah.class);
  		startActivity(intent);
   }
    public void kuliner(View view) {
  		Intent intent = new Intent(this, Kuliner.class);
  		startActivity(intent);
   }
}