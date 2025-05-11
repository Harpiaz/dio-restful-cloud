package dev.harpiaz.dio_restful_cloud.model;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Entity
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String description;
    private LocalDateTime scheduledBeginDate;
    private LocalDateTime scheduledEndDate;
    private TaskStatus status;

    public Task(String title, String description, LocalDateTime scheduledBeginDate, LocalDateTime scheduledEndDate) {
        this.title = title;
        this.description = description;
        this.scheduledBeginDate = scheduledBeginDate;
        this.scheduledEndDate = scheduledEndDate;
        this.status = TaskStatus.PENDING;
    }
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDateTime getScheduledBeginDate() {
        return scheduledBeginDate;
    }

    public void setScheduledBeginDate(LocalDateTime scheduledBeginDate) {
        this.scheduledBeginDate = scheduledBeginDate;
    }

    public LocalDateTime getScheduledEndDate() {
        return scheduledEndDate;
    }

    public void setScheduledEndDate(LocalDateTime scheduledEndDate) {
        this.scheduledEndDate = scheduledEndDate;
    }

    public TaskStatus getStatus() {
        return status;
    }

    public void setStatus(TaskStatus status) {
        this.status = status;
    }
}
