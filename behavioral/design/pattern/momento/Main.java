package behavioral.design.pattern.momento;

public class Main {
    public static void main(String[] args) {
        TextEditor editor = new TextEditor();
        EditorHistory history = new EditorHistory();
        editor.setText("Hello");
        System.out.println(editor.getText());
        history.save(editor.save());
        editor.setText("Hello World");
        System.out.println(editor.getText());
        history.save(editor.save());
        editor.restore(history.retrieve());
        System.out.println(editor.getText());
    }
}
