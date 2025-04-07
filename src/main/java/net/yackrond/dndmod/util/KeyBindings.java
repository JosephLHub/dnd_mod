package net.yackrond.dndmod.util;

import com.mojang.blaze3d.platform.InputConstants;
import net.minecraft.client.KeyMapping;
import net.minecraftforge.client.settings.KeyConflictContext;
import org.lwjgl.glfw.GLFW;

public class KeyBindings {
    public static final String KEY_CATEGORY_DND = "key.category.dndmod.dnd";
    public static final String KEY_CAST_SPELL = "key.dndmod.cast_spell";

    public static final KeyMapping CASTING_KEY = new KeyMapping(KEY_CAST_SPELL, KeyConflictContext.IN_GAME, InputConstants.Type.KEYSYM, GLFW.GLFW_KEY_O, KEY_CATEGORY_DND);

}
