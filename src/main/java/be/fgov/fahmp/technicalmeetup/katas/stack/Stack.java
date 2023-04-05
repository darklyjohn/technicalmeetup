package be.fgov.fahmp.technicalmeetup.katas.stack;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * @author John
 * @created 04-12-22
 * @project technicalmeetup
 */
@Component
public class Stack {

    List<Integer> value;

    public Stack() {
        this.value = new ArrayList<>();
    }

    // Empile une valeur
    public void push(int value){
        this.value.add(value);
    }

    // Récupére la valeur sur le dessus de pile et l’enlève de la pile
    public int pop(){
        return this.value.remove(this.value.size() -1);
    }

    // Récupére la taille de pile
    public int count(){
        return this.value.size();
    }
}
