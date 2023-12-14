package edu.nyu.cs.assignment7;

import java.util.ArrayList;

public class Sentence extends OrderedThing implements SequentiallyOrdered {
    private ArrayList<OrderedThing> words;
    private int position;

    public Sentence(String sentence) {
        String[] word = sentence.split("[^\\w']+");
        for (int i = 0; i < word.length; i++) {
            words.add(word[i], i);
        }
    }

    public OrderedThing getFirst() {
        return words.get(0);
    }

    public OrderedThing getLast() {
        return words.get(words.size() - 1);
    }

    public ArrayList<OrderedThing> getSequence() {
        ArrayList<OrderedThing> sequence = new ArrayList<>();
        sequence.addAll(words);
        return sequence;
    }
}
