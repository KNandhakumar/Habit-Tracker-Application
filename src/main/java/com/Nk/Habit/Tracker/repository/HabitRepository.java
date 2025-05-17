package com.Nk.Habit.Tracker.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.Nk.Habit.Tracker.model.Habit;

// it is use for crud operations without writing any sql query
public interface HabitRepository extends JpaRepository<Habit,Long> {

}
