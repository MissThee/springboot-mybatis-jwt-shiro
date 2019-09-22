package com.github.missthee.db.entity.primary.sheet;

import lombok.Data;
import lombok.experimental.Accessors;

import javax.persistence.Column;
import javax.persistence.Table;
import java.util.Date;

@Data
@Table(name = "REPORT_STATION_DATA_CEZ0")
@Accessors(chain = true)
public class ComplexSheetForm {
    private Long id;
    private String reportDate;
    @Column(name = "REPORT_HOUR")
    private String report_hour;
    private Short wsl;
    private Short rql;
    private Short xyl;
    private Short jyl;
    private String bz;
    private Short mark;
    private Date stime;

}