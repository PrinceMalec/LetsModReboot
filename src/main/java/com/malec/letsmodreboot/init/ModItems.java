package com.malec.letsmodreboot.init;

import com.malec.letsmodreboot.item.ItemLMRB;
import com.malec.letsmodreboot.item.ItemMapleLeaf;
import com.malec.letsmodreboot.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

/**
 * Created by Malec on 23/02/2015.
 */
@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModItems
{
    public static final ItemLMRB mapleLeaf = new ItemMapleLeaf();

    public static void init()
    {
        GameRegistry.registerItem(mapleLeaf, "mapleLeaf");
    }

}
