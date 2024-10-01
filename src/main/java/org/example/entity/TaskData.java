package org.example.entity;

import java.util.HashSet;
import java.util.Set;

public class TaskData {
    private Set<Task> annsTasks;
    private Set<Task> bobsTasks;
    private Set<Task> carolsTasks;
    private Set<Task> unassignedTasks;
    private Set<Task> all;

    public TaskData(Set<Task> annsTasks, Set<Task> bobsTasks, Set<Task> carolsTasks, Set<Task> unassignedTasks) {
        this.annsTasks = annsTasks;
        this.bobsTasks = bobsTasks;
        this.carolsTasks = carolsTasks;
        this.unassignedTasks = unassignedTasks;
    }


    public Set<Task> getUnion(Set<Task>a,Set<Task>b){
       Set<Task> x = new HashSet<>(a);
       x.addAll(b);
       return x;

    }

    public Set<Task> getIntersection(Set<Task>a,Set<Task>b){
        Set<Task> x = new HashSet<>(a);
        x.retainAll(b);
        return x;
    }

    public Set<Task> getDifferences(Set<Task>a,Set<Task>b){
        Set<Task> x = new HashSet<>(a);
        x.removeAll(b);
        return x;
    }

    public Set<Task> getTasks(String name){
        switch (name) {
            case "ann" -> {
                return annsTasks;
            }
            case "bob" -> {
                return bobsTasks;
            }
            case "carol" -> {
                return carolsTasks;
            }
            case "all" -> {
                all.addAll(annsTasks);
                all.addAll(bobsTasks);
                all.addAll(carolsTasks);
                all.addAll(unassignedTasks);
                return all;
            }
            default -> {
                return null;
            }
        }

    }
}
