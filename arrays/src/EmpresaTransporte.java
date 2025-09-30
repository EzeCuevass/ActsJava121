import java.util.ArrayList;
public class EmpresaTransporte {
    private ArrayList<Conductor> listaConductores;

    public EmpresaTransporte() {
        listaConductores = new ArrayList<>();
    }
    public void agregarConductor(Conductor conductor) {
        this.listaConductores.add(conductor);
    }
    public ArrayList<Conductor> getListaConductores() {
        return listaConductores;
    }
}
