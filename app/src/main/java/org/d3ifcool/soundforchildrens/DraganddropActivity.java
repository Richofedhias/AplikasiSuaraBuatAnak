package org.d3ifcool.soundforchildrens;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ClipData;
import android.content.ClipDescription;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.util.Log;
import android.view.DragEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class DraganddropActivity extends AppCompatActivity implements View.OnDragListener, View.OnLongClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_draganddrop);
        getSupportActionBar().setTitle("Game");
        ImageView imgVw = findViewById(R.id.img_ayam);
        ImageView imgVw1 = findViewById(R.id.img_sapi);
        ImageView imgVw2 = findViewById(R.id.img_kodok);
        TextView tvSapi = findViewById(R.id.tv_sapi);
        tvSapi.setTag("Sapi");
        tvSapi.setOnLongClickListener(this);
        TextView tvAyam = findViewById(R.id.tv_ayam);
        tvAyam.setTag("Ayam");
        tvAyam.setOnLongClickListener(this);
        TextView tvKodok = (TextView) findViewById(R.id.tv_kodok);
        tvKodok.setTag("Katak");
        tvKodok.setOnLongClickListener(this);
        findViewById(R.id.textBinatang).setOnDragListener(this);
        findViewById(R.id.layoutBinatang1).setOnDragListener(this);
        findViewById(R.id.layoutBinatang2).setOnDragListener(this);
        findViewById(R.id.layoutBinatang3).setOnDragListener(this);
    }

    @Override
    public boolean onLongClick(View v) {
        ClipData.Item item = new ClipData.Item((CharSequence) v.getTag());
        String[] mimeTypes = {ClipDescription.MIMETYPE_TEXT_PLAIN};
        ClipData data = new ClipData(v.getTag().toString(), mimeTypes, item);
        View.DragShadowBuilder dragshadow = new View.DragShadowBuilder(v);
        v.startDrag(data, dragshadow , v, 0);
        return true;
    }
    @Override
    public boolean onDrag(View v, DragEvent event) {
        int action = event.getAction();
        switch (action) {

            case DragEvent.ACTION_DRAG_STARTED:

                if (event.getClipDescription().hasMimeType(ClipDescription.MIMETYPE_TEXT_PLAIN)) {
                    return true;
                }
                return false;

            case DragEvent.ACTION_DRAG_ENTERED:
                v.getBackground().setColorFilter(Color.GRAY, PorterDuff.Mode.SRC_IN);
                v.invalidate();
                return true;

            case DragEvent.ACTION_DRAG_LOCATION:
                return true;

            case DragEvent.ACTION_DRAG_EXITED:
                v.getBackground().clearColorFilter();
                v.invalidate();
                return true;

            case DragEvent.ACTION_DROP:
                ClipData.Item item = event.getClipData().getItemAt(0);
                String dragData = item.getText().toString();
                Toast.makeText(this, "Objek di drag " + dragData, Toast.LENGTH_SHORT).show();
                v.getBackground().clearColorFilter();
                v.invalidate();

                View vw = (View) event.getLocalState();
                ViewGroup owner = (ViewGroup) vw.getParent();
                owner.removeView(vw);
                LinearLayout container = (LinearLayout) v;
                container.addView(vw);
                vw.setVisibility(View.VISIBLE);
                return true;

            case DragEvent.ACTION_DRAG_ENDED:
                v.getBackground().clearColorFilter();
                v.invalidate();
                if (event.getResult())
                    Toast.makeText(this, "Drop berhasil.", Toast.LENGTH_SHORT).show();
                else
                    Toast.makeText(this, "Drop gagal", Toast.LENGTH_SHORT).show();
                return true;
            default:
                Log.e("DragDrop", "Perintah tidak diketahui OnDragListener.");
                break;
        }
        return false;

        //TODO : mencoba login
    }
}
