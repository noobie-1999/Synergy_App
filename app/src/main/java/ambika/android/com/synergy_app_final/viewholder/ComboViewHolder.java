package ambika.android.com.synergy_app_final.viewholder;
import android.view.View;
import android.widget.TextView;

import com.thoughtbot.expandablerecyclerview.viewholders.GroupViewHolder;

import ambika.android.com.synergy_app_final.R;

public class ComboViewHolder extends GroupViewHolder {
    private TextView combotext;
    public ComboViewHolder(View itemView) {
        super(itemView);
        combotext = (TextView) itemView.findViewById(R.id.combo);

    }

    public void setComboName(String name){
        combotext.setText(name);
    }
}
