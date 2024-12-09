package com.mynt.isbak_movie.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity //mark class as entity
@Table //defining class name as Table name
@Getter
@Setter
public class Movie {


        @Column //defining id as primary key
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        public Long id;

        @Column
        public String name;

        @Column
        public Integer yearReleased;

        @Column
        public Boolean isSequel;

        @Column
        @ElementCollection
        @CollectionTable
        @Enumerated(EnumType.STRING)
        public List<Genre> genre;

        @Column
        public List<String> casts;


}
