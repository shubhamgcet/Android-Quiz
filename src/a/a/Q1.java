package a.a;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.RadioButton;


public class Q1 extends Activity {
	RadioButton r1,r2,r3,r4,r5;
	Button b;
	@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.q1);
        r1=(RadioButton)findViewById(R.id.radio110);
        r2=(RadioButton)findViewById(R.id.radio122);
        r3=(RadioButton)findViewById(R.id.radio130);
        r4=(RadioButton)findViewById(R.id.radio142);
        r5=(RadioButton)findViewById(R.id.radio150);
        
        b=(Button)findViewById(R.id.button1);
        b.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				int m=0;

				if(r1.isChecked()) m=m+2;
				if(r2.isChecked()) m=m+2;
				if(r3.isChecked()) m=m+2;
				if(r4.isChecked()) m=m+2;
				if(r5.isChecked()) m=m+2;
				String s= ""+m;
				
				Intent i=new Intent(Q1.this,Result.class);
				i.putExtra("data",s);
				startActivity(i);
			}
		});
    }
    
}
