package ambika.android.com.synergy_app_final.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.thoughtbot.expandablerecyclerview.ExpandableRecyclerViewAdapter;
import com.thoughtbot.expandablerecyclerview.models.ExpandableGroup;

import java.util.List;

import ambika.android.com.synergy_app_final.Models.Events;
import ambika.android.com.synergy_app_final.R;
import ambika.android.com.synergy_app_final.viewholder.ComboViewHolder;
import ambika.android.com.synergy_app_final.viewholder.EventsViewHolder;

public class ComboAdapter extends ExpandableRecyclerViewAdapter<ComboViewHolder,EventsViewHolder> {
    private Context mcontext;
    public ComboAdapter(List<? extends ExpandableGroup> groups) {
        super(groups);
    }

    @Override
    public ComboViewHolder onCreateGroupViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item_event,parent,false);
        return new ComboViewHolder(view);
    }

    @Override
    public EventsViewHolder onCreateChildViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_items,parent,false);
        return new EventsViewHolder(view);
    }

    @Override
    public void onBindChildViewHolder(EventsViewHolder holder, int flatPosition, ExpandableGroup group, int childIndex) {
        Events event =(Events) group.getItems().get(childIndex);
        holder.setEventName(event.getName());

    }

    @Override
    public void onBindGroupViewHolder(ComboViewHolder holder, int flatPosition, ExpandableGroup group) {
        holder.setComboName(group.getTitle());

    }
}
