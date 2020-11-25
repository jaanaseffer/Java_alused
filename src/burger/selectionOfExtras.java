package burger;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class selectionOfExtras {
    private List<Extra> extras;

    public selectionOfExtras(Extra extra1, Extra extra2, Extra extra3, Extra extra4) {
        extras = new ArrayList<Extra>();
        Collections.addAll(extras, extra1, extra2, extra3, extra4);
    }

    public List<Extra> getExtras() {
        return extras;
    }
}
