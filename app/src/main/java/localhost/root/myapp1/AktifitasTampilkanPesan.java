/**
 * 2016 02 27 Erlang Parasu
 */

package localhost.root.myapp1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class AktifitasTampilkanPesan extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aktifitas_tampilkan_pesan);

        Intent i = getIntent();
        String isiPesan = i.getStringExtra(MainActivity.PESAN);

        TextView tv = new TextView(this);
        tv.setTextSize(18);
        tv.setText(isiPesan);

        RelativeLayout rl = (RelativeLayout) findViewById(R.id.relative_layout);
        rl.addView(tv);
    }
}
