import java.util.ArrayList;
import java.util.List;

public class ChainYutube {
    // dans notre code observe = abonné
    // La liste des abonnés sur la chsine yutube
    private List<Observer> observers = new ArrayList<>();

    public List<Observer> getObserves(){
        return observers;
    }
    public void setObserves(List<Observer> observes){
        this.observers = observes;
    }
    // Ajouter un abonné a la liste de la chaine
    public void ajouterObserver(Observer o){
        observers.add(o);
    }
    // Retire un abonné de la liste
    public void retirerObserver(Observer o){
        observers.remove(o);
    }
    // Notifier un message a l'abonné
    public void notifier(String message){
        for (Observer o : observers){
            o.update(message);
        }
    }
}
