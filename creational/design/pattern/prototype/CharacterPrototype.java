package creational.design.pattern.prototype;

public class CharacterPrototype {
    private Character prototype;

    public CharacterPrototype(){
        prototype = new Character("DefaultName",100,1,1);
    }

    public Character createCharacterWithNewName(String name) throws CloneNotSupportedException{
        Character character = prototype.clone();
        return new Character(name,character.getHealth(),character.getLevel(), character.getPower());
    }
    public Character createCharacterWithNewLevel(int level) throws CloneNotSupportedException{
        Character character = prototype.clone();
        return new Character(character.getName(), character.getHealth(),level, character.getPower());
    }
    public Character createCharacterWithNewHealth(int health) throws CloneNotSupportedException{
        Character character = prototype.clone();
        return new Character(character.getName(), health,character.getLevel(), character.getPower());
    }
    public Character createCharacterWithNewPower(int power) throws CloneNotSupportedException{
        Character character = prototype.clone();
        return new Character(character.getName(), character.getHealth(),character.getLevel(), power);
    }
}
