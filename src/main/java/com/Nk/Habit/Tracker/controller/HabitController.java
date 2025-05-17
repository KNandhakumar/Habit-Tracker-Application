package com.Nk.Habit.Tracker.controller;

import com.Nk.Habit.Tracker.model.Habit;
import com.Nk.Habit.Tracker.repository.HabitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

// it will not give the cors error while programming running
@CrossOrigin(origins = "http://localhost:4200")
@RestController // it is main controller to tell our browser
@RequestMapping("/api/habits") // it is url path to our browser
public class HabitController {
    // we can use without initialization
    @Autowired
    private HabitRepository habitRepository;

    // add habit
    @PostMapping
    public Habit addHabit(@RequestBody Habit habit){
        return habitRepository.save(habit);
    }

    // get all habits
    @GetMapping
    public List<Habit> getAllHabits(){
        return habitRepository.findAll();
    }

    // update habit
    @PutMapping("/{id}")
    public Habit updateHabit(@PathVariable Long id,@RequestBody Habit habit){
        Habit existing = habitRepository.findById(id).orElseThrow();
        existing.setName(habit.getName());
        existing.setDescription(habit.getDescription());
        existing.setCompleted(habit.getCompleted());
        return habitRepository.save(existing);
    }
}
