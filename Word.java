package edu.nyu.cs.assignment7;

import java.util.ArrayList;

public class Word extends OrderedThing implements SequentiallyOrdered {
    private ArrayList<Character> chars;
    private int position;

    public Word(String word, int position) {
        this.chars = new ArrayList<>();
        this.position = position;
        for (int i = 0; i < word.length(); i++) {
            this.chars.add(word.charAt(i), i);
        }
    }

    public OrderedThing getFirst() {
        return this.chars.get(0);
    }

    public OrderedThing getLast() {
        return this.chars.get(this.chars.size() - 1);
    }

    public int getPosition() {
        return this.position;
    }

    public ArrayList<OrderedThing> getSequence() {
        ArrayList<OrderedThing> sequence = new ArrayList<>();
        sequence.addAll(chars);
        return sequence;
    }
}