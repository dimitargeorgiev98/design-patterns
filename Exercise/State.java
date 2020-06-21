package Exercise;

import javax.naming.Context;

public interface State {
    public void applyState(Context context);
    public String getStateName();
}
