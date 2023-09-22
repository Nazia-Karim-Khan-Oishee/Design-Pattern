package org.example;

class GradingOnAssignment implements GradingStrategy {

    @Override
    public String viewgrade() {
        return "Your grade for assignment is A+";
    }
}
