package com.example.busschedule.database.schedule

import androidx.annotation.NonNull
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName="schedule") //optional
data class Schedule(
    @PrimaryKey val id:Int,     //This tells Room to treat this property as the primary key
    @NonNull @ColumnInfo(name = "stop_name") val stopName: String,      // to specify a name for the column
    @NonNull @ColumnInfo(name = "arrival_time") val arrivalTime: Int
)