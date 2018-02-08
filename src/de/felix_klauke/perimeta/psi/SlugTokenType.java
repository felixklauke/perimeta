package de.felix_klauke.perimeta.psi;

import com.intellij.psi.tree.IElementType;
import de.felix_klauke.perimeta.SlugLanguage;
import org.jetbrains.annotations.NotNull;

/**
 * @author Felix Klauke <fklauke@itemis.de>
 */
public class SlugTokenType extends IElementType {

    public SlugTokenType(@NotNull String debugName) {
        super(debugName, SlugLanguage.INSTANCE);
    }

    @Override
    public String toString() {
        return "SlugTokenType{ " + super.toString() + " }";
    }
}
