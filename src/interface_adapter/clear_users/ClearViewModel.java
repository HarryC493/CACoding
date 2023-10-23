package interface_adapter.clear_users;

// TODO Complete me
import interface_adapter.ViewModel;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

import interface_adapter.ViewModel;
import interface_adapter.login.LoginState;

public class ClearViewModel extends ViewModel {
    private ClearState state = new ClearState();

    private final PropertyChangeSupport support = new PropertyChangeSupport(this);

    public ClearViewModel() {
        super("Clear Users");
    }

    public void setState(ClearState state) {
        this.state = state;
    }
    public void firePropertyChanged() {
        support.firePropertyChange("state", null, this.state);
    }
    public void addPropertyChangeListener(PropertyChangeListener listener) {
        support.addPropertyChangeListener(listener);
    }
    public ClearState getState() {
        return state;
    }
}
