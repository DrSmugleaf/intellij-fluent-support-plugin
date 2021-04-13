package com.github.drsmugleaf.intellijfluentsupportplugin.services;

import com.intellij.openapi.project.Project;

/**
 * Created by DrSmugleaf on 05/04/2021
 */
public class FluentProjectService {
    public FluentProjectService(Project project) {
        System.out.println(project.getName());
    }
}
