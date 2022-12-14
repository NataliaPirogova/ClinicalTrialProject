package com.example.clinicaproject.model;

import com.example.clinicaproject.model.enums.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "volunteer_habits_info")
public class VolunteerHabitsInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Enumerated(EnumType.STRING)
    private Smoking smoking;
    @Enumerated(EnumType.STRING)
    private TakingDrugs takingDrugs;
    private boolean takingMedicines;
    private boolean isPregnantNow;
    @Enumerated(EnumType.STRING)
    private PlanningPregnancy isPlanningPregnancy;
    private boolean vegetarian;
    private boolean takingHormonalContraceptives;
    @Enumerated(EnumType.STRING)
    private Sport sport;
    @Enumerated(EnumType.STRING)
    private Alcohol alcohol;
    @OneToOne
    private Volunteer volunteer;
}