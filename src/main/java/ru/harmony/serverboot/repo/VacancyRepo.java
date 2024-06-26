package ru.harmony.serverboot.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import ru.harmony.serverboot.entity.Vacancy;

import java.util.ArrayList;
import java.util.List;

public interface VacancyRepo extends JpaRepository<Vacancy, Long> {
    @Query("SELECT fromEmployer FROM Vacancy")
    List<String> findByEmployee();

    //@Query("SELECT workExperience FROM Vacancy")
    List<Vacancy> findByWorkExperience(String workExp);

    List<Vacancy> findByWage(String wage);

    Integer deleteByNameAndSpec_Name(String name, String spec_name);

    List<Vacancy> findByNameAndSpec_Name(String name, String spec);
}
