package com.codegym.task.task32.task3209;

import javax.swing.filechooser.FileFilter;
import java.io.File;
import java.util.Locale;

public class HTMLFileFilter extends FileFilter {
    @Override
    public boolean accept(File f) {
        if (f.isDirectory()) {
            return true;
        }

        return f.isDirectory() || f.getName().toLowerCase().endsWith(".html") ||
                f.getName().toLowerCase().endsWith(".htm");
    }

    @Override
    public String getDescription() {
        return "HTML and HTM files";
    }
}
