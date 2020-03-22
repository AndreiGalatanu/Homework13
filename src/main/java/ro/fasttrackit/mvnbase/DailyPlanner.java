package ro.fasttrackit.mvnbase;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DailyPlanner {
    private List<DaySchedule> schedules = new ArrayList<>();


    public List<DaySchedule> getSchedules() {
        return schedules;
    }


    public Map<Days, List<String>> endPlanning() throws NoActivityForDayException {

        Map<Days, List<String>> result = new HashMap<>();
        for (DaySchedule schedule : schedules) {
            result.put(schedule.getDays(), schedule.getActivities());
        }
        if (result.keySet().size() < Days.values().length) {
            throw new NoActivityForDayException("No activities for day exceptions");
        }
        return result;
    }


    public void addActivity(Days day, String activity) {
        if (activity == null) {
            throw new NoActivityException("There's no activity !");
        }
        DaySchedule daySchedule = findDaySchedule(day);
        if (daySchedule == null) {
            daySchedule = new DaySchedule(day);
            schedules.add(daySchedule);
        }
        daySchedule.addActivity(activity);
    }

    public List<String> getActivities(Days day) {
        DaySchedule schedule = findDaySchedule(day);
        if (schedule == null) {
            return List.of();

        } else {
            return schedule.getActivities();
        }
    }

    public void removeActivity(Days day, String activity) {
        DaySchedule daySchedule = findDaySchedule(day);
        if (daySchedule == null) {
            throw new NoActivityException("There's no " + day);
        }
        daySchedule.removeActivity(activity);
    }

    private DaySchedule findDaySchedule(Days day) {
        for (DaySchedule schedule : schedules) {
            if (schedule.getDays().equals(day)) {
                return schedule;
            }
        }

        return null;
    }
}
