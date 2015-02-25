package com.malec.letsmodreboot.init;

import com.malec.letsmodreboot.block.BlockFlag;
import com.malec.letsmodreboot.block.BlockLMRB;
import com.malec.letsmodreboot.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

/**
 * Created by Malec on 23/02/2015.
 */

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModBlocks
{
    public final static BlockLMRB flag = new BlockFlag();

    public static void init()
    {
        GameRegistry.registerBlock(flag, "flag");
    }
}
