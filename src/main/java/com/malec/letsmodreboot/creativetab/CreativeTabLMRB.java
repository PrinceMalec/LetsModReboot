package com.malec.letsmodreboot.creativetab;

import com.malec.letsmodreboot.init.ModItems;
import com.malec.letsmodreboot.reference.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

/**
 * Created by Malec on 23/02/2015.
 */
public class CreativeTabLMRB
{

    public static final CreativeTabs LMRB_TAB = new CreativeTabs(Reference.MOD_ID.toLowerCase())
    {

        @Override
        public Item getTabIconItem()
        {
            return ModItems.mapleLeaf;
        }


    };


}
