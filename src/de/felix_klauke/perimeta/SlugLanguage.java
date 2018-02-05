package de.felix_klauke.perimeta;

import com.intellij.lang.Language;

/**
 * @author Felix Klauke <fklauke@itemis.de>
 */
public class SlugLanguage extends Language {

    /**
     * The singleton instance.
     */
    public static final SlugLanguage INSTANCE = new SlugLanguage();

    protected SlugLanguage() {
        super("Slug");
    }
}
