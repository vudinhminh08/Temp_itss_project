package macphu.Models;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

public class DockModel {
    private SimpleIntegerProperty dockId;
    private SimpleStringProperty dockName;
    private SimpleStringProperty dockAddress;
    private SimpleIntegerProperty dockCapacity;
    private SimpleIntegerProperty dockAvailable;

    public DockModel(int dockId, String dockName, String dockAddress, int dockCapacity,int dockAvailable) {
        this.dockId = new SimpleIntegerProperty(dockId);
        this.dockName = new SimpleStringProperty(dockName);
        this.dockAddress = new SimpleStringProperty(dockAddress);
        this.dockCapacity = new SimpleIntegerProperty(dockCapacity);
        this.dockAvailable = new SimpleIntegerProperty(dockAvailable);
    }

    public int getDockId() {
        return dockId.get();
    }

    public void setDockId(int dockId) {
        this.dockId = new SimpleIntegerProperty(dockId);
    }

    public String getDockName() {
        return dockName.get();
    }

    public void setDockName(String dockName) {
        this.dockName = new SimpleStringProperty(dockName);
    }

    public String getDockAddress() {
        return dockAddress.get();
    }

    public void setDockAddress(String dockAddress) {
        this.dockAddress = new SimpleStringProperty(dockAddress);
    }

    public int getDockCapacity() {
        return dockCapacity.get();
    }

    public void setDockCapacity(int dockCapacity) {
        this.dockCapacity = new SimpleIntegerProperty(dockCapacity);
    }

    public int getDockAvailable() {
        return dockAvailable.get();
    }

    public void setDockAvailable(int dockAvailable) {
        this.dockAvailable = new SimpleIntegerProperty(dockAvailable);
    }

}
