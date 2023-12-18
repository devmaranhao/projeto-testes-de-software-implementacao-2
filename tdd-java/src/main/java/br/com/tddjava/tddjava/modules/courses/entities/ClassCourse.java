package br.com.tddjava.tddjava.modules.courses.entities;

import java.sql.Date;
import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "classescourses")

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ClassCourse {
   
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private UUID id;

  private String local;

  private int vacancies;

  private int availableVacancies;

  private Date startClasses;
  
  private Date endOfClasses;

  private Date startEnrollment;

  private Date endRegistrations;

}
