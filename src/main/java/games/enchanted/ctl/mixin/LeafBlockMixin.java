package games.enchanted.ctl.mixin;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.LeavesBlock;
import net.minecraft.block.ShapeContext;
import net.minecraft.block.Waterloggable;
import net.minecraft.state.property.Properties;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;

import org.spongepowered.asm.mixin.Mixin;

@Mixin(LeavesBlock.class)
public class LeafBlockMixin extends Block
		implements Waterloggable {

	public LeafBlockMixin(Settings settings) {
		super(settings);
		this.setDefaultState((BlockState) ((BlockState) ((BlockState) ((BlockState) this.stateManager.getDefaultState())
				.with(Properties.DISTANCE_1_7, 7)).with(Properties.PERSISTENT, false))
				.with(Properties.WATERLOGGED, false));
	}

	@Override
	public VoxelShape getCameraCollisionShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
		return VoxelShapes.empty();
	}
}