package com.zipcodewilmington.froilansfarm.DailyTasks;


import java.time.temporal.Temporal;
import java.time.temporal.TemporalAccessor;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalField;

public class Enum<DayOfWeek> implements TemporalAccessor, TemporalAdjuster {



    @Override
    public boolean isSupported(TemporalField field) {
        return false;
    }

    @Override
    public long getLong(TemporalField field) {
        return 0;
    }

    @Override
    public Temporal adjustInto(Temporal temporal) {
        return null;
    }
}
