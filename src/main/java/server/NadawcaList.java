package server;

import java.util.ArrayList;
import java.util.List;

public class NadawcaList {
    private List<Nadawca> nadawcy;


    public NadawcaList(){
        nadawcy = new ArrayList<>();
    }
    public NadawcaList(List<Nadawca> nadawcy) {
        this.nadawcy = nadawcy;
    }


    public List<Nadawca> getNadawcy() {
        return nadawcy;
    }
    public void setNadawcy(List<Nadawca> nadawcy) {
        this.nadawcy = nadawcy;
    }
}
