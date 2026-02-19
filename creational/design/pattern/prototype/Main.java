package creational.design.pattern.prototype;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        CharacterPrototype prototype = new CharacterPrototype();
        Character name = prototype.createCharacterWithNewName("johnwick");
        Character power = prototype.createCharacterWithNewPower(100);
        Character health = prototype.createCharacterWithNewHealth(50);
        Character level = prototype.createCharacterWithNewLevel(10);
        List<Character> characters = Arrays.asList(name,power,health,level);
        characters.forEach(System.out::println);
    }
}
