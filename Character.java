package edu.nyu.cs.assignment7;

public class Character extends OrderedThing {
    private char character;
    private int position;

    public Character(char character, int position) {
        this.character = character;
        this.position = position;
    }

    public int getPosition() {
        return this.position;
    }

    public char getCharacter() {
        return this.character;
    }

}
