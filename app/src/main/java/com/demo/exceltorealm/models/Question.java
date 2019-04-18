package com.demo.exceltorealm.models;

import io.realm.RealmList;
import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;
import io.realm.annotations.Required;

/**
 * Created by christopher on 22.03.2016.
 */
public class Question extends RealmObject {

    @PrimaryKey
    private int id;
    @Required
    private String hint;
    @Required
    private String text;
    private int weight;
    private int history;

    private RealmList<Answer> answers;

    public Question() {
        this.answers = new RealmList<Answer>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getHint() {
        return hint;
    }

    public void setHint(String hint) {
        this.hint = hint;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getHistory() {
        return history;
    }

    public void setHistory(int history) {
        this.history = history;
    }

    public RealmList<Answer> getAnswers() {
        return answers;
    }

    public void setAnswers(RealmList<Answer> answers) {
        this.answers = answers;
    }
}
