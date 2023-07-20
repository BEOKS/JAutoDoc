package com.beoks.jautodocs;

import org.gradle.api.Plugin;
import org.gradle.api.Project;

public class JAutoDocsPlugin implements Plugin<Project> {
    @Override
    public void apply(Project target) {
        target.getTasks().register("hello", task -> {
            task.doLast(t -> {
                System.out.println("hello gradle!!!");
            });
        });
    }
}
