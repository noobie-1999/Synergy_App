package ambika.android.com.synergy_app_final.Models;
import com.thoughtbot.expandablerecyclerview.models.ExpandableGroup;

import java.util.List;


public class Events {
    private String name;

    public Events(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
