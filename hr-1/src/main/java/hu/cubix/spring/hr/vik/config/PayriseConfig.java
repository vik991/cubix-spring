package hu.cubix.spring.hr.vik.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@ConfigurationProperties(prefix = "payrise")
@Component
public class PayriseConfig {

            private int lowerLimit;
            private int higherLimit;
            private int percent;


    public int getLowerLimit() {
        return lowerLimit;
    }

    public void setLowerLimit(int lowerLimit) {
        this.lowerLimit = lowerLimit;
    }

    public int getHigherLimit() {
        return higherLimit;
    }

    public void setHigherLimit(int higherLimit) {
        this.higherLimit = higherLimit;
    }

    public int getPercent() {
        return percent;
    }

    public void setPercent(int percent) {
        this.percent = percent;
    }
}
