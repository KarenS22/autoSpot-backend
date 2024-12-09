package idao;

import java.util.List;
import models.Schedule;

public interface IScheduleDAO {
    public void updateSchedule(Schedule schedule);
    public Schedule readSchedule (String day);
    public List<Schedule> listSchedules ();
    
}
