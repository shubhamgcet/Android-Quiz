package a.a;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;


public class Subject extends Activity implements OnClickListener{
	TextView t;
	Button b1,b2,b3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.subject);
        t=(TextView)findViewById(R.id.textView1);
        Intent o=getIntent();
        t.setText("Welcome "+o.getStringExtra("name"));
        b1=(Button)findViewById(R.id.button1);
        b1.setOnClickListener(this);
        b2=(Button)findViewById(R.id.button2);
        b2.setOnClickListener(this);
        b3=(Button)findViewById(R.id.button3);
        b3.setOnClickListener(this);
    }
	@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
		Intent i1,i2,i3;
		i1=new Intent(Subject.this,Q1.class);
		i2=new Intent(Subject.this,Q2.class);
		i3=new Intent(Subject.this,Q3.class);
		switch(arg0.getId())
		{
		case R.id.button1: startActivity(i1);
							break;
		case R.id.button2: startActivity(i2);
							break;
		case R.id.button3: startActivity(i3);
							break;
		}
		
	}
}
