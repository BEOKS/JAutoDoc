package com.beoks.jautodocs;

import static org.gradle.internal.impldep.org.junit.Assert.assertNotNull;

import org.gradle.api.Project;
import org.gradle.api.Task;
import org.gradle.testfixtures.ProjectBuilder;
import org.junit.jupiter.api.Test;


class JAutoDocsPluginTest {

    @Test
    void jAutoDocsPluginAddHelloTasks() {
        Project project= ProjectBuilder.builder().build();
        project.getPluginManager().apply("com.beoks.jautodocs");
        assertNotNull(project.getTasks().getByName("hello") );
    }

    @Test
    void checkTaskExecution() {
        Project project= ProjectBuilder.builder().build();
        project.getPluginManager().apply("com.beoks.jautodocs");
        Task task = project.getTasks().getByName("hello");
        assertNotNull(task);
        task.getActions().forEach(action -> action.execute(task));
    }

}
