package com.guigu.jaxrs;

import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;

/**
 * Created by Administrator on 2017/4/11.
 */
@XmlRootElement(name="project")
public class Project implements Serializable{
    private String projectId;
    private String projectName;
    private String getProjectDesc;

    public Project() {
    }

    public Project(String projectId, String projectName, String getProjectDesc) {
        this.projectId = projectId;
        this.projectName = projectName;
        this.getProjectDesc = getProjectDesc;
    }

    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getGetProjectDesc() {
        return getProjectDesc;
    }

    public void setGetProjectDesc(String getProjectDesc) {
        this.getProjectDesc = getProjectDesc;
    }

    @Override
    public String toString() {
        return "Project{" +
                "projectId='" + projectId + '\'' +
                ", projectName='" + projectName + '\'' +
                ", getProjectDesc='" + getProjectDesc + '\'' +
                '}';
    }
}
