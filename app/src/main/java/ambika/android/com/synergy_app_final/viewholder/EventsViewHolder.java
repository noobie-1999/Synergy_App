package ambika.android.com.synergy_app_final.viewholder;

import android.view.View;
import android.widget.TextView;

import com.thoughtbot.expandablerecyclerview.viewholders.ChildViewHolder;

import ambika.android.com.synergy_app_final.R;

public class EventsViewHolder extends ChildViewHolder {
    private TextView eventnames;
    public EventsViewHolder(View itemView) {
        super(itemView);
        eventnames = (TextView) itemView.findViewById(R.id.event_list);
    }
    public void setEventName(String name){
        eventnames.setText(name);
    }
}
