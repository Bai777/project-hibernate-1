package com.game.entity;

import javax.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@NamedQuery(name = "playerGetAllCount", query = "select count(pl) from Player AS pl")
@Table(schema = "rpg", name = "player")
public class Player {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private Long id;

    @Column(length = 12, nullable = false)
    private String name;

    @Column(length = 30, nullable = false)
    private String title;

    @Enumerated(EnumType.ORDINAL)
    private Race race;

    @Enumerated(EnumType.ORDINAL)
    private Profession profession;

    @Column(nullable = false)
    private Date birthday;

    @Column(nullable = false)
    private Boolean banned;

    @Column(nullable = false)
    private Integer level;
}