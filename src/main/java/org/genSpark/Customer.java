package org.genSpark;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


@Component
public class Customer {

    @Value("#{10}")
    public int credits;
    @Value("#{0}")
    public int score;


    // public Customer()
    // {
    //     this.credits = 10;
    //     this.score = 0;
    // }

    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }



    public void spend()
    {
        // 10-15 BUSINESS LOGIC
        this.setCredits(this.getCredits()-1);
        this.setScore(this.getScore()+1);

    }
    public void log()
    {
        // 10-15 BUSINESS LOGIC
        System.out.println("CREDITS: " + this.getCredits());
        System.out.println("SCORE: " + this.getScore());

    }


}
