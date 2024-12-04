package com.ingsaf.bis.system;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDateTime;

@Data
public class dbModel {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    protected long id;

    protected LocalDateTime created_datetime;
    protected LocalDateTime modified_datetime;
    protected String created_by;
    protected String modified_by;
}
