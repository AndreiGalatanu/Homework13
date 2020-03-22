package ro.fasttrackit.mvnbase;

import java.util.ArrayList;

import java.util.List;
import java.util.Objects;

public class DaySchedule {
    private final Days days;
    private final List<String> activities;

    public DaySchedule(Days days) {
        this.days = days;
        this.activities = new ArrayList<>();
    }

    public DaySchedule(Days days, ArrayList<String> activities) {
        this.days = days;
        this.activities = new ArrayList<>();
    }


    public Days getDays() {
        return days;
    }

    public void addActivity(String activity) {

        activities.add(activity);
    }


    public void removeActivity(String activity) {
        activities.remove(activity);
    }

    public List<String> getActivities() {

        return new ArrayList<>(activities);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DaySchedule that = (DaySchedule) o;
        return days == that.days &&
                Objects.equals(activities, that.activities);
    }

    @Override
    public int hashCode() {
        return Objects.hash(days, activities);
    }

    @Override
    public String toString() {
        return "DaySchedule{" +
                "days=" + days +
                ", activities=" + activities +
                '}';
    }
}
