package com.demo.exceltorealm.models;

import io.realm.RealmObject;
import io.realm.annotations.Ignore;
import io.realm.annotations.Index;
import io.realm.annotations.PrimaryKey;
import io.realm.annotations.Required;

/**
 * Created by christopher on 22.03.2016.
 */
public class Result extends RealmObject {


    @PrimaryKey
    @Required
    private String uuid;
    @Required
    @Index
    private String typeKey;
    @Required
    @Index
    private String subTypeKey;
    private int questionCount;
    private int correctQuestionCount;
    private int totalScore;
    private int correctScore;
    private long startInMs;
    private long endInMs;

    @Ignore
    private int resultCount;
    @Ignore
    private String resultKey;

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public long getEndInMs() {
        return endInMs;
    }

    public void setEndInMs(long endInMs) {
        this.endInMs = endInMs;
    }

    public String getTypeKey() {
        return typeKey;
    }

    public void setTypeKey(String typeKey) {
        this.typeKey = typeKey;
    }

    public String getSubTypeKey() {
        return subTypeKey;
    }

    public void setSubTypeKey(String subTypeKey) {
        this.subTypeKey = subTypeKey;
    }

    public int getQuestionCount() {
        return questionCount;
    }

    public void setQuestionCount(int questionCount) {
        this.questionCount = questionCount;
    }

    public int getCorrectQuestionCount() {
        return correctQuestionCount;
    }

    public void setCorrectQuestionCount(int correctQuestionCount) {
        this.correctQuestionCount = correctQuestionCount;
    }

    public int getTotalScore() {
        return totalScore;
    }

    public void setTotalScore(int totalScore) {
        this.totalScore = totalScore;
    }

    public int getCorrectScore() {
        return correctScore;
    }

    public void setCorrectScore(int correctScore) {
        this.correctScore = correctScore;
    }

    public long getStartInMs() {
        return startInMs;
    }

    public void setStartInMs(long startInMs) {
        this.startInMs = startInMs;
    }

    public int getResultCount() {
        return resultCount;
    }

    public void setResultCount(int resultCount) {
        this.resultCount = resultCount;
    }

    public String getResultKey() {
        return resultKey;
    }

    public void setResultKey(String resultKey) {
        this.resultKey = resultKey;
    }
}
