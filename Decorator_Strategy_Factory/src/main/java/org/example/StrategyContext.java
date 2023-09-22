package org.example;

public class StrategyContext {

    GradingStrategy gradingStrategy;

    void SetStrategy(GradingStrategy strategy)
    {
        this.gradingStrategy=strategy;
    }

    String getGrade()
    {
        return gradingStrategy.viewgrade();

    }
}
