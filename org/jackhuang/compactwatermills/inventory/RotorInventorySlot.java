package org.jackhuang.compactwatermills.inventory;

import org.jackhuang.compactwatermills.item.rotors.ItemRotor;
import org.jackhuang.compactwatermills.tileentity.TileEntityInventory;

import net.minecraft.item.ItemStack;

public class RotorInventorySlot extends InventorySlot {

	public RotorInventorySlot(TileEntityInventory base) {
		super(base, "rotor", 0, Access.IO, 1);
	}
	
	@Override
	public boolean accepts(ItemStack itemStack) {
		if (itemStack == null) {
			return false;
		}
		if (itemStack.getItem() instanceof ItemRotor) {
			return true;
		}
		return false;
	}
}