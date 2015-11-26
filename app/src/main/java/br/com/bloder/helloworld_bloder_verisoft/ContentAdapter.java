package br.com.bloder.helloworld_bloder_verisoft;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.util.List;

import br.com.bloder.helloworld_bloder_verisoft.repo.values.Deviation;
import br.com.bloder.helloworld_bloder_verisoft.repo.values.DeviationList;

/**
 * Created by denis on 18/11/15.
 */
public class ContentAdapter extends BaseAdapter {

    private List<Deviation> deviationList;
    private Context context;

    public ContentAdapter(List<Deviation> contentList, Context context){
        this.deviationList = contentList;
        this.context = context;
    }

    @Override
    public int getCount() {
       return deviationList.size();
    }

    @Override
    public Deviation getItem(int position) {
        return deviationList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup viewGroup) {
        ContentViewHolder view;
        if(convertView == null) {
            view = ContentViewHolder_.build(context);
        }
        else {
            view = (ContentViewHolder) convertView;
        }
        view.setContent(getItem(position));
        return view;
    }
}
