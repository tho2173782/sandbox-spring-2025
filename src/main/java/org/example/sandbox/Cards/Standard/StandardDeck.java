package org.example.sandbox.Cards.Standard;

import javax.naming.OperationNotSupportedException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StandardDeck implements Deck {

    List<Card> cards;
    private List<Card> newDeck;

    public StandardDeck() {
        this.cards = newDeck();
    }

    private List<Card> newDeck() {

        List<Card> deck = new ArrayList<>();

        for (Suit suit : Suit.values()) {
            for (FaceValue rank : FaceValue.values()) {
                deck.add(new Card(suit, rank));
            }
        }

        return newDeck;
    }


    @Override
    public void shuffle() {

        Collections.shuffle(this.cards);

    }

    @Override
    public void cut(int index) {

        List<Card> top = this.cards.subList(0, index);
        List<Card> bottom = this.cards.subList(index, this.cards.size());

        this.cards.clear();

        this.cards.addAll(bottom);
        this.cards.addAll(top);
    }

    @Override
    public Card deal() {
        return this.cards.remove(0);
    }

    @Override
    public Card turnOver() {
        return cards.get(0);
    }

    @Override
    public int search(Card card) {
        return cards.indexOf(card);
    }

    @Override
    public void newOrder(Deck cards) {
        cards = (Deck) newDeck();

    }

    @Override
    public Card draw() {
        return this.cards.remove(0);
    }

    @Override
    public int size() {
        return this.cards.size();
    }

    @Override
    public int newSize() throws OperationNotSupportedException {
        return Deck.super.newSize();
    }
}
