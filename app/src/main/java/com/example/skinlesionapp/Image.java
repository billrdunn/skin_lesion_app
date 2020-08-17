package com.example.skinlesionapp;

public class Image {
    private int id;
    private String classification;
    private String examination;
    private int patientId;
    private String imageURL;
    private String shortDesc;
    private String longDesc;
    private boolean isExpanded;

    public Image(int id, String classification, String examination, int patientId, String imageURL, String shortDesc, String longDesc) {
        this.id = id;
        this.classification = classification;
        this.examination = examination;
        this.patientId = patientId;
        this.imageURL = imageURL;
        this.shortDesc = shortDesc;
        this.longDesc = longDesc;
        isExpanded = false;
    }

    public boolean isExpanded() {
        return isExpanded;
    }

    public void setExpanded(boolean expanded) {
        isExpanded = expanded;
    }

    @Override
    public String toString() {
        return "Image{" +
                "id=" + id +
                ", classification='" + classification + '\'' +
                ", examination='" + examination + '\'' +
                ", patientId=" + patientId +
                ", imageURL='" + imageURL + '\'' +
                ", shortDesc='" + shortDesc + '\'' +
                ", longDesc='" + longDesc + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getClassification() {
        return classification;
    }

    public void setClassification(String classification) {
        this.classification = classification;
    }

    public String getExamination() {
        return examination;
    }

    public void setExamination(String examination) {
        this.examination = examination;
    }

    public int getPatientId() {
        return patientId;
    }

    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }

    public String getImageURL() {
        return imageURL;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }

    public String getShortDesc() {
        return shortDesc;
    }

    public void setShortDesc(String shortDesc) {
        this.shortDesc = shortDesc;
    }

    public String getLongDesc() {
        return longDesc;
    }

    public void setLongDesc(String longDesc) {
        this.longDesc = longDesc;
    }
}
