package a.a;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class Result extends Activity {
	TextView t;
	Button b1,b2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.result);
        b1=(Button)findViewById(R.id.bsub);
        b2=(Button)findViewById(R.id.bstart);
        t=(TextView)findViewById(R.id.result1);
        Intent o=getIntent();
        t.setText((o.getStringExtra("data"))+"0%");
        
        b1.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent i=new Intent(Result.this,Subject.class);
				i.putExtra("name", "again!");
				startActivity(i);
			}
		});
        b2.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent i=new Intent(Result.this,MainActivity.class);
				startActivity(i);
			}
		});
    }
    
}
