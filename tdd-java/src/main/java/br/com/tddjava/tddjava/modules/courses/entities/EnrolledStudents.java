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
@Table(name = "enrolledstudents")

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EnrolledStudents {
   
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private UUID id;

  private Date registrationDate;
    
}
