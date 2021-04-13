package com.github.drsmugleaf.intellijfluentsupportplugin.listeners;

import com.github.drsmugleaf.intellijfluentsupportplugin.services.FluentProjectService;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.project.ProjectManagerListener;
import org.jetbrains.annotations.NotNull;

/**
 * Created by DrSmugleaf on 05/04/2021
 */
public class FluentManagerListener implements ProjectManagerListener {
    @Override
    public void projectOpened(@NotNull Project project) {
        project.getService(FluentProjectService.class);
    }
}
