package lantashackathon.raihan.com.lantashackathon;

import android.content.Context;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CursorAdapter;
import android.widget.GridLayout;
import android.widget.LinearLayout;

/**
 * Created by raihan on 1/30/16.
 */
public class ContactCursorAdapter extends CursorAdapter {


    public ContactCursorAdapter(Context context, Cursor c, boolean autoRequery) {
        super(context, c, autoRequery);
    }

    @Override
    public View newView(Context context, Cursor cursor, ViewGroup viewGroup) {
        LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = (LinearLayout) inflater.inflate(
                R.layout.cursorrow, viewGroup,
                false);
        return view;
    }

    @Override
    public void bindView(View view, Context context, Cursor cursor) {

    }
}
