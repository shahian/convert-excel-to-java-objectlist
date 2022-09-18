package com.shahian.convertexceltojavaobjectlist.entity;

import com.poiji.annotation.ExcelCellName;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@Table(name = "groups")
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Group {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "group_id")
    private Long id;
    @Column(name = "title")
    @ExcelCellName( "title")
    private String title;

    @Column(name = "description")
    @ExcelCellName("description")
    private String description;

    public Group(String title, String description) {
        this.title = title;
        this.description = description;
    }
}

