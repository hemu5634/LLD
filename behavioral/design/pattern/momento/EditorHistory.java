package behavioral.design.pattern.momento;

import java.util.Stack;

public class EditorHistory {
    private Stack<Momento> history;
    public EditorHistory(){
        history = new Stack<>();
    }
    public void save(Momento momento){
        history.push(momento);
    }
    public Momento retrieve(){
        if(!history.isEmpty()){
            return history.pop();
        }
        return null;
    }
}
