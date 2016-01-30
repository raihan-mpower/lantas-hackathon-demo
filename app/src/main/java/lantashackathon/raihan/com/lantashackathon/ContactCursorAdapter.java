package lantashackathon.raihan.com.lantashackathon;

import android.content.Context;
import android.database.Cursor;
import android.provider.ContactsContract;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CursorAdapter;
import android.widget.GridLayout;
import android.widget.LinearLayout;
import android.widget.TextView;

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
        TextView name = (TextView)view.findViewById(R.id.name);
        name.setText(cursor.getString(cursor.getColumnIndex(ContactsContract.Contacts.DISPLAY_NAME_PRIMARY)));
        TextView phone = (TextView)view.findViewById(R.id.phonenumber);
        phone.setText("");
//        phone.setText(cursor.getString(cursor.getColumnIndex(ContactsContract.Contacts.)));


    }
}
