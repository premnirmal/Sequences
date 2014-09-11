package com.github.premnirmal.sequences;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

/**
 * Created by premnirmal on 9/10/14.
 */
public class NumberAdapter extends BaseAdapter {

    private NumberSequence numberSequence;

    public NumberAdapter(NumberSequence numberSequence) {
        this.numberSequence = numberSequence;
    }

    @Override
    public int getCount() {
        return Integer.MAX_VALUE;
    }

    @Override
    public Number getItem(int position) {
        return numberSequence.getNumber(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Context context = parent.getContext();
        if (convertView == null) {
            convertView = LayoutInflater.from(context).inflate(R.layout.textview, null);
        }
        convertView.setBackgroundColor(RandomColorGenerator.getRandomColorInt());
        ((TextView) convertView).setText(getItem(position).toString());
        return convertView;
    }
}
