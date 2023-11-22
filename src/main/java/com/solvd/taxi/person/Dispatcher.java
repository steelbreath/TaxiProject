package com.solvd.taxi.person;

import com.solvd.taxi.observer.LocationSubject;
import com.solvd.taxi.observer.Observer;
import com.solvd.taxi.observer.Subject;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Dispatcher extends Employee implements Observer {

    private static Logger logger = LogManager.getLogger(Dispatcher.class);
    private LocationSubject taxi;
    private String kindOfProblem;
    private boolean busy;

    public Dispatcher() {}

    public Dispatcher(Builder builder) {
        super(builder.fullName, builder.city, builder.experience, builder.salary);
        this.taxi = builder.taxi;
        taxi.registerObserver(this);
        this.kindOfProblem = builder.kindOfProblem;
        this.busy = builder.busy;
    }

    public String getKindOfProblem() {
        return kindOfProblem;
    }
    public boolean isBusy() {
        return busy;
    }
    public static Builder builder(){
        return new Builder();
    }
    @Override
    public String toString() {
        return "Dispatchers{" +
                "kindOfProblem='" + kindOfProblem + '\'' +
                ", busy=" + busy +
                "} " + super.toString();
    }

    @Override
    public void update() {
        logger.info("Dispatcher get car location! x:{},y:{}.",taxi.getX(),taxi.getY());
    }

    public static class Builder {
        private String fullName;
        private String city;
        private int experience;
        private int salary;
        private LocationSubject taxi;
        private String kindOfProblem;
        private boolean busy;

        public Builder setFullName(String fullName) {
            this.fullName = fullName;
            return this;
        }

        public Builder setCity(String city) {
            this.city = city;
            return this;
        }

        public Builder setExperience(int experience) {
            this.experience = experience;
            return this;
        }

        public Builder setSalary(int salary) {
            this.salary = salary;
            return this;
        }

        public Builder setTaxi(LocationSubject taxi) {
            this.taxi = taxi;
            return this;
        }

        public Builder setKindOfProblem(String kindOfProblem) {
            this.kindOfProblem = kindOfProblem;
            return this;
        }

        public Builder setBusy(boolean busy) {
            this.busy = busy;
            return this;
        }

        public Dispatcher build() {
            return new Dispatcher(this);
        }
    }
}
