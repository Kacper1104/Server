package server;

import java.util.ArrayList;
import java.util.List;

public class MagazynierList {
    List<Magazynier> magazyniery;

    public MagazynierList(){
        magazyniery = new ArrayList<>();
    }
    public MagazynierList(List<Magazynier> magazyniery){
        this.magazyniery = magazyniery;
    }

    public List<Magazynier> getMagazyniery(){
        return magazyniery;
    }

    public void setMagazyniery(List<Magazynier> magazyniery) {
        this.magazyniery = magazyniery;
    }
}