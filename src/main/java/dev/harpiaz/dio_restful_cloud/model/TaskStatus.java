package dev.harpiaz.dio_restful_cloud.model;

public enum TaskStatus {

    PENDING("Pending"),
    IN_PROGRESS("In Progress"),
    FINISHED("Finished");

    private final String textRepresentation;

    private TaskStatus(String textRepresentation) {
        this.textRepresentation = textRepresentation;
    }

    public String toString() {
         return textRepresentation;
    }

}
