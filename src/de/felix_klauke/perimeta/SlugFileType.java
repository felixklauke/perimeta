package de.felix_klauke.perimeta;

import com.intellij.lang.Language;
import com.intellij.openapi.fileTypes.LanguageFileType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

/**The file type providing basic information for file type association.
 *
 *
 * @author Felix Klauke <fklauke@itemis.de>
 */
public class SlugFileType extends LanguageFileType {

    public static final SlugFileType INSTANCE = new SlugFileType();

    private static final String DEFAULT_EXTENSION = "slug";

    protected SlugFileType() {
        super(SlugLanguage.INSTANCE);
    }

    @NotNull
    @Override
    public String getName() {
        return "Slug";
    }

    @NotNull
    @Override
    public String getDescription() {
        return "Slug Language";
    }

    @NotNull
    @Override
    public String getDefaultExtension() {
        return DEFAULT_EXTENSION;
    }

    @Nullable
    @Override
    public Icon getIcon() {
        return null;
    }
}
