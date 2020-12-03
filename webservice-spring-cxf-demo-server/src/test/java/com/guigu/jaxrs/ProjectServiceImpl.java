package com.guigu.jaxrs;

import org.springframework.web.bind.annotation.PathVariable;

import javax.ws.rs.Path;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by Administrator on 2017/4/11.
 */
@Path("/project")
public class ProjectServiceImpl implements ProjectService{

    private static final Map<String,Project> projects=new ConcurrentHashMap<String,Project>();
    static {
        projects.put("1",new Project("1","测试","描述"));
        projects.put("2",new Project("2","测试2","描述2"));
        projects.put("3",new Project("3","测试3","描述3"));
        projects.put("4",new Project("4","测试4","描述4"));
    }

    @Override
    public List<Project> getAllProject() {
        System.out.println("getAllProject");
        Collection<Project> projects = ProjectServiceImpl.projects.values();
        ArrayList<Project> arrayList = new ArrayList<>();
        arrayList.addAll(projects);
        return arrayList;
    }

    @Override
    public Project getProject(@PathVariable String projectId) {
        System.out.println("getProject");
        Project project = ProjectServiceImpl.projects.get(projectId);
        return project;
    }

    @Override
    public void addProject(Project project) {
        System.out.println("addProject");
        ProjectServiceImpl.projects.put(project.getProjectId(),project);
    }

    @Override
    public void updateProject(Project project) {
        System.out.println("updateProject");
        addProject(project);
    }

    @Override
    public void deleteProject(@PathVariable String projectId) {
        System.out.println("deleteProject");
        ProjectServiceImpl.projects.remove(projectId);
    }
}
