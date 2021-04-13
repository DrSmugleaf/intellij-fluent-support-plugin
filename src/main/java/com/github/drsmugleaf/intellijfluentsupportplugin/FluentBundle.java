package com.github.drsmugleaf.intellijfluentsupportplugin;

import com.intellij.AbstractBundle;
import org.jetbrains.annotations.NonNls;

/**
 * Created by DrSmugleaf on 05/04/2021
 */
public class FluentBundle extends AbstractBundle {
    @NonNls
    private static final String BUNDLE = "messages.FluentBundle";

    protected FluentBundle() {
        super(BUNDLE);
    }
}
